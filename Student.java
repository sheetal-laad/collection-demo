package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;
@Path("/student")
@XmlRootElement
public class Student {
	public String fname;
	public String lname;
	public int sid;
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sheetal","root","root");
		}
		catch(Exception ex)
		{
			
		}
		return con;
	}
	@GET
	@Produces(MediaType.TEXT_XML)
	
	public Student[] getResult() throws SQLException
	{
		Student response[]=null;
		Student s1=new Student();
		try{
		ResultSet rs=getConnection().createStatement().executeQuery("select * from student");
		int i=0;
		while(rs.next())
		{
		s1.sid=rs.getInt(1);
		s1.fname=rs.getString(2);
		s1.lname=rs.getString(3);
		response[i]=s1;
    	// response[i]="<?xml version='1.0'?> <id>"+s1.sid+"</id><fname>"+s1.fname+"</fname><lname>"+s1.lname+"</lname>" ;
    	i++;
		 System.out.println("callee");
		}
		}
		catch(NullPointerException ex)
		{
			
		}
		return response;
	}

}
