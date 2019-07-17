package com.ssi.DemoHib;


import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
       Employee e1=new Employee();
       e1.setEid(8);
       e1.setEname("sheetal");
       e1.setGender("f");
       e1.setSalary(20000f);
       Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
       SessionFactory sf=con.buildSessionFactory();
       Session session=sf.openSession();
       org.hibernate.Transaction t=session.beginTransaction();
    	session.save(e1);
    	t.commit();
    	
    }
}
