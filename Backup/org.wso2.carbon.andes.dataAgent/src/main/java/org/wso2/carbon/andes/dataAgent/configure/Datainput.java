package org.wso2.carbon.andes.dataAgent.configure;


/**
 * Created by nipuna on 7/17/14.
 */

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.tomcat.util.codec.binary.Base64;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Datainput {

    private static byte[] key = {0x54, 0x69, 0x69, 0x73, 0x49, 0x73, 0x46,
            0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79};// "Encryption key";

    private String filepath = "repository/conf/stat-config.xml";

    public boolean writeConfig(String enable, String publisher_name,
                               String username, String password, String ip, String port,
                               String message_stat, String system_stat, String MB_stat)
            throws ParserConfigurationException, SAXException, IOException,
            TransformerException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {

        int node_index = 0;
        Document doc = null;
        String publisher_name_attribute_value = "";

        DocumentBuilderFactory docFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        File file = new File(filepath);

        // check doc stat-config.xml exist or not
        if (!file.exists()) {

            // Generate stat-config.xml

            doc = docBuilder.newDocument();
            createXML(filepath, doc);
            doc = docBuilder.parse(filepath);

        } else {

            // Get doc if stat-config.xml exists

            doc = docBuilder.parse(filepath);

        }

        Node publisher = doc.getElementsByTagName("publisher").item(node_index);
        NamedNodeMap name_attr = publisher.getAttributes();
        Node nodeAttr = name_attr.getNamedItem("name");
        publisher_name_attribute_value = nodeAttr.getNodeValue().toString();

        if (!publisher_name.equals(publisher_name_attribute_value)) {

            node_index = 1;

        }

        // set enable value

        Node enable_node = doc.getElementsByTagName("enable").item(node_index);
        enable_node.setTextContent(enable);

        // set user name value

        Node username_node = doc.getElementsByTagName("username").item(
                node_index);
        username_node.setTextContent(username);

        // set password value

        Node password_node = doc.getElementsByTagName("password").item(
                node_index);
        String enc_password = encrypt(password);
        password_node.setTextContent(enc_password);

        // set IP value

        Node ip_node = doc.getElementsByTagName("ip").item(node_index);
        ip_node.setTextContent(ip);

        // set port value

        Node port_node = doc.getElementsByTagName("port").item(node_index);
        port_node.setTextContent(port);

        // set message statistic value

        Node message_stat_node = doc.getElementsByTagName("message").item(
                node_index);
        message_stat_node.setTextContent(message_stat);

        // set system statistic value

        Node system_stat_node = doc.getElementsByTagName("system").item(
                node_index);
        system_stat_node.setTextContent(system_stat);

        // set MB statistic value

        Node MB_stat_node = doc.getElementsByTagName("mb").item(node_index);
        MB_stat_node.setTextContent(MB_stat);

        // write the content into XML file

        TransformerFactory transformerFactory = TransformerFactory
                .newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filepath));
        transformer.transform(source, result);

        return true;
    }

    // password encryption method

    private static String encrypt(String strToEncrypt) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        final String encryptedString = Base64.encodeBase64String(cipher
                .doFinal(strToEncrypt.getBytes()));
        return encryptedString;


    }

    // create stat-config.xml method
    private boolean createXML(String filepath, Document doc)
            throws TransformerException {

        // Create root element publishers

        Element rootElement = doc.createElement("publishers");
        doc.appendChild(rootElement);
        Node publisherListElement = rootElement;

        String[] publisher_array = {"BAM", "CEP"};

        for (int i = 0; i < 2; i++) {

            // Create element publisher

            Element publisher_Element = doc.createElement("publisher");
            publisherListElement.appendChild(publisher_Element);

            // Create attribute name in publisher element

            Attr publisher_name_attribute = doc.createAttribute("name");
            publisher_Element.setAttributeNode(publisher_name_attribute);
            publisher_name_attribute.setTextContent(publisher_array[i]);

            // Create enable element

            Element enableElement = doc.createElement("enable");
            publisher_Element.appendChild(enableElement);

            // Create authentication element

            Element authenticationElement = doc.createElement("authentication");
            publisher_Element.appendChild(authenticationElement);

            // Create user name node authentication element

            Element username_node = doc.createElement("username");
            authenticationElement.appendChild(username_node);

            // Create password node authentication element

            Element password_node = doc.createElement("password");
            authenticationElement.appendChild(password_node);

            // Create transport element

            Element transportElement = doc.createElement("transport");
            publisher_Element.appendChild(transportElement);

            // Create IP node in transport element

            Element ip_node = doc.createElement("ip");
            transportElement.appendChild(ip_node);

            // Create port node in transport element

            Element port_node = doc.createElement("port");
            transportElement.appendChild(port_node);

            // Create statistic element

            Element statElement = doc.createElement("statistic");
            publisher_Element.appendChild(statElement);

            // Create message node in statistic element

            Element message_node = doc.createElement("message");
            statElement.appendChild(message_node);

            // Create system node in statistic element

            Element system_node = doc.createElement("system");
            statElement.appendChild(system_node);

            // Create MB node in statistic element

            Element MB_node = doc.createElement("mb");
            statElement.appendChild(MB_node);

        }
        // write the content into XML file

        TransformerFactory transformerFactory = TransformerFactory
                .newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filepath));
        transformer.transform(source, result);

        return true;
    }

}
