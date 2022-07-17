package com.prowings.SpringBeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Student std = ctx.getBean("std", Student.class);
     	System.out.println(std);
    	
    	Employee emp = ctx.getBean("emp", Employee.class);
    	System.out.println(emp);
    	
    	Customer cust = ctx.getBean("cust", Customer.class);
    	System.out.println(cust);
    	
    	ctx.registerShutdownHook();
    }
}
