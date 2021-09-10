package com.spring.jdbc;

import java.util.List;

public class EmployeeService {
	
	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	public void insertEmployee() {
		int status = employeeDAO.insertEmployee(new Employee(102,"Sreekanth",70000));
		System.out.println("insert status="+status);
	}
	
	public void selectAll() {
		List<Employee> emps = employeeDAO.selectAll();
		for(Employee emp : emps) {
			System.out.println("data = "+emp);
		}
	}
	
	public void getAllEmployee() {
		List<Employee> emps = employeeDAO.getAllEmployees();
		for(Employee emp : emps) {
			System.out.println(emp);
		}
	}
	
	public void getAllEmpRowMapper() {
		List<Employee> emps = employeeDAO.getAllEmpByRowmapper();
		for(Employee emp : emps) {
			System.out.println(emp);
		}
	}
}
