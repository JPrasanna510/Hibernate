package com.prasanna.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration();
    	con.configure("hibernate.cfg.xml");
    	con.addAnnotatedClass(Song.class);
    	SessionFactory sf = con.buildSessionFactory();
    	
    	    	
    	//initialize the session object
    	
    	Session session = sf.openSession();
    	
    	
    	Song song1=new Song();
    	song1.setId(5);
    	song1.setSongName("some song");
    	song1.setSinger("XYZ");
    	session .beginTransaction();
    	
    	
    	session.save(song1);
    	session.getTransaction().commit();
    	
    	System.out.println("saved..");
    	session.close();
    	Session session1 = sf.openSession();
    	session1.beginTransaction();
    	session1.save(new Song(4,"another","ABC"));
    	session1.getTransaction().commit();
    	session1.close();
    	
    	
    }
    
    
}
