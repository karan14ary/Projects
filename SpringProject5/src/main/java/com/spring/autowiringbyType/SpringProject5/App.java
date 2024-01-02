package com.spring.autowiringbyType.SpringProject5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Car c=(Car)ctx.getBean("car");
		System.out.println(c);
		University u=(University)ctx.getBean("uni");
		System.out.println(u);
	}
}
