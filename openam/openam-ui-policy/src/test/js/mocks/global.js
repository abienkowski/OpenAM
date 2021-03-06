/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2014-2015 ForgeRock AS.
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
 * "Portions Copyrighted [year] [name of copyright owner]"
 */

/*global require, define*/
define([
    "text!locales/en/translation.json",
    "text!themeConfig.json",
    "text!libs/less-1.5.1-min.js",
    "text!libs/jquery.autosize.input.min.js",
    "text!css/styles.less",
    "text!css/common/jquery-ui-1.10.3.custom.css",
    "text!common/bootstrap-3.3.4-custom.css",
    "text!common/bootstrap-dialog-1.34.4-min.css",
    "text!css/backgrid/backgrid.min.less",
    "text!css/backgrid/backgrid-paginator.min.css",
    "text!css/backgrid/backgrid-filter.min.css",
    "text!css/fontawesome/css/font-awesome.min.css",
    "text!css/fontawesome/less/variables.less",
    "text!css/common/forgerock-variables.less",
    "text!css/common/common.less",
    "text!css/editor/main.less",
    "text!css/common/bootstrap-clockpicker.min.css",
    "text!css/selectize-0.12.1-bootstrap3.css",
    "text!templates/common/DefaultBaseTemplate.html",
    "text!templates/common/NavigationTemplate.html",
    "text!templates/common/FooterTemplate.html",
    "text!templates/common/LoginBaseTemplate.html",
    "text!templates/common/404.html"
], function () {

    /* an unfortunate need to duplicate the file names here, but I haven't
     yet found a way to fool requirejs into doing dynamic dependencies */
    var staticFiles = [
            "locales/en/translation.json",
            "themeConfig.json",
            "libs/less-1.5.1-min.js",
            "libs/jquery.autosize.input.min.js",
            "css/styles.less",
            "css/common/jquery-ui-1.10.3.custom.css",
            "common/bootstrap-3.3.4-custom.css",
            "common/bootstrap-dialog-1.34.4-min.css",
            "css/backgrid/backgrid.min.less",
            "css/backgrid/backgrid-paginator.min.css",
            "css/backgrid/backgrid-filter.min.css",
            "css/fontawesome/css/font-awesome.min.css",
            "css/fontawesome/less/variables.less",
            "css/common/forgerock-variables.less",
            "css/common/common.less",
            "css/editor/main.less",
            "css/common/bootstrap-clockpicker.min.css",
            "css/selectize-0.12.1-bootstrap3.css",
            "templates/common/DefaultBaseTemplate.html",
            "templates/common/NavigationTemplate.html",
            "templates/common/FooterTemplate.html",
            "templates/common/LoginBaseTemplate.html",
            "templates/common/404.html"
        ],
        deps = arguments;

    return function (server) {

        _.each(staticFiles, function (file, i) {
            server.respondWith(
                "GET",
                new RegExp(file.replace(/([\/\.\-])/g, "\\$1") + "$"),
                [
                    200,
                    { },
                    deps[i]
                ]
            );
        });

        server.respondWith(
            "POST",
            new RegExp("/json/users\\?_action=idFromSession$"),
            [
                200,
                { },
                "{\"id\":\"amadmin\",\"realm\":\"/\",\"dn\":\"id=amadmin,ou=user,dc=openam,dc=forgerock,dc=org\",\"successURL\":\"/openam/console\",\"fullLoginURL\":\"/openam/UI/Login?realm=%2F&goto=http%3A%2F%2Famserver.restful.com%2Fopenam-policy-debug%2F\"}"
            ]
        );
    };
});
