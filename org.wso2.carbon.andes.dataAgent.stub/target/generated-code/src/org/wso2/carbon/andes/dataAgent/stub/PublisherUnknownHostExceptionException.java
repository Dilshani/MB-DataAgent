
/**
 * PublisherUnknownHostExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:22 IST)
 */

package org.wso2.carbon.andes.dataAgent.stub;

public class PublisherUnknownHostExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1406137374651L;
    
    private org.wso2.carbon.andes.dataagent.publisher.PublisherUnknownHostException faultMessage;

    
        public PublisherUnknownHostExceptionException() {
            super("PublisherUnknownHostExceptionException");
        }

        public PublisherUnknownHostExceptionException(java.lang.String s) {
           super(s);
        }

        public PublisherUnknownHostExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PublisherUnknownHostExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.andes.dataagent.publisher.PublisherUnknownHostException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.andes.dataagent.publisher.PublisherUnknownHostException getFaultMessage(){
       return faultMessage;
    }
}
    