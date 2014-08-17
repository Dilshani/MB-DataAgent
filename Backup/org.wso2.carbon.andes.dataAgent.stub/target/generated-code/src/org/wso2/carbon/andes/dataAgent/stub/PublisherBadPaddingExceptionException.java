
/**
 * PublisherBadPaddingExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:22 IST)
 */

package org.wso2.carbon.andes.dataAgent.stub;

public class PublisherBadPaddingExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1406137374618L;
    
    private org.wso2.carbon.andes.dataagent.publisher.PublisherBadPaddingException faultMessage;

    
        public PublisherBadPaddingExceptionException() {
            super("PublisherBadPaddingExceptionException");
        }

        public PublisherBadPaddingExceptionException(java.lang.String s) {
           super(s);
        }

        public PublisherBadPaddingExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PublisherBadPaddingExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.andes.dataagent.publisher.PublisherBadPaddingException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.andes.dataagent.publisher.PublisherBadPaddingException getFaultMessage(){
       return faultMessage;
    }
}
    