package com.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

	public JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee e) {
		String query="insert into emp_sj_1 values("+e.getId()+",'"+e.getName()+"',"+e.getSalary()+")";   
		return jdbcTemplate.update(query); 
	}
	
	public int updateEmployee(int eid, String ename) {
		String query="update emp_sj_1 set name='"+ename+"' where id="+eid;
		return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(int eid) {
		String query="delete from emp_sj_1 where id="+eid;
		return jdbcTemplate.update(query);
	}
}
