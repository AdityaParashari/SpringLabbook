package com.cg.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.beans.Employee;
import com.cg.beans.SBU;
import com.mysql.fabric.xmlrpc.base.Array;

@Configuration
public class AppConfig {

	@Bean
	public SBU getsbu()
	{
		Employee emp1 = new Employee();
		emp1.setEmpId(1234);
		emp1.setEmpName("Aditya");
		emp1.setSalary(40000);
		Employee emp2 = new Employee();
		emp2.setEmpId(5678);
		emp2.setEmpName("Ramesh");
		emp2.setSalary(50000);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		
		SBU sbu = new SBU();
		sbu.setSbuCode("PSE BU");
		sbu.setSbuHead("Kiran Rao");
		sbu.setSbuName("Product Engineering Services");
		sbu.setEmpList(empList);
		
		return sbu;
}
	
}	
