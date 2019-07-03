package book;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/book")
public class Book {
	@GET
	@Produces(MediaType.TEXT_XML)
	
	public String sayHello()
	{
		String response="<? xml version='1.0' ?>" +"<hello>hello world<hello>";
		return response;
	}
	
	

}
