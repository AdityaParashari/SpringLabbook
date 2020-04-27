package com.capg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.capg.beans.Employee;

@Configuration
@ComponentScan("com.capg.beans")
public class Config {
	
	/*
	 * @Bean public Employee getEmployee() { return new Employee(); }
	 */

}
