package com.capg.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.beans.Employee;
import com.capg.config.Config;

public class AnnotationMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee emp = context.getBean(Employee.class);
		System.out.println("Employee details");
		System.out.println("---------------------");
		System.out.println("Employee Id : "+emp.getEmployeeId());
		System.out.println("Employee Name : "+emp.getEmployeeName());
		System.out.println("Employee Salary : "+emp.getSalary());
		System.out.println("Employee BU : "+emp.getBusinessUnit());
		System.out.println("Employee Age : "+emp.getAge());

	}
}
