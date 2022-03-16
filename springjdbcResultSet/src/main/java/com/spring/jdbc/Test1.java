package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");  
	      
		EmployeeService empService = (EmployeeService)ctx.getBean("emp");
		//empService.insertEmployee();
		empService.selectAll();
		empService.getAllEmployee();
		empService.getAllEmpRowMapper();
	    //System.out.println(status);
	}

}
