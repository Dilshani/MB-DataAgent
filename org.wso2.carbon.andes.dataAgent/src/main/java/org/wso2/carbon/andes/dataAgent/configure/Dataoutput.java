package org.wso2.carbon.andes.dataAgent.configure;


/**
 * Created by dilshani on 7/17/14.
 */

import java.io.File;
import java.io.IOException;

import org.apache.tomcat.util.codec.binary.Base64;
import org.w3c.dom.*;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Dataoutput {

    private String username;
    private String password;
    private String ip;
    private String port;
    private String encryptPW;

    public Dataoutput(String publisher) throws ParserConfigurationException,
            SAXException, IOException {

        String filepath = "repository/conf/stat-config.xml";
        String publishBAM = "BAM";
        String publishCEP = "CEP";

        // get XML file
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(new File(filepath));

        // normalize text representation
        doc.getDocumentElement().normalize();

        // check the parameter to select BAM or CEP publisher

        // Parsed parameter given as BAM
        if (publishBAM.equals(publisher)) {

			/*
             * Reading data in XML can be proceed directly with parsed parameter
			 * value. But in here, to ensure reliability it will be checking
			 * attribute values in XML again.
			 */

            // Get attribute value
            Node publishers = doc.getElementsByTagName("publisher").item(0);
            NamedNodeMap attr = publishers.getAttributes();
            Node nodeAttr = attr.getNamedItem("name");
            String value = nodeAttr.getNodeValue().toString();

            // Check attribute value against parsed value
            if (publishBAM.equals(value)) {

                // getting values in BAM Publisher

                NodeList datalist = doc.getElementsByTagName("publisher");
                String uname = (String) ((Element) datalist.item(0))
                        .getElementsByTagName("username").item(0)
                        .getChildNodes().item(0).getNodeValue();
                username = uname.trim();
                String pw = (String) ((Element) datalist.item(0))
                        .getElementsByTagName("password").item(0)
                        .getChildNodes().item(0).getNodeValue();
                encryptPW = pw.trim();
                password = decrypt(encryptPW);
                String ipAddress = (String) ((Element) datalist.item(0))
                        .getElementsByTagName("ip").item(0).getChildNodes()
                        .item(0).getNodeValue();
                ip = ipAddress.trim();
                String portAddress = (String) ((Element) datalist.item(0))
                        .getElementsByTagName("port").item(0).getChildNodes()
                        .item(0).getNodeValue();
                port = portAddress.trim();

            } else if (publishCEP.equals(value)) {

                // Getting values in CEP Publisher

                NodeList datalist = doc.getElementsByTagName("publisher");
                String uname = (String) ((Element) datalist.item(1))
                        .getElementsByTagName("username").item(0)
                        .getChildNodes().item(0).getNodeValue();
                username = uname.trim();
                String pw = (String) ((Element) datalist.item(1))
                        .getElementsByTagName("password").item(0)
                        .getChildNodes().item(0).getNodeValue();
                encryptPW = pw.trim();
                password = decrypt(encryptPW);
                String ipAddress = (String) ((Element) datalist.item(1))
                        .getElementsByTagName("ip").item(0).getChildNodes()
                        .item(0).getNodeValue();
                ip = ipAddress.trim();
                String portAddress = (String) ((Element) datalist.item(1))
                        .getElementsByTagName("port").item(0).getChildNodes()
                        .item(0).getNodeValue();
                port = portAddress.trim();
            } else {
                System.out.println("Unknown value in XML!!!");
            }
        }
        // Parsed parameter given as CEP
        else {

            // Get attribute value
            Node publishers = doc.getElementsByTagName("publisher").item(1);
            NamedNodeMap attr = publishers.getAttributes();
            Node nodeAttr = attr.getNamedItem("name");
            String value = nodeAttr.getNodeValue().toString();

            // Check attribute value against parsed value
            if (publishBAM.equals(value)) {

                // getting values in BAM Publisher

                NodeList datalist = doc.getElementsByTagName("publisher");
                String uname = (String) ((Element) datalist.item(0))
                        .getElementsByTagName("username").item(0)
                        .getChildNodes().item(0).getNodeValue();
                username = uname.trim();
                String pw = (String) ((Element) datalist.item(0))
                        .getElementsByTagName("password").item(0)
                        .getChildNodes().item(0).getNodeValue();
                encryptPW = pw.trim();
                password = decrypt(encryptPW);
                String ipAddress = (String) ((Element) datalist.item(0))
                        .getElementsByTagName("ip").item(0).getChildNodes()
                        .item(0).getNodeValue();
                ip = ipAddress.trim();
                String portAddress = (String) ((Element) datalist.item(0))
                        .getElementsByTagName("port").item(0).getChildNodes()
                        .item(0).getNodeValue();
                port = portAddress.trim();

            } else if (publishCEP.equals(value)) {

                // Getting values in CEP Publisher

                NodeList datalist = doc.getElementsByTagName("publisher");
                String uname = (String) ((Element) datalist.item(1))
                        .getElementsByTagName("username").item(0)
                        .getChildNodes().item(0).getNodeValue();
                username = uname.trim();
                String pw = (String) ((Element) datalist.item(1))
                        .getElementsByTagName("password").item(0)
                        .getChildNodes().item(0).getNodeValue();
                encryptPW = pw.trim();
                password = decrypt(encryptPW);
                String ipAddress = (String) ((Element) datalist.item(1))
                        .getElementsByTagName("ip").item(0).getChildNodes()
                        .item(0).getNodeValue();
                ip = ipAddress.trim();
                String portAddress = (String) ((Element) datalist.item(1))
                        .getElementsByTagName("port").item(0).getChildNodes()
                        .item(0).getNodeValue();
                port = portAddress.trim();
            } else {
                System.out.println("Unknown value in XML!!!");
            }

        }

    }

    private static byte[] key = {0x54, 0x69, 0x69, 0x73, 0x49, 0x73, 0x46,
            0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79};// "thisIsASecretKey";

    public static String decrypt(String strToDecrypt) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            final String decryptedString = new String(cipher.doFinal(Base64
                    .decodeBase64(strToDecrypt)));
            return decryptedString;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    // Getter methods for parameters

    public boolean getEnable() {
        return true;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }

    public boolean getMessageStatConfig() {
        return true;
    }

    public boolean getsystemStatConfig() {
        return true;
    }

    public boolean getMBStatConfig() {
        return true;
    }
}
