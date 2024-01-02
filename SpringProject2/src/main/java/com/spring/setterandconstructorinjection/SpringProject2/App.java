package com.spring.setterandconstructorinjection.SpringProject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	  ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	   Laptop l1=(Laptop)ctx.getBean("lap1");
    	   System.out.println(l1);
    	   Laptop l2=(Laptop)ctx.getBean("lap2");
    	   System.out.println(l2);
 
    }
}
