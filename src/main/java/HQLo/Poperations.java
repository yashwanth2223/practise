package HQLo;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;





public class Poperations {

	public static void main(String[] args) {
		
		Poperations po=new Poperations();
		
	}
	public void addclient()
	{
		 Configuration configuration = new Configuration();
		  configuration.configure("hibernate.cfg.xml");

		  SessionFactory sf = configuration.buildSessionFactory();
		  Session session = sf.openSession();
		  
		  Transaction t = session.beginTransaction();
		  
		  Client c=new Client();
		  
		  c.setId(1);
		  c.setName("alex");
		  c.setGender("Male");
		  c.setAge(20);
		  c.setLocation("canada");
		  c.setEmail("alex@gmail.com");
		  c.setCno("9999999999");
		  
		  
		  session.persist(c);
		  t.commit();
		  System.out.println("Client added");
		  session.close();
		  sf.close();
		  
	}
	
		
	
	

	
	
	
	
	
	
	
	

}
