

/**
 * StatPublisherService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:22 IST)
 */

    package org.wso2.carbon.stat.publisher.ui;

    /*
     *  StatPublisherService java interface
     */

    public interface StatPublisherService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getStatConfiguration0
                
         */

         
                     public org.wso2.carbon.stat.publisher.data.xsd.StatConfiguration getStatConfiguration(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getStatConfiguration0
            
          */
        public void startgetStatConfiguration(

            

            final org.wso2.carbon.stat.publisher.ui.StatPublisherServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    