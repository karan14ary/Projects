package com.hibernate.project2.Hibernateproject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
	public static void main( String[] args )
	{
		Student1 s1 = new Student1(11,"Ajay",22);
		Student1 s2 = new Student1 (12,"Ankit",24);
		Student1 s3 = new Student1 (13,"Anuj",25);
		Bike bk1 = new Bike(1,"Hero","Black");
		Bike bk2 = new Bike(2,"Honda","Blue");
		Bike bk3 = new Bike(3,"Ktm","Red");
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(bk1);
		session.save(bk2);
		session.save(bk3);
		
		transaction.commit();
	}
}
