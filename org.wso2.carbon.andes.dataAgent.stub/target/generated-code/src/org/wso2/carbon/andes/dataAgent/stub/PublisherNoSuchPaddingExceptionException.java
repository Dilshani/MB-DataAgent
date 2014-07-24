
/**
 * PublisherNoSuchPaddingExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:22 IST)
 */

package org.wso2.carbon.andes.dataAgent.stub;

public class PublisherNoSuchPaddingExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1406137374603L;
    
    private org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchPaddingException faultMessage;

    
        public PublisherNoSuchPaddingExceptionException() {
            super("PublisherNoSuchPaddingExceptionException");
        }

        public PublisherNoSuchPaddingExceptionException(java.lang.String s) {
           super(s);
        }

        public PublisherNoSuchPaddingExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PublisherNoSuchPaddingExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchPaddingException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchPaddingException getFaultMessage(){
       return faultMessage;
    }
}
    