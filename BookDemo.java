import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class BookDemo {
	public static Connection getConnection()
	{
		Connection con=null; 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sheetal?autoReconnect=true&useSSL=false","root","root");
		}
		catch(Exception ex)
		{
			
		}
		return con;
	}

	public static void main(String[] args) {
		int bookId=0;
		String bookName=null;
		String author=null;
		Float price=0.0f;
		try
		{
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document doc=builder.parse("D:\\Advjava\\Collection\\src\\book.xml");
		  NodeList list=doc.getElementsByTagName("Book");
		 Connection con=BookDemo.getConnection();
		 PreparedStatement ps=null;
		  for(int i=0; i<list.getLength(); i++)
		  {
			  Node n=list.item(i);
	          Element e=(Element) n;
			 String BookId=e.getElementsByTagName("BookId").item(0).getTextContent();
			 bookId=Integer.parseInt(BookId);
			 bookName=e.getElementsByTagName("BookName").item(0).getTextContent();
			 author=e.getElementsByTagName("Author").item(0).getTextContent();
			 String Price=e.getElementsByTagName("Price").item(0).getTextContent();
			 price=Float.parseFloat(Price);
			 System.out.println(bookId+"===="+bookName+"====="+author+"======"+price);
			 
		     
			 String q="insert into book (BookId,BookName,Author,Price)values(?,?,?,?)";
			 ps=con.prepareStatement(q);
			 ps.setInt(1,bookId);
			 ps.setString(2,bookName);
			 ps.setString(3, author);
			 ps.setFloat(4,price);
			 ps.executeUpdate();
		  }
		}catch(Exception e)
		{
			
		}
	
	
			
	}

}
