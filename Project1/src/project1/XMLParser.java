package project1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.ByteArrayInputStream;

import org.w3c.dom.Node;

public class XMLParser {
    public static void main(String[] args) {
        try {
            String xmlString = "<?xml version = '1.0' encoding = 'UTF-8' standalone = 'yes'?>\n" +
                    "<serverQueues>\n" +
                    "   <job id=\"3\" queueType=\"past\">\n" +
                    "      <name>test.rdf</name>\n" +
                    "      <type>report</type>\n" +
                    "      <status code=\"4\">Finished successfully</status>\n" +
                    "      <owner>RWUser</owner>\n" +
                    "      <server>repserv</server>\n" +
                    "      <destination>\n" +
                    "         <desType>cache</desType>\n" +
                    "         <desFormat>html</desFormat>\n" +
                    "         <file>21748116.htm</file>\n" +
                    "         <file>217481161.jpg</file>\n" +
                    "         <file>217481160.jpg</file>\n" +
                    "      </destination>\n" +
                    "      <timingInfo>\n" +
                    "         <queued>27-May-2003 10:21:50</queued>\n" +
                    "         <started>27-May-2003 10:21:50</started>\n" +
                    "         <finished>27-May-2003 10:21:51</finished>\n" +
                    "      </timingInfo>\n" +
                    "   </job>\n" +
                    "</serverQueues>";

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(xmlString.getBytes()));

            //            NodeList finishedList = doc.getElementsByTagName("finished");
            //            Element finishedElement = (Element) finishedList.item(0);
            //            String finishedData = finishedElement.getTextContent();
            //
            //            System.out.println("Finished Data: " + finishedData);
            NodeList timingInfoList = doc.getElementsByTagName("timingInfo");
            Element timingInfoElement = (Element) timingInfoList.item(0);

            NodeList timingValues = timingInfoElement.getChildNodes();
            for (int i = 0; i < timingValues.getLength(); i++) {
                Node node = timingValues.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element timingValue = (Element) node;
                    System.out.println(timingValue.getNodeName() + ": " + timingValue.getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
