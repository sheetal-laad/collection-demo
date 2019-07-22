package HibernateDemo.com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrudOps {

	public static void main(String[] args)
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
session.beginTransaction();
System.out.println("transaction begin");
	}

}
