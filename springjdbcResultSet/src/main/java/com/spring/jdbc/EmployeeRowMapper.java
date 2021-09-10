package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setSalary(rs.getDouble(3));
		return e;
	}

}
