
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:23 IST)
 */

        
            package org.wso2.carbon.andes.dataagent.publisher;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://io.java/xsd".equals(namespaceURI) &&
                  "IOException".equals(typeName)){
                   
                            return  java.io.xsd.IOException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://security.java/xsd".equals(namespaceURI) &&
                  "InvalidKeyException".equals(typeName)){
                   
                            return  java.security.xsd.InvalidKeyException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://security.java/xsd".equals(namespaceURI) &&
                  "KeyException".equals(typeName)){
                   
                            return  java.security.xsd.KeyException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://security.java/xsd".equals(namespaceURI) &&
                  "GeneralSecurityException".equals(typeName)){
                   
                            return  java.security.xsd.GeneralSecurityException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://net.java/xsd".equals(namespaceURI) &&
                  "UnknownHostException".equals(typeName)){
                   
                            return  java.net.xsd.UnknownHostException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://configure.dataAgent.andes.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Dataoutput".equals(typeName)){
                   
                            return  org.wso2.carbon.andes.dataagent.configure.xsd.Dataoutput.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://sax.xml.org/xsd".equals(namespaceURI) &&
                  "SAXException".equals(typeName)){
                   
                            return  org.xml.sax.xsd.SAXException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://security.java/xsd".equals(namespaceURI) &&
                  "NoSuchAlgorithmException".equals(typeName)){
                   
                            return  java.security.xsd.NoSuchAlgorithmException.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    