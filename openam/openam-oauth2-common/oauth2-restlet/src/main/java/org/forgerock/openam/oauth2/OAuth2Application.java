/*
 * DO NOT REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2012-2014 ForgeRock AS.
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://forgerock.org/license/CDDLv1.0.html
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at http://forgerock.org/license/CDDLv1.0.html
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions copyright [year] [name of copyright owner]"
 */

package org.forgerock.openam.oauth2;

import org.forgerock.guice.core.InjectorHolder;
import org.forgerock.oauth2.core.OAuth2Constants;
import org.forgerock.oauth2.reslet.GuicedRestlet;
import org.forgerock.openam.oauth2.model.BearerToken;
import org.forgerock.openam.oauth2.openid.UserInfo;
import org.forgerock.openam.oauth2.provider.OAuth2TokenStore;
import org.forgerock.openam.oauth2.utils.OAuth2Utils;
import org.forgerock.restlet.ext.oauth2.consumer.AccessTokenValidator;
import org.forgerock.restlet.ext.oauth2.consumer.BearerTokenVerifier;
import org.forgerock.restlet.ext.oauth2.consumer.OAuth2Authenticator;
import org.forgerock.restlet.ext.oauth2.consumer.TokenVerifier;
import org.forgerock.restlet.ext.oauth2.flow.AuthorizeServerResource;
import org.forgerock.restlet.ext.oauth2.provider.ClientAuthenticationFilter;
import org.forgerock.restlet.ext.oauth2.provider.OAuth2FlowFinder;
import org.forgerock.restlet.ext.oauth2.provider.ValidationServerResource;
import org.restlet.Application;
import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Restlet;
import org.restlet.data.MediaType;
import org.restlet.data.Reference;
import org.restlet.routing.Router;
import org.restlet.security.Verifier;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

/**
 * Sets up the OAuth 2 provider end points and their handlers
 */
public class OAuth2Application extends Application {

    private URI redirectURI = null;

    public OAuth2Application() {
        getMetadataService().setEnabled(true);
        getMetadataService().setDefaultMediaType(MediaType.APPLICATION_JSON);
        setStatusService(new OAuth2StatusService());
    }

    @Override
    public Restlet createInboundRoot() {
        setOAuth2ConfigurationFactory(getContext().getParameters().getFirst("oauth2-configuration-factory-class")
                .getValue());

        Router root = new Router(getContext());

        //default route goes to the flows
        root.attachDefault(activate());

        // Add TokenInfo Resource
        OAuth2Utils.setTokenStore(getTokenStore(), getContext());

        //go to token info endpoint
        root.attach(OAuth2Utils.getTokenInfoPath(getContext()), ValidationServerResource.class);

        //connect client register
        Reference validationServerRef = new Reference(OAuth2Utils.getDeploymentURL(Request.getCurrent())+ "/oauth2" + OAuth2Utils.getTokenInfoPath(getContext()));
        AccessTokenValidator<BearerToken> validator =
                new ValidationServerResource(getContext(), validationServerRef);
        TokenVerifier tokenVerifier = new BearerTokenVerifier(validator);
        OAuth2Authenticator authenticator =
                new OAuth2Authenticator(getContext(), null,
                        OAuth2Utils.ParameterLocation.HTTP_HEADER, tokenVerifier);
        authenticator.setNext(OAuth2ConfigurationFactory.Holder.getConfigurationFactory().getConnectionClientRegistration());
        root.attach("/connect/register", authenticator);

        //connect userinfo
        validationServerRef = new Reference(OAuth2Utils.getDeploymentURL(Request.getCurrent())+ "/oauth2" + OAuth2Utils.getTokenInfoPath(getContext()));
        validator =
                new ValidationServerResource(getContext(), validationServerRef);
        tokenVerifier = new BearerTokenVerifier(validator);
        authenticator =
                new OAuth2Authenticator(getContext(), null,
                        OAuth2Utils.ParameterLocation.HTTP_HEADER, tokenVerifier);
        authenticator.setNext(new GuicedRestlet(UserInfo.class));
        root.attach("/userinfo", authenticator);

        //connect session management
        root.attach("/connect/endSession", OAuth2ConfigurationFactory.Holder.getConfigurationFactory().getEndSession());

        return root;
    }

    /**
     * Setups OAuth2 paths and handlers
     * 
     * @return a Restlet of the endpoints and their handlers
     */
    public Restlet activate() {
        Context childContext = getContext().createChildContext();
        Router router = new Router(childContext);

        // Define Authorization Endpoint
        OAuth2FlowFinder finder =
                new OAuth2FlowFinder(childContext, OAuth2Constants.EndpointType.AUTHORIZATION_ENDPOINT)
                        .supportAuthorizationCode().supportClientCredentials().supportImplicit()
                        .supportPassword();
        router.attach("/authorize", finder);

        //TODO client authentication needs to be done in the grant code
        ClientAuthenticationFilter filter = new ClientAuthenticationFilter(childContext);
        // Try to authenticate the client The verifier MUST set
        filter.setVerifier(getClientVerifier());
        router.attach("/access_token", filter);

        // Define Token Endpoint
        finder =
                new OAuth2FlowFinder(childContext, OAuth2Constants.EndpointType.TOKEN_ENDPOINT)
                        .supportAuthorizationCode().supportClientCredentials().supportImplicit()
                        .supportPassword().supportSAML20();
        filter.setNext(finder);

        return router;
    }

    /**
     * Creates a new client verifier
     * 
     * @return ClientVerifierImpl
     *              A client verifier
     */
    public org.forgerock.openam.oauth2.provider.ClientVerifier getClientVerifier() {
        return OAuth2ConfigurationFactory.Holder.getConfigurationFactory().getClientVerifier();
    }

    /**
     * Gets the current token store or creates a new one if it doesn't exist
     * 
     * @return OAuthTokenStore
     *              A new token store.
     */
    public OAuth2TokenStore getTokenStore() {
        return OAuth2ConfigurationFactory.Holder.getConfigurationFactory().getTokenStore();
    }

    private void setOAuth2ConfigurationFactory(final String oAuth2ConfigurationFactoryClassName) {
        try {
            OAuth2ConfigurationFactory configurationFactory =
                    (OAuth2ConfigurationFactory) Class.forName(oAuth2ConfigurationFactoryClassName)
                            .getDeclaredMethod("getOAuth2ConfigurationFactory").invoke(null);
            OAuth2ConfigurationFactory.Holder.setConfigurationFactory(configurationFactory);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
