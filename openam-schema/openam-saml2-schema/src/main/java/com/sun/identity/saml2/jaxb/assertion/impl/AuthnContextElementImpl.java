//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.assertion.impl;

public class AuthnContextElementImpl
    extends com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextTypeImpl
    implements com.sun.identity.saml2.jaxb.assertion.AuthnContextElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.assertion.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.assertion.AuthnContextElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:2.0:assertion";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "AuthnContext";
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContext");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.assertion.AuthnContextElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.s"
+"un.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\u000bppsq\u0000~\u0000\u000bpps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L"
+"\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Bo"
+"olean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000#com.sun.msv.datatype.xsd.Any"
+"URIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomic"
+"Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u001cL\u0000\nwhit"
+"eSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 "
+"http://www.w3.org/2001/XMLSchemat\u0000\u0006anyURIsr\u00005com.sun.msv.dat"
+"atype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.su"
+"n.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q"
+"\u0000~\u0000\u0017psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq"
+"\u0000~\u0000\u001cL\u0000\fnamespaceURIq\u0000~\u0000\u001cxpq\u0000~\u0000 q\u0000~\u0000\u001fsq\u0000~\u0000\u000bppsr\u0000 com.sun.msv."
+"grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001x"
+"q\u0000~\u0000\u0004q\u0000~\u0000\u0017psq\u0000~\u0000\u0012ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0019q\u0000~\u0000\u001ft\u0000\u0005QNameq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&q\u0000~\u0000.q\u0000~\u0000\u001fsr\u0000#com"
+".sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001c"
+"L\u0000\fnamespaceURIq\u0000~\u0000\u001cxr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instancesr\u0000"
+"0com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u0004sq\u0000~\u0000\u0016\u0001q\u0000~\u00006sq\u0000~\u00000t\u0000\u0014AuthnContextClassReft\u0000%urn:oasis:"
+"names:tc:SAML:2.0:assertionsq\u0000~\u0000\u000bppsq\u0000~\u0000\u000bq\u0000~\u0000\u0017psq\u0000~\u0000\u000bq\u0000~\u0000\u0017ps"
+"q\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u000bppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000"
+"\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0017psq\u0000~\u0000)q\u0000~\u0000\u0017psr\u00002com.sun.msv.grammar.Expression$"
+"AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u00007q\u0000~\u0000Esr\u0000 com.sun.ms"
+"v.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00001q\u0000~\u00006sq\u0000~\u00000t\u0000=com.sun"
+".identity.saml2.jaxb.assertion.AuthnContextDeclElementt\u0000+htt"
+"p://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007p"
+"psq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000@q\u0000~\u0000\u0017psq\u0000~\u0000)q\u0000~\u0000\u0017pq\u0000~\u0000Eq\u0000~\u0000Gq\u0000~\u00006sq\u0000"
+"~\u00000t\u0000*com.sun.identity.saml2.jaxb.schema.AnyTypeq\u0000~\u0000Jsq\u0000~\u0000\u000bp"
+"psq\u0000~\u0000)q\u0000~\u0000\u0017pq\u0000~\u0000+q\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u0010AuthnContextDeclq\u0000~\u0000:sq"
+"\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000\u0015sq\u0000~\u0000\u000bppsq\u0000~\u0000)q\u0000~\u0000\u0017pq\u0000~\u0000+q\u0000~\u00002q\u0000~\u00006s"
+"q\u0000~\u00000t\u0000\u0013AuthnContextDeclRefq\u0000~\u0000:q\u0000~\u00006sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000@"
+"q\u0000~\u0000\u0017psq\u0000~\u0000)q\u0000~\u0000\u0017pq\u0000~\u0000Eq\u0000~\u0000Gq\u0000~\u00006sq\u0000~\u00000q\u0000~\u0000Iq\u0000~\u0000Jsq\u0000~\u0000\u0000pp\u0000sq"
+"\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000@q\u0000~\u0000\u0017psq\u0000~\u0000)q\u0000~\u0000\u0017pq\u0000~\u0000Eq\u0000~\u0000Gq\u0000~"
+"\u00006sq\u0000~\u00000q\u0000~\u0000Rq\u0000~\u0000Jsq\u0000~\u0000\u000bppsq\u0000~\u0000)q\u0000~\u0000\u0017pq\u0000~\u0000+q\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000q"
+"\u0000~\u0000Vq\u0000~\u0000:sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000\u0015sq\u0000~\u0000\u000bppsq\u0000~\u0000)q\u0000~\u0000\u0017pq\u0000~\u0000+q\u0000~\u0000"
+"2q\u0000~\u00006sq\u0000~\u00000q\u0000~\u0000\\q\u0000~\u0000:sq\u0000~\u0000\u000bppsq\u0000~\u0000@q\u0000~\u0000\u0017psq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000"
+"\u0007ppq\u0000~\u0000\u0015sq\u0000~\u0000\u000bppsq\u0000~\u0000)q\u0000~\u0000\u0017pq\u0000~\u0000+q\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u0017Authenti"
+"catingAuthorityq\u0000~\u0000:q\u0000~\u00006sq\u0000~\u0000\u000bppsq\u0000~\u0000)q\u0000~\u0000\u0017pq\u0000~\u0000+q\u0000~\u00002q\u0000~\u00006"
+"sq\u0000~\u00000t\u0000\fAuthnContextq\u0000~\u0000:sr\u0000\"com.sun.msv.grammar.Expression"
+"Pool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expression"
+"Pool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Clo"
+"sedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/s"
+"un/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000 \u0001pq\u0000~\u0000\rq\u0000~\u0000?q\u0000~\u0000Nq\u0000~\u0000^q\u0000"
+"~\u0000eq\u0000~\u0000Lq\u0000~\u0000cq\u0000~\u0000\u000fq\u0000~\u0000qq\u0000~\u0000\fq\u0000~\u0000\tq\u0000~\u0000\nq\u0000~\u0000Bq\u0000~\u0000Oq\u0000~\u0000<q\u0000~\u0000_q\u0000"
+"~\u0000\u000eq\u0000~\u0000fq\u0000~\u0000;q\u0000~\u0000(q\u0000~\u0000Sq\u0000~\u0000Yq\u0000~\u0000iq\u0000~\u0000nq\u0000~\u0000=q\u0000~\u0000uq\u0000~\u0000rq\u0000~\u0000yq\u0000"
+"~\u0000\u0011q\u0000~\u0000Xq\u0000~\u0000mq\u0000~\u0000tx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("AuthnContext" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("AuthnContextClassRef" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AuthnContextDecl" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AuthnContextDecl" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AuthnContextDeclRef" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AuthnContextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("AuthnContext" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}