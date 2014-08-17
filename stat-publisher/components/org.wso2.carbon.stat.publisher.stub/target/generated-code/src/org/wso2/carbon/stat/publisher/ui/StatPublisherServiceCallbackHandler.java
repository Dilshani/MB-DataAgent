
/**
 * StatPublisherServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:22 IST)
 */

    package org.wso2.carbon.stat.publisher.ui;

    /**
     *  StatPublisherServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class StatPublisherServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public StatPublisherServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public StatPublisherServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getStatConfiguration method
            * override this method for handling normal response from getStatConfiguration operation
            */
           public void receiveResultgetStatConfiguration(
                    org.wso2.carbon.stat.publisher.data.xsd.StatConfiguration result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStatConfiguration operation
           */
            public void receiveErrorgetStatConfiguration(java.lang.Exception e) {
            }
                


    }
    