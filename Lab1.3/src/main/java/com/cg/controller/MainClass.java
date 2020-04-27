package com.cg.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.beans.Employee;
import com.cg.beans.SBU;
import com.cg.config.AppConfig;

public class MainClass {

		public static void main(String[] args) {
			
			ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
			SBU sbu = con.getBean(SBU.class);
			System.out.println(sbu);

		}

}
