package com.annotation;

import org.springframework.stereotype.Component;
@Component
public class Manager implements Employee {

	public void doWork() {
		System.out.println("manager is working");
	}

}
