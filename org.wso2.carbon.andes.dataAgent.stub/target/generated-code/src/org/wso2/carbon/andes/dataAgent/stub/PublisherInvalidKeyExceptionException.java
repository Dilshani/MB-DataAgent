
/**
 * PublisherInvalidKeyExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:22 IST)
 */

package org.wso2.carbon.andes.dataAgent.stub;

public class PublisherInvalidKeyExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1406137374799L;
    
    private org.wso2.carbon.andes.dataagent.publisher.PublisherInvalidKeyException faultMessage;

    
        public PublisherInvalidKeyExceptionException() {
            super("PublisherInvalidKeyExceptionException");
        }

        public PublisherInvalidKeyExceptionException(java.lang.String s) {
           super(s);
        }

        public PublisherInvalidKeyExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PublisherInvalidKeyExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.andes.dataagent.publisher.PublisherInvalidKeyException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.andes.dataagent.publisher.PublisherInvalidKeyException getFaultMessage(){
       return faultMessage;
    }
}
    