package string.programs;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
public class XmlTagValidationTest {

	public static void main(String[] args) {
		String xmlString ="<fname><lname><city/></lname></fname>";
		if(isValidXML(xmlString))
		{
			System.out.println("The XML is well-formed.");	
		}else {
			System.out.println("The XML is not well formed.");
		}
	}
	public static boolean isValidXML(String xmlContent)
	{
		try {
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=factory.newDocumentBuilder();
			InputStream is=new ByteArrayInputStream(xmlContent.getBytes());
			
			Document document = builder.parse(is);
			return true; //successfully parsed, xml is well-formed
		}catch(Exception e)
		{
		//If any exception(e.g., SAXException, IOException) occurs, it's not well-formed	
		return false;
		}
	}

}
