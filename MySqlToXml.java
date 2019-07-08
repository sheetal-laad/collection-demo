import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;


public class MySqlToXml {

	public static void main(String[] args) {
		File f=new File("D:\\Advjava\\XMLToJava\\src\\book1.xml");
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document doc=builder.newDocument();
			Element root=doc.createElement("BookStore");
			Element book=doc.createElement("Book");
			Element bookId=doc.createElement("BookId");
			Text idvalue=doc.createTextNode("101");
			bookId.appendChild(idvalue);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		
		

	}

}
