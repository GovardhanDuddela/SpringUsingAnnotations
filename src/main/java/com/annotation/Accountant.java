package com.annotation;

import org.springframework.stereotype.Component;
@Component
public class Accountant implements Employee {

	public void doWork() {
	System.out.println("audit the accounts");
		
	}

}
