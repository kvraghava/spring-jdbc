package com.raghava.springbootjpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class SpringHibernateController {
	
	@Autowired
	HibernateRepository repository;

	@PostMapping()
	public String addEmployee(@RequestBody EmployeeDTO empDto ) {
		repository.save(propulateEmployee(empDto));
		return "success";
	}
	
	private Employee propulateEmployee(EmployeeDTO empDto) {
		return new Employee(empDto.getId(),empDto.getName(),empDto.getSalary());
	}
	
	@GetMapping
	public List<EmployeeDTO> getAllEmployee(){
		List<EmployeeDTO> empDtos= new ArrayList<>();
		List<Employee> emps = repository.findAll();
		for(Employee emp : emps) {
			empDtos.add(propulateEmployeeDTO(emp));
		}
		return empDtos;
	}
	
	private EmployeeDTO propulateEmployeeDTO(Employee emp) {
		return new EmployeeDTO(emp.getId(),emp.getName(),emp.getSalary());
	}
	
	@GetMapping("/{id}")
	public EmployeeDTO getEmployeeByID(@PathVariable int id) {
		return propulateEmployeeDTO(repository.getById(id));		
	}
	
	@PutMapping()
	public String updateEmployee(@RequestBody EmployeeDTO empDto ) {
		Employee emp = repository.getById(empDto.getId());
		if(emp != null) {
			repository.delete(propulateEmployee(empDto));
			repository.save(propulateEmployee(empDto));
			return "success";
		}
		return "failed";
	}
}
