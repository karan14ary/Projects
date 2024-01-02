package com.hibernate.project6.MTM;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	List<Employee>el1=new ArrayList<>();
    	List<Employee>el2=new ArrayList<>();
    	List<Employee>el3=new ArrayList<>();
    	List<Employee>el4=new ArrayList<>();
    	List<Technology>t1=new ArrayList<>();
    	List<Technology>t2=new ArrayList<>();
    	List<Technology>t3=new ArrayList<>();
    	List<Technology>t4=new ArrayList<>();
    	Employee e1=new Employee(11,"Prakash","Team-A",t1);
    	Employee e2=new Employee(12,"Praveen","Team-B",t2);
    	Employee e3=new Employee(13,"Pooja","Team-C",t3);
    	Employee e4=new Employee(14,"Priya","Team_A",t2);
    	Employee e5=new Employee(15,"Prateek","Team_B",t4);
    	el1.add(e1);
    	el1.add(e3);
    	el1.add(e5);
    	el2.add(e1);
    	el2.add(e2);
    	el2.add(e4);
    	el2.add(e5);
    	el3.add(e2);
    	el3.add(e4);
    	el3.add(e5);
    	el4.add(e1);
    	el4.add(e2);
    	el4.add(e3);
    	el4.add(e4);
    	el4.add(e5);
    	Technology te1=new Technology(123,"java",el1);
     	Technology te2=new Technology(124,"MySql",el2);
     	Technology te3=new Technology(125,"Python",el3);
     	Technology te4=new Technology(126,"React",el4);
    	t1.add(te1);
    	t1.add(te2);
    	t1.add(te4);
    	t2.add(te2);
    	t2.add(te3);
    	t2.add(te4);
    	t3.add(te1);
    	t3.add(te4);
    	t4.add(te1);
    	t4.add(te2);
    	t4.add(te3);
    	t4.add(te4);  	
    	Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(te1);
		session.save(te2);
		session.save(te3);
		session.save(te4);
		transaction.commit();
    }
}
