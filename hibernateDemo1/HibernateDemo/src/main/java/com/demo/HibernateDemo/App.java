package com.demo.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Student ob=new Student();
    	ob.setSid(1);
    	ob.setName("sheetal");
    	ob.setAge(20);
       Configuration con=new Configuration().configure("hibernate.cfg.xml");
       SessionFactory sf=con.buildSessionFactory();
       Session s=sf.openSession();
       s.beginTransaction();
       s.save(ob);
       s.getTransaction().commit();
       s.close();
       sf.close();
    }
}
