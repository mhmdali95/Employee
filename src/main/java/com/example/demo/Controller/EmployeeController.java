package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.model.Employee;

@RestController	
@RequestMapping("/employee")
public class EmployeeController {
private EmployeeService empolyeeService;

public EmployeeController(EmployeeService empolyeeService) {
	super();
	this.empolyeeService = empolyeeService;
}
@GetMapping("/All")
public List<Employee> getAll(){
	return empolyeeService.getAllEmployee();
}


	
}
