package com.ssi.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("s");
    	EntityManager entitymanager =entitymanagerfactory.createEntityManager();
    	
    	Employee e=entitymanager.find(Employee.class,4);
    System.out.println(e);
    }
}
