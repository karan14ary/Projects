package com.spring.wiring.SpringProject3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
       Trainer tr=(Trainer)ctx.getBean("trainer");
       System.out.println(tr);
       Kodnest kod=(Kodnest)ctx.getBean("kod");
       System.out.println(kod);
    }
}
