package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e=(Employee)context.getBean("manager");
		e.doWork();
		Employee a=(Employee)context.getBean("accountant");
		a.doWork();
		
		
	}

}
