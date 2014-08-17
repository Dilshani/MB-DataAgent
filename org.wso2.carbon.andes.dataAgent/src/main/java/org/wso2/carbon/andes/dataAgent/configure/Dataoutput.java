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

    private boolean enable;
    private boolean message;
    private boolean system;
    private boolean mb;
    private String username = "";
    private String password = "";
    private String ip = "";
    private String port = "";
    private String encryptPW;

    public Dataoutput(String publisher) throws ParserConfigurationException,
            SAXException, IOException {

        String filepath = "repository/conf/stat-config.xml";
        String publishBAM = "BAM";
        String publishCEP = "CEP";


        // get XML file
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc;

        File file = new File(filepath);

        // check doc stat-config.xml exist or not
        if (!file.exists()) {

            System.err.println("stat-config.xml doesn't exists!!");

        } else {

            // Get doc if stat-config.xml exists

            doc = docBuilder.parse(filepath);

            // normalize text representation
            doc.getDocumentElement().normalize();

            // check the parameter to select BAM or CEP publisher

            // Parsed parameter given as BAM
            if (publishBAM.equals(publisher)) {


                // Get attribute value
                Node publishers = doc.getElementsByTagName("publisher").item(0);
                NamedNodeMap attr = publishers.getAttributes();
                Node nodeAttr = attr.getNamedItem("name");
                String value = nodeAttr.getNodeValue().toString();
                NodeList dataList = doc.getElementsByTagName("publisher");


                // Getting values in BAM Publisher

                String enableValue =
                        (String) ((Element) dataList.item(0)).getElementsByTagName("enable")
                                .item(0)
                                .getTextContent();

                if (enableValue == "") {
                    enable = false;
                } else {

                    String enabled = enableValue.trim();
                    enable = Boolean.parseBoolean(enabled);

                }

                String messageValue =
                        (String) ((Element) dataList.item(0)).getElementsByTagName("message")
                                .item(0)
                                .getTextContent();

                if (messageValue == "") {
                    message = false;
                } else {

                    String msgvl = messageValue.trim();
                    message = Boolean.parseBoolean(msgvl);

                }

                String systemValue =
                        (String) ((Element) dataList.item(0)).getElementsByTagName("system")
                                .item(0)
                                .getTextContent();

                if (systemValue == "") {
                    system = false;
                } else {

                    String sysvl = systemValue.trim();
                    system = Boolean.parseBoolean(sysvl);

                }

                String mbValue =
                        (String) ((Element) dataList.item(0)).getElementsByTagName("mb")
                                .item(0)
                                .getTextContent();

                if (mbValue == "") {
                    mb = false;
                } else {

                    String mbvl = mbValue.trim();
                    mb = Boolean.parseBoolean(mbvl);

                }


                String usrName =
                        (String) ((Element) dataList.item(0)).getElementsByTagName("username")
                                .item(0)
                                .getTextContent();

                username = usrName.trim();
                String pw =
                        (String) ((Element) dataList.item(0)).getElementsByTagName("password")
                                .item(0).getTextContent();
                encryptPW = pw.trim();
                password = decrypt(encryptPW);

                String ipAddress =
                        (String) ((Element) dataList.item(0)).getElementsByTagName("ip")
                                .item(0)
                                .getTextContent();

                ip = ipAddress.trim();

                String portAddress =
                        (String) ((Element) dataList.item(0)).getElementsByTagName("port")
                                .item(0)
                                .getTextContent();
                port = portAddress.trim();


            }

            // Parsed parameter given as CEP
            else if (publishCEP.equals(publisher)) {

                // Get attribute value
                Node publishers = doc.getElementsByTagName("publisher").item(1);
                NamedNodeMap attr = publishers.getAttributes();
                Node nodeAttr = attr.getNamedItem("name");
                String value = nodeAttr.getNodeValue().toString();
                NodeList dataList = doc.getElementsByTagName("publisher");

                // Getting values in CEP Publisher

                String enableValue =
                        (String) ((Element) dataList.item(1)).getElementsByTagName("enable")
                                .item(0)
                                .getTextContent();
                if (enableValue == "") {
                    enable = false;
                } else {

                    String enabled = enableValue.trim();
                    enable = Boolean.parseBoolean(enabled);

                }

                String messageValue =
                        (String) ((Element) dataList.item(1)).getElementsByTagName("message")
                                .item(0)
                                .getTextContent();

                if (messageValue == "") {
                    message = false;
                } else {

                    String msgvl = messageValue.trim();
                    message = Boolean.parseBoolean(msgvl);

                }

                String systemValue =
                        (String) ((Element) dataList.item(1)).getElementsByTagName("system")
                                .item(0)
                                .getTextContent();

                if (systemValue == "") {
                    system = false;
                } else {

                    String sysvl = systemValue.trim();
                    system = Boolean.parseBoolean(sysvl);

                }

                String mbValue =
                        (String) ((Element) dataList.item(1)).getElementsByTagName("mb")
                                .item(0)
                                .getTextContent();

                if (mbValue == "") {
                    mb = false;
                } else {

                    String mbvl = mbValue.trim();
                    mb = Boolean.parseBoolean(mbvl);

                }

                String usrName =
                        (String) ((Element) dataList.item(1)).getElementsByTagName("username")
                                .item(0)
                                .getTextContent();
                username = (String) (usrName.trim());

                String pw =
                        (String) ((Element) dataList.item(1)).getElementsByTagName("password")
                                .item(0).getTextContent();
                encryptPW = pw.trim();
                password = decrypt(encryptPW);

                String ipAddress =
                        (String) ((Element) dataList.item(1)).getElementsByTagName("ip")
                                .item(0)
                                .getTextContent();
                ip = ipAddress.trim();

                String portAddress =
                        (String) ((Element) dataList.item(1)).getElementsByTagName("port")
                                .item(0)
                                .getTextContent();
                port = portAddress.trim();
            } else {

                System.err.println("Unknown value in XML!!!");
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

    public boolean isEnable() {
        return enable;
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
        return message;
    }

    public boolean getSystemStatConfig() {
        return system;
    }

    public boolean getMBStatConfig() {
        return mb;
    }
}