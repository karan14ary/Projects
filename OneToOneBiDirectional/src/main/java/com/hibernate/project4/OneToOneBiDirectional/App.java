package com.hibernate.project4.OneToOneBiDirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Bike2 bk1 = new Bike2();
		Bike2 bk2 = new Bike2();
		Bike2 bk3 = new Bike2();
		Student3 s1 = new Student3(11,"Ajay",22,bk1);
		Student3 s2 = new Student3 (12,"Ankit",24,bk2);
		Student3 s3 = new Student3 (13,"Anuj",25,bk3);
		bk1.setB_id(1);
		bk1.setName("Hero");
		bk1.setColor("Black");
		bk1.setS(s1);
		bk2.setB_id(2);
		bk2.setName("Ktm");
		bk2.setColor("Red");
		bk2.setS(s2);
		bk3.setB_id(3);
		bk3.setName("Honda");
		bk3.setColor("Blue");
		bk3.setS(s2);
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
