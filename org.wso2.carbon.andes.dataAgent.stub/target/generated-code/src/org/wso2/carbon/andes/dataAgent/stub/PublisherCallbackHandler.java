
/**
 * PublisherCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:22 IST)
 */

    package org.wso2.carbon.andes.dataAgent.stub;

    /**
     *  PublisherCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class PublisherCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public PublisherCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public PublisherCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getPassword method
            * override this method for handling normal response from getPassword operation
            */
           public void receiveResultgetPassword(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPassword operation
           */
            public void receiveErrorgetPassword(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMBStatConfig method
            * override this method for handling normal response from getMBStatConfig operation
            */
           public void receiveResultgetMBStatConfig(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMBStatConfig operation
           */
            public void receiveErrorgetMBStatConfig(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for publisherSelector method
            * override this method for handling normal response from publisherSelector operation
            */
           public void receiveResultpublisherSelector(
                    org.wso2.carbon.andes.dataagent.configure.xsd.Dataoutput result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from publisherSelector operation
           */
            public void receiveErrorpublisherSelector(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getsystemStatConfig method
            * override this method for handling normal response from getsystemStatConfig operation
            */
           public void receiveResultgetsystemStatConfig(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getsystemStatConfig operation
           */
            public void receiveErrorgetsystemStatConfig(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getIP method
            * override this method for handling normal response from getIP operation
            */
           public void receiveResultgetIP(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getIP operation
           */
            public void receiveErrorgetIP(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getEnable method
            * override this method for handling normal response from getEnable operation
            */
           public void receiveResultgetEnable(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getEnable operation
           */
            public void receiveErrorgetEnable(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getURLValidation method
            * override this method for handling normal response from getURLValidation operation
            */
           public void receiveResultgetURLValidation(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getURLValidation operation
           */
            public void receiveErrorgetURLValidation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setConfig method
            * override this method for handling normal response from setConfig operation
            */
           public void receiveResultsetConfig(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setConfig operation
           */
            public void receiveErrorsetConfig(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMessageStatConfig method
            * override this method for handling normal response from getMessageStatConfig operation
            */
           public void receiveResultgetMessageStatConfig(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMessageStatConfig operation
           */
            public void receiveErrorgetMessageStatConfig(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPort method
            * override this method for handling normal response from getPort operation
            */
           public void receiveResultgetPort(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPort operation
           */
            public void receiveErrorgetPort(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUsername method
            * override this method for handling normal response from getUsername operation
            */
           public void receiveResultgetUsername(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUsername operation
           */
            public void receiveErrorgetUsername(java.lang.Exception e) {
            }
                


    }
    