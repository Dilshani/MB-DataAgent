
/**
 * PublisherStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Jul 03, 2014 (08:35:22 IST)
 */
        package org.wso2.carbon.andes.dataAgent.stub;

        

        /*
        *  PublisherStub java implementation
        */

        
        public class PublisherStub extends org.apache.axis2.client.Stub
        implements Publisher{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("Publisher" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[11];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "getPassword"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "getMBStatConfig"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "publisherSelector"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "getsystemStatConfig"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "getIP"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "getEnable"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "getURLValidation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "setConfig"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "getMessageStatConfig"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "getPort"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org", "getUsername"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getPassword"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getPassword"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getPassword"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getPassword"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getPassword"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getPassword"),"org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getPassword"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getPassword"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getPassword"),"org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getMBStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getMBStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getMBStatConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getMBStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getMBStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getMBStatConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getMBStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getMBStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getMBStatConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "publisherSelector"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "publisherSelector"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "publisherSelector"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "publisherSelector"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "publisherSelector"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "publisherSelector"),"org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "publisherSelector"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "publisherSelector"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "publisherSelector"),"org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getsystemStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getsystemStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getsystemStatConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getsystemStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getsystemStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getsystemStatConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getsystemStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getsystemStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getsystemStatConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getIP"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getIP"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getIP"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getIP"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getIP"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getIP"),"org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getIP"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getIP"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getIP"),"org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getEnable"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getEnable"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getEnable"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getEnable"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getEnable"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getEnable"),"org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getEnable"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getEnable"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getEnable"),"org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherUnknownHostException"), "getURLValidation"),"org.wso2.carbon.andes.dataAgent.stub.PublisherUnknownHostExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherUnknownHostException"), "getURLValidation"),"org.wso2.carbon.andes.dataAgent.stub.PublisherUnknownHostExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherUnknownHostException"), "getURLValidation"),"org.wso2.carbon.andes.dataagent.publisher.PublisherUnknownHostException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getURLValidation"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getURLValidation"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getURLValidation"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherBadPaddingException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherBadPaddingExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherBadPaddingException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherBadPaddingExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherBadPaddingException"), "setConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherBadPaddingException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherNoSuchPaddingException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchPaddingExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherNoSuchPaddingException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchPaddingExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherNoSuchPaddingException"), "setConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchPaddingException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherNoSuchAlgorithmException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchAlgorithmExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherNoSuchAlgorithmException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchAlgorithmExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherNoSuchAlgorithmException"), "setConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchAlgorithmException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "setConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherTransformerException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherTransformerExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherTransformerException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherTransformerExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherTransformerException"), "setConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherTransformerException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "setConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIllegalBlockSizeException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIllegalBlockSizeExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIllegalBlockSizeException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIllegalBlockSizeExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIllegalBlockSizeException"), "setConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIllegalBlockSizeException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "setConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherInvalidKeyException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherInvalidKeyExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherInvalidKeyException"), "setConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherInvalidKeyExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherInvalidKeyException"), "setConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherInvalidKeyException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getMessageStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getMessageStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getMessageStatConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getMessageStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getMessageStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getMessageStatConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getMessageStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getMessageStatConfig"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getMessageStatConfig"),"org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getPort"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getPort"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getPort"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getPort"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getPort"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getPort"),"org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getPort"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getPort"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getPort"),"org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getUsername"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getUsername"),"org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherIOException"), "getUsername"),"org.wso2.carbon.andes.dataagent.publisher.PublisherIOException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getUsername"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getUsername"),"org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherSAXException"), "getUsername"),"org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getUsername"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getUsername"),"org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org","PublisherParserConfigurationException"), "getUsername"),"org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public PublisherStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public PublisherStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public PublisherStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://10.217.183.154:9443/services/Publisher.PublisherHttpsSoap12Endpoint/" );
                
    }

    /**
     * Default Constructor
     */
    public PublisherStub() throws org.apache.axis2.AxisFault {
        
                    this("https://10.217.183.154:9443/services/Publisher.PublisherHttpsSoap12Endpoint/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public PublisherStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#getPassword
                     * @param getPassword72
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException : 
                     */

                    

                            public  java.lang.String getPassword(

                            java.lang.String publisher73)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:getPassword");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.GetPassword dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher73,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getPassword")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.GetPasswordResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetPasswordResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetPasswordResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPassword"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPassword"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPassword"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startgetPassword
                    * @param getPassword72
                
                */
                public  void startgetPassword(

                 java.lang.String publisher73,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("urn:getPassword");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.GetPassword dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher73,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getPassword")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.GetPasswordResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetPassword(
                                            getGetPasswordResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetPasswordResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetPassword(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPassword"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPassword"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPassword"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorgetPassword((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
														callback.receiveErrorgetPassword((org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
														callback.receiveErrorgetPassword((org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetPassword(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPassword(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPassword(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPassword(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPassword(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPassword(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPassword(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPassword(f);
                                            }
									    } else {
										    callback.receiveErrorgetPassword(f);
									    }
									} else {
									    callback.receiveErrorgetPassword(f);
									}
								} else {
								    callback.receiveErrorgetPassword(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetPassword(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#getMBStatConfig
                     * @param getMBStatConfig76
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException : 
                     */

                    

                            public  boolean getMBStatConfig(

                            java.lang.String publisher77)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn:getMBStatConfig");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfig dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher77,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getMBStatConfig")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfigResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetMBStatConfigResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfigResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMBStatConfig"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMBStatConfig"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMBStatConfig"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startgetMBStatConfig
                    * @param getMBStatConfig76
                
                */
                public  void startgetMBStatConfig(

                 java.lang.String publisher77,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("urn:getMBStatConfig");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfig dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher77,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getMBStatConfig")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfigResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMBStatConfig(
                                            getGetMBStatConfigResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfigResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMBStatConfig(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMBStatConfig"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMBStatConfig"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMBStatConfig"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorgetMBStatConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
														callback.receiveErrorgetMBStatConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
														callback.receiveErrorgetMBStatConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetMBStatConfig(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMBStatConfig(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMBStatConfig(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMBStatConfig(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMBStatConfig(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMBStatConfig(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMBStatConfig(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMBStatConfig(f);
                                            }
									    } else {
										    callback.receiveErrorgetMBStatConfig(f);
									    }
									} else {
									    callback.receiveErrorgetMBStatConfig(f);
									}
								} else {
								    callback.receiveErrorgetMBStatConfig(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMBStatConfig(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#publisherSelector
                     * @param publisherSelector80
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException : 
                     */

                    

                            public  org.wso2.carbon.andes.dataagent.configure.xsd.Dataoutput publisherSelector(

                            java.lang.String publisher81)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("urn:publisherSelector");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.PublisherSelector dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher81,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "publisherSelector")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.PublisherSelectorResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getPublisherSelectorResponse_return((org.wso2.carbon.andes.dataagent.publisher.PublisherSelectorResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publisherSelector"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publisherSelector"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publisherSelector"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startpublisherSelector
                    * @param publisherSelector80
                
                */
                public  void startpublisherSelector(

                 java.lang.String publisher81,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("urn:publisherSelector");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.PublisherSelector dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher81,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "publisherSelector")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.PublisherSelectorResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultpublisherSelector(
                                            getPublisherSelectorResponse_return((org.wso2.carbon.andes.dataagent.publisher.PublisherSelectorResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorpublisherSelector(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publisherSelector"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publisherSelector"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publisherSelector"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorpublisherSelector((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
														callback.receiveErrorpublisherSelector((org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
														callback.receiveErrorpublisherSelector((org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorpublisherSelector(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorpublisherSelector(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorpublisherSelector(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorpublisherSelector(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorpublisherSelector(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorpublisherSelector(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorpublisherSelector(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorpublisherSelector(f);
                                            }
									    } else {
										    callback.receiveErrorpublisherSelector(f);
									    }
									} else {
									    callback.receiveErrorpublisherSelector(f);
									}
								} else {
								    callback.receiveErrorpublisherSelector(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorpublisherSelector(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#getsystemStatConfig
                     * @param getsystemStatConfig84
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException : 
                     */

                    

                            public  boolean getsystemStatConfig(

                            java.lang.String publisher85)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("urn:getsystemStatConfig");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfig dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher85,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getsystemStatConfig")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfigResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetsystemStatConfigResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfigResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getsystemStatConfig"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getsystemStatConfig"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getsystemStatConfig"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startgetsystemStatConfig
                    * @param getsystemStatConfig84
                
                */
                public  void startgetsystemStatConfig(

                 java.lang.String publisher85,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("urn:getsystemStatConfig");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfig dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher85,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getsystemStatConfig")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfigResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetsystemStatConfig(
                                            getGetsystemStatConfigResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfigResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetsystemStatConfig(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getsystemStatConfig"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getsystemStatConfig"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getsystemStatConfig"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorgetsystemStatConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
														callback.receiveErrorgetsystemStatConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
														callback.receiveErrorgetsystemStatConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetsystemStatConfig(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetsystemStatConfig(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetsystemStatConfig(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetsystemStatConfig(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetsystemStatConfig(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetsystemStatConfig(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetsystemStatConfig(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetsystemStatConfig(f);
                                            }
									    } else {
										    callback.receiveErrorgetsystemStatConfig(f);
									    }
									} else {
									    callback.receiveErrorgetsystemStatConfig(f);
									}
								} else {
								    callback.receiveErrorgetsystemStatConfig(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetsystemStatConfig(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#getIP
                     * @param getIP88
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException : 
                     */

                    

                            public  java.lang.String getIP(

                            java.lang.String publisher89)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("urn:getIP");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.GetIP dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher89,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getIP")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.GetIPResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetIPResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetIPResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getIP"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getIP"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getIP"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startgetIP
                    * @param getIP88
                
                */
                public  void startgetIP(

                 java.lang.String publisher89,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("urn:getIP");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.GetIP dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher89,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getIP")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.GetIPResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetIP(
                                            getGetIPResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetIPResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetIP(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getIP"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getIP"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getIP"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorgetIP((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
														callback.receiveErrorgetIP((org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
														callback.receiveErrorgetIP((org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetIP(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIP(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIP(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIP(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIP(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIP(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIP(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIP(f);
                                            }
									    } else {
										    callback.receiveErrorgetIP(f);
									    }
									} else {
									    callback.receiveErrorgetIP(f);
									}
								} else {
								    callback.receiveErrorgetIP(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetIP(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#getEnable
                     * @param getEnable92
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException : 
                     */

                    

                            public  boolean getEnable(

                            java.lang.String publisher93)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn:getEnable");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.GetEnable dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher93,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getEnable")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.GetEnableResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetEnableResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetEnableResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getEnable"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getEnable"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getEnable"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startgetEnable
                    * @param getEnable92
                
                */
                public  void startgetEnable(

                 java.lang.String publisher93,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("urn:getEnable");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.GetEnable dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher93,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getEnable")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.GetEnableResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetEnable(
                                            getGetEnableResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetEnableResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetEnable(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getEnable"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getEnable"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getEnable"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorgetEnable((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
														callback.receiveErrorgetEnable((org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
														callback.receiveErrorgetEnable((org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetEnable(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetEnable(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetEnable(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetEnable(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetEnable(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetEnable(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetEnable(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetEnable(f);
                                            }
									    } else {
										    callback.receiveErrorgetEnable(f);
									    }
									} else {
									    callback.receiveErrorgetEnable(f);
									}
								} else {
								    callback.receiveErrorgetEnable(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetEnable(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#getURLValidation
                     * @param getURLValidation96
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherUnknownHostExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     */

                    

                            public  boolean getURLValidation(

                            java.lang.String iP97,int port98)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherUnknownHostExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("urn:getURLValidation");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.GetURLValidation dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    iP97,
                                                    port98,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getURLValidation")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.GetURLValidationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetURLValidationResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetURLValidationResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getURLValidation"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getURLValidation"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getURLValidation"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherUnknownHostExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherUnknownHostExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startgetURLValidation
                    * @param getURLValidation96
                
                */
                public  void startgetURLValidation(

                 java.lang.String iP97,int port98,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("urn:getURLValidation");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.GetURLValidation dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    iP97,
                                                    port98,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getURLValidation")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.GetURLValidationResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetURLValidation(
                                            getGetURLValidationResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetURLValidationResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetURLValidation(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getURLValidation"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getURLValidation"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getURLValidation"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherUnknownHostExceptionException){
														callback.receiveErrorgetURLValidation((org.wso2.carbon.andes.dataAgent.stub.PublisherUnknownHostExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorgetURLValidation((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetURLValidation(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetURLValidation(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetURLValidation(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetURLValidation(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetURLValidation(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetURLValidation(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetURLValidation(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetURLValidation(f);
                                            }
									    } else {
										    callback.receiveErrorgetURLValidation(f);
									    }
									} else {
									    callback.receiveErrorgetURLValidation(f);
									}
								} else {
								    callback.receiveErrorgetURLValidation(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetURLValidation(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#setConfig
                     * @param setConfig101
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherBadPaddingExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchPaddingExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchAlgorithmExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherTransformerExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIllegalBlockSizeExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherInvalidKeyExceptionException : 
                     */

                    

                            public  boolean setConfig(

                            java.lang.String enable102,java.lang.String publisher_name103,java.lang.String username104,java.lang.String password105,java.lang.String ip106,java.lang.String port107,java.lang.String message_stat108,java.lang.String system_stat109,java.lang.String mB_stat110)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherBadPaddingExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchPaddingExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchAlgorithmExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherTransformerExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIllegalBlockSizeExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherInvalidKeyExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("urn:setConfig");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.SetConfig dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    enable102,
                                                    publisher_name103,
                                                    username104,
                                                    password105,
                                                    ip106,
                                                    port107,
                                                    message_stat108,
                                                    system_stat109,
                                                    mB_stat110,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "setConfig")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.SetConfigResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getSetConfigResponse_return((org.wso2.carbon.andes.dataagent.publisher.SetConfigResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setConfig"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setConfig"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setConfig"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherBadPaddingExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherBadPaddingExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchPaddingExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchPaddingExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchAlgorithmExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchAlgorithmExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherTransformerExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherTransformerExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIllegalBlockSizeExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIllegalBlockSizeExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherInvalidKeyExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherInvalidKeyExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startsetConfig
                    * @param setConfig101
                
                */
                public  void startsetConfig(

                 java.lang.String enable102,java.lang.String publisher_name103,java.lang.String username104,java.lang.String password105,java.lang.String ip106,java.lang.String port107,java.lang.String message_stat108,java.lang.String system_stat109,java.lang.String mB_stat110,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("urn:setConfig");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.SetConfig dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    enable102,
                                                    publisher_name103,
                                                    username104,
                                                    password105,
                                                    ip106,
                                                    port107,
                                                    message_stat108,
                                                    system_stat109,
                                                    mB_stat110,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "setConfig")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.SetConfigResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultsetConfig(
                                            getSetConfigResponse_return((org.wso2.carbon.andes.dataagent.publisher.SetConfigResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorsetConfig(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setConfig"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setConfig"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setConfig"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherBadPaddingExceptionException){
														callback.receiveErrorsetConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherBadPaddingExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchPaddingExceptionException){
														callback.receiveErrorsetConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchPaddingExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchAlgorithmExceptionException){
														callback.receiveErrorsetConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherNoSuchAlgorithmExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorsetConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherTransformerExceptionException){
														callback.receiveErrorsetConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherTransformerExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
														callback.receiveErrorsetConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIllegalBlockSizeExceptionException){
														callback.receiveErrorsetConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherIllegalBlockSizeExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
														callback.receiveErrorsetConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherInvalidKeyExceptionException){
														callback.receiveErrorsetConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherInvalidKeyExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorsetConfig(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetConfig(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetConfig(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetConfig(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetConfig(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetConfig(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetConfig(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetConfig(f);
                                            }
									    } else {
										    callback.receiveErrorsetConfig(f);
									    }
									} else {
									    callback.receiveErrorsetConfig(f);
									}
								} else {
								    callback.receiveErrorsetConfig(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorsetConfig(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#getMessageStatConfig
                     * @param getMessageStatConfig113
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException : 
                     */

                    

                            public  boolean getMessageStatConfig(

                            java.lang.String publisher114)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("urn:getMessageStatConfig");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfig dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher114,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getMessageStatConfig")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfigResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetMessageStatConfigResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfigResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMessageStatConfig"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMessageStatConfig"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMessageStatConfig"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startgetMessageStatConfig
                    * @param getMessageStatConfig113
                
                */
                public  void startgetMessageStatConfig(

                 java.lang.String publisher114,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("urn:getMessageStatConfig");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfig dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher114,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getMessageStatConfig")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfigResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMessageStatConfig(
                                            getGetMessageStatConfigResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfigResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMessageStatConfig(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMessageStatConfig"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMessageStatConfig"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMessageStatConfig"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorgetMessageStatConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
														callback.receiveErrorgetMessageStatConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
														callback.receiveErrorgetMessageStatConfig((org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetMessageStatConfig(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMessageStatConfig(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMessageStatConfig(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMessageStatConfig(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMessageStatConfig(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMessageStatConfig(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMessageStatConfig(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMessageStatConfig(f);
                                            }
									    } else {
										    callback.receiveErrorgetMessageStatConfig(f);
									    }
									} else {
									    callback.receiveErrorgetMessageStatConfig(f);
									}
								} else {
								    callback.receiveErrorgetMessageStatConfig(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMessageStatConfig(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#getPort
                     * @param getPort117
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException : 
                     */

                    

                            public  java.lang.String getPort(

                            java.lang.String publisher118)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("urn:getPort");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.GetPort dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher118,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getPort")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.GetPortResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetPortResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetPortResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPort"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPort"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPort"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startgetPort
                    * @param getPort117
                
                */
                public  void startgetPort(

                 java.lang.String publisher118,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
             _operationClient.getOptions().setAction("urn:getPort");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.GetPort dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher118,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getPort")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.GetPortResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetPort(
                                            getGetPortResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetPortResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetPort(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPort"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPort"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPort"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorgetPort((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
														callback.receiveErrorgetPort((org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
														callback.receiveErrorgetPort((org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetPort(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPort(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPort(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPort(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPort(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPort(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPort(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPort(f);
                                            }
									    } else {
										    callback.receiveErrorgetPort(f);
									    }
									} else {
									    callback.receiveErrorgetPort(f);
									}
								} else {
								    callback.receiveErrorgetPort(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetPort(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[9].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#getUsername
                     * @param getUsername121
                    
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException : 
                     * @throws org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException : 
                     */

                    

                            public  java.lang.String getUsername(

                            java.lang.String publisher122)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException
                        ,org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("urn:getUsername");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.andes.dataagent.publisher.GetUsername dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher122,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getUsername")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.andes.dataagent.publisher.GetUsernameResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetUsernameResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetUsernameResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsername"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsername"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsername"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex;
                        }
                        
                        if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
                          throw (org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.andes.dataAgent.stub.Publisher#startgetUsername
                    * @param getUsername121
                
                */
                public  void startgetUsername(

                 java.lang.String publisher122,

                  final org.wso2.carbon.andes.dataAgent.stub.PublisherCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
             _operationClient.getOptions().setAction("urn:getUsername");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.andes.dataagent.publisher.GetUsername dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    publisher122,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://publisher.dataAgent.andes.carbon.wso2.org",
                                                    "getUsername")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.andes.dataagent.publisher.GetUsernameResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetUsername(
                                            getGetUsernameResponse_return((org.wso2.carbon.andes.dataagent.publisher.GetUsernameResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetUsername(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsername"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsername"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsername"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException){
														callback.receiveErrorgetUsername((org.wso2.carbon.andes.dataAgent.stub.PublisherIOExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException){
														callback.receiveErrorgetUsername((org.wso2.carbon.andes.dataAgent.stub.PublisherSAXExceptionException)ex);
											            return;
										            }
										            
													if (ex instanceof org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException){
														callback.receiveErrorgetUsername((org.wso2.carbon.andes.dataAgent.stub.PublisherParserConfigurationExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetUsername(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsername(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsername(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsername(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsername(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsername(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsername(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsername(f);
                                            }
									    } else {
										    callback.receiveErrorgetUsername(f);
									    }
									} else {
									    callback.receiveErrorgetUsername(f);
									}
								} else {
								    callback.receiveErrorgetUsername(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetUsername(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[10].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://10.217.183.154:9443/services/Publisher.PublisherHttpsSoap12Endpoint/
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetPassword param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetPassword.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetPasswordResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetPasswordResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherIOException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfig param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfig.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfigResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfigResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherSelector param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherSelector.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherSelectorResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherSelectorResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfig param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfig.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfigResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfigResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetIP param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetIP.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetIPResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetIPResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetEnable param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetEnable.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetEnableResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetEnableResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetURLValidation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetURLValidation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetURLValidationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetURLValidationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherUnknownHostException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherUnknownHostException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.SetConfig param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.SetConfig.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.SetConfigResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.SetConfigResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherBadPaddingException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherBadPaddingException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchPaddingException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchPaddingException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchAlgorithmException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchAlgorithmException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherTransformerException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherTransformerException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherIllegalBlockSizeException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherIllegalBlockSizeException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.PublisherInvalidKeyException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherInvalidKeyException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfig param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfig.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfigResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfigResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetPort param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetPort.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetPortResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetPortResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetUsername param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetUsername.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.andes.dataagent.publisher.GetUsernameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetUsernameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.andes.dataagent.publisher.GetPassword dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.GetPassword wrappedType = new org.wso2.carbon.andes.dataagent.publisher.GetPassword();

                                 
                                              wrappedType.setPublisher(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetPassword.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private java.lang.String getGetPasswordResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.GetPasswordResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfig dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfig wrappedType = new org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfig();

                                 
                                              wrappedType.setPublisher(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfig.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getGetMBStatConfigResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfigResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.andes.dataagent.publisher.PublisherSelector dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.PublisherSelector wrappedType = new org.wso2.carbon.andes.dataagent.publisher.PublisherSelector();

                                 
                                              wrappedType.setPublisher(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.PublisherSelector.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.andes.dataagent.configure.xsd.Dataoutput getPublisherSelectorResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.PublisherSelectorResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfig dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfig wrappedType = new org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfig();

                                 
                                              wrappedType.setPublisher(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfig.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getGetsystemStatConfigResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfigResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.andes.dataagent.publisher.GetIP dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.GetIP wrappedType = new org.wso2.carbon.andes.dataagent.publisher.GetIP();

                                 
                                              wrappedType.setPublisher(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetIP.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private java.lang.String getGetIPResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.GetIPResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.andes.dataagent.publisher.GetEnable dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.GetEnable wrappedType = new org.wso2.carbon.andes.dataagent.publisher.GetEnable();

                                 
                                              wrappedType.setPublisher(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetEnable.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getGetEnableResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.GetEnableResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    int param2,
                                    org.wso2.carbon.andes.dataagent.publisher.GetURLValidation dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.GetURLValidation wrappedType = new org.wso2.carbon.andes.dataagent.publisher.GetURLValidation();

                                 
                                              wrappedType.setIP(param1);
                                         
                                              wrappedType.setPort(param2);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetURLValidation.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getGetURLValidationResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.GetURLValidationResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    java.lang.String param2,
                                    java.lang.String param3,
                                    java.lang.String param4,
                                    java.lang.String param5,
                                    java.lang.String param6,
                                    java.lang.String param7,
                                    java.lang.String param8,
                                    java.lang.String param9,
                                    org.wso2.carbon.andes.dataagent.publisher.SetConfig dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.SetConfig wrappedType = new org.wso2.carbon.andes.dataagent.publisher.SetConfig();

                                 
                                              wrappedType.setEnable(param1);
                                         
                                              wrappedType.setPublisher_name(param2);
                                         
                                              wrappedType.setUsername(param3);
                                         
                                              wrappedType.setPassword(param4);
                                         
                                              wrappedType.setIp(param5);
                                         
                                              wrappedType.setPort(param6);
                                         
                                              wrappedType.setMessage_stat(param7);
                                         
                                              wrappedType.setSystem_stat(param8);
                                         
                                              wrappedType.setMB_stat(param9);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.SetConfig.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getSetConfigResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.SetConfigResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfig dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfig wrappedType = new org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfig();

                                 
                                              wrappedType.setPublisher(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfig.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getGetMessageStatConfigResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfigResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.andes.dataagent.publisher.GetPort dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.GetPort wrappedType = new org.wso2.carbon.andes.dataagent.publisher.GetPort();

                                 
                                              wrappedType.setPublisher(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetPort.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private java.lang.String getGetPortResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.GetPortResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.andes.dataagent.publisher.GetUsername dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.andes.dataagent.publisher.GetUsername wrappedType = new org.wso2.carbon.andes.dataagent.publisher.GetUsername();

                                 
                                              wrappedType.setPublisher(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.andes.dataagent.publisher.GetUsername.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private java.lang.String getGetUsernameResponse_return(
                                org.wso2.carbon.andes.dataagent.publisher.GetUsernameResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.wso2.carbon.andes.dataagent.publisher.GetPassword.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetPassword.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetPasswordResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetPasswordResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfig.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfig.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfigResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetMBStatConfigResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSelector.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSelector.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSelectorResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSelectorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfig.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfig.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfigResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetsystemStatConfigResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetIP.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetIP.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetIPResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetIPResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetEnable.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetEnable.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetEnableResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetEnableResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetURLValidation.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetURLValidation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetURLValidationResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetURLValidationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherUnknownHostException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherUnknownHostException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.SetConfig.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.SetConfig.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.SetConfigResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.SetConfigResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherBadPaddingException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherBadPaddingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchPaddingException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchPaddingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchAlgorithmException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherNoSuchAlgorithmException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherTransformerException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherTransformerException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIllegalBlockSizeException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIllegalBlockSizeException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherInvalidKeyException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherInvalidKeyException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfig.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfig.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfigResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetMessageStatConfigResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetPort.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetPort.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetPortResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetPortResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetUsername.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetUsername.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.GetUsernameResponse.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.GetUsernameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherSAXException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.class.equals(type)){
                
                           return org.wso2.carbon.andes.dataagent.publisher.PublisherParserConfigurationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   