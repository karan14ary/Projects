package com.hibernate.project3.OneToOneUnidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Bike1 bk1 = new Bike1(1,"Hero","Black");
		Bike1 bk2 = new Bike1(2,"Honda","Blue");
		Bike1 bk3 = new Bike1(3,"Ktm","Red");
    	Student2 s1 = new Student2(11,"Ajay",22,bk1);
		Student2 s2 = new Student2 (12,"Ankit",24,bk2);
		Student2 s3 = new Student2 (13,"Anuj",25,bk3);
	
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

