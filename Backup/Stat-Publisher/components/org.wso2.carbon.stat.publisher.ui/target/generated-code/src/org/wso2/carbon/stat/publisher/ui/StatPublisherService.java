

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
                    * @param getStatConfiguration2
                
         */

         
                     public org.wso2.carbon.stat.publisher.internal.data.xsd.StatConfiguration getStatConfiguration(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getStatConfiguration2
            
          */
        public void startgetStatConfiguration(

            

            final org.wso2.carbon.stat.publisher.ui.StatPublisherServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param setStatConfiguration5
                
         */

         
                     public boolean setStatConfiguration(

                        org.wso2.carbon.stat.publisher.internal.data.xsd.StatConfiguration statConfigurationData6)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param setStatConfiguration5
            
          */
        public void startsetStatConfiguration(

            org.wso2.carbon.stat.publisher.internal.data.xsd.StatConfiguration statConfigurationData6,

            final org.wso2.carbon.stat.publisher.ui.StatPublisherServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param uRLValidator9
                
         */

         
                     public boolean uRLValidator(

                        java.lang.String uRLS10)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param uRLValidator9
            
          */
        public void startuRLValidator(

            java.lang.String uRLS10,

            final org.wso2.carbon.stat.publisher.ui.StatPublisherServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    