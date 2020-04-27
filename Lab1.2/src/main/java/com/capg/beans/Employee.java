package com.capg.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;
	
	@Autowired
	private SBU SBUDetails;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int employeeId, String employeeName, double salary, String businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	@Value("12345")
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	@Value("Harriet")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	@Value("40000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	
	@Value("40")
	public void setAge(int age) {
		this.age = age;
	}

	public SBU getSBUDetails() {
		return SBUDetails;
	}

	public void setSBUDetails(SBU SBUDetails) {
		this.SBUDetails = SBUDetails;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+", age=" + age + ",\nSBUDetails=" + SBUDetails + "]";
	}
	
	
}
