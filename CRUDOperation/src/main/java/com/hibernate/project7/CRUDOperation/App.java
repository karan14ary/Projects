package com.hibernate.project7.CRUDOperation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{ 
	static Scanner scan=new Scanner(System.in);
	public static void main( String[] args )
	{
		Laptop l1 = new Laptop(1,"Dell",75000);
		Laptop l2 = new Laptop(2,"Apple",125000);
		Laptop l3 = new Laptop(3,"HP",65000);
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		while(true) {
			Transaction transaction = session.beginTransaction();

			System.out.println("Enter 1 to create ,2 to retrieve,3 to update ,4 to delete and any other number to exit");
			int n=scan.nextInt();
			switch(n) {
			case 1:{
				create(session ,transaction,l1,l2,l3);
				break;
			}
			case 2:{
				retrieve(session ,transaction);
				break;
			}
			case 3 :{
				update(session ,transaction);
				break;
			}
			case 4:{
				delete(session ,transaction);
				break;
			}
			default:{
				System.exit(0);
			}
			}
		}
	}
	public static void create(Session session,Transaction transaction ,Laptop l1,Laptop l2,Laptop l3) {
		session.save(l1);
		session.save(l2);
		session.save(l3);
		transaction.commit();
		System.out.println("Object created");

	}
	public  static void retrieve(Session session,Transaction transaction) {
		System.out.println("Data retrieved"); 
		Laptop l1=session.get(Laptop.class, 1);
		System.out.println(l1);
		Laptop l2=session.get(Laptop.class, 2);
		System.out.println(l2);
		Laptop l3=session.get(Laptop.class, 3);
		System.out.println(l3);
		transaction.commit();
	}
	public  static void update(Session session,Transaction transaction) {
		System.out.println("Enter the id where you want to update");
		int id =scan.nextInt();
		System.out.println("Enter the updated price");
		int uprice=scan.nextInt();
		Laptop l=session.get(Laptop.class, id);
		l.setCost(uprice);
		session.update(l);
		transaction.commit();
		System.out.println("Data updated");
	}
	public  static void delete(Session session,Transaction transaction) {
		System.out.println("Enter the id of table row you want to delete");
		int id=scan.nextInt();
		Laptop l=session.get(Laptop.class, id);
		session.delete(l);
		transaction.commit();
	}

}
