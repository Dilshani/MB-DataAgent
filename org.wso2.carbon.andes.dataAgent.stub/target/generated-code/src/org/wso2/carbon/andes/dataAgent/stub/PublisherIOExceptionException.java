
/**
 * PublisherIOExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:22 IST)
 */

package org.wso2.carbon.andes.dataAgent.stub;

public class PublisherIOExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1406137374712L;
    
    private org.wso2.carbon.andes.dataagent.publisher.PublisherIOException faultMessage;

    
        public PublisherIOExceptionException() {
            super("PublisherIOExceptionException");
        }

        public PublisherIOExceptionException(java.lang.String s) {
           super(s);
        }

        public PublisherIOExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PublisherIOExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.andes.dataagent.publisher.PublisherIOException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.andes.dataagent.publisher.PublisherIOException getFaultMessage(){
       return faultMessage;
    }
}
    