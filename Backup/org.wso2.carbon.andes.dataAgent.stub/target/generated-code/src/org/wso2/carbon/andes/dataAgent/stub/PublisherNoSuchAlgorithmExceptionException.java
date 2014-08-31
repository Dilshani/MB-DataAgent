
/**
 * PublisherNoSuchAlgorithmExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:22 IST)
 */

package org.wso2.carbon.andes.dataAgent.stub;

public class PublisherNoSuchAlgorithmExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1406137374634L;
    
    private org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchAlgorithmException faultMessage;

    
        public PublisherNoSuchAlgorithmExceptionException() {
            super("PublisherNoSuchAlgorithmExceptionException");
        }

        public PublisherNoSuchAlgorithmExceptionException(java.lang.String s) {
           super(s);
        }

        public PublisherNoSuchAlgorithmExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PublisherNoSuchAlgorithmExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchAlgorithmException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchAlgorithmException getFaultMessage(){
       return faultMessage;
    }
}
    