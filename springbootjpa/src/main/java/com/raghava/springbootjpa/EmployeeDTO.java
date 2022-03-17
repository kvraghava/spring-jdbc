package com.raghava.springbootjpa;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDTO {
	private int id;
	
	private String name;
	
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public EmployeeDTO(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
