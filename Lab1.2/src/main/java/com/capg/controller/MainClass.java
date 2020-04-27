package com.capg.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.beans.Employee;
import com.capg.config.ApplicationConfig;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Employee emp = con.getBean(Employee.class);
		System.out.println(emp);
	
	}
}
