package com.raghava.springbootjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
	@Autowired
	JdbcTemplate jdbc;

	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into emp_sj_1(id,name,salary)values(105,'raghava',100000)");
		return "data inserted Successfully";
	}
}
