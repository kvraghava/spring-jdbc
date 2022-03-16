package com.spring.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

	public JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertEmployee(Employee e) {
		int id = e.getId();
		String name = e.getName();
		double salary = e.getSalary();
		Object[] params = { id, name, salary };
		String query = "insert into employee values(?,?,?)";
		return jdbcTemplate.update(query, params);
	}

	/*
	 * public Employee selectbyId(int eid) { String
	 * query="select *from employee where id="+eid; return jdbcTemplate.q }
	 */

	public List<Employee> selectAll() {
		List<Employee> employees = new ArrayList<>();
		List<Map<String, Object>> l = jdbcTemplate.queryForList("select *from emp_sj_1");
		
		for(Map row:l) {
			Employee emp = new Employee();
			emp.setId(Integer.parseInt(row.get("id").toString()));
			emp.setName(row.get("name").toString());
			emp.setSalary(Integer.parseInt(row.get("salary").toString()));
			employees.add(emp);
		}
		return employees;
	}

	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query("select * from emp_sj_1", new EmployeeExactor());			
	}
	
	public List<Employee> getAllEmpByRowmapper(){
		return jdbcTemplate.query("select * from emp_sj_1", new EmployeeRowMapper());
	}
}
