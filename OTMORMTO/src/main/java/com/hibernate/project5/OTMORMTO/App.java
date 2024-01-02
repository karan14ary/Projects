package com.hibernate.project5.OTMORMTO;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
	public static void main( String[] args )
	{

		List <Product>li1 =new ArrayList<>();
		List <Product>li2 =new ArrayList<>();

		Customer c1=new Customer(11,"Ankit",23,li1);
		Customer c2=new Customer(12,"Ajay",25,li2);
		Product p1=new Product(1111,"watch",4500,c1);
		Product p2=new Product(2222,"Mobile",35000,c1);
		Product p3=new Product(3333,"Laptop",86000,c2);
		Product p4=new Product(4444,"Bike",145000,c2);
		li1.add(p1);
		li1.add(p2);
		li2.add(p3);
		li2.add(p4);
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(c1);
		session.save(c2);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);

		transaction.commit();

	}
}
