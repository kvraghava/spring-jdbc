package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");  
	      
	    EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");  
	    //int status=dao.saveEmployee(new Employee(102,"suresh",70000));  
	    int status=dao.updateEmployee(102, "SreeKanth");
	    //int status = dao.deleteEmployee(102);
	    System.out.println("status ="+status);
	}

}
