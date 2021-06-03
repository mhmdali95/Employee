package com.example.demo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.model.Employee;

@Service
@Transactional

public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;

	

	public EmployeeService(EmployeeRepository employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}
 //getAll
	public List<Employee> getAllEmployee(){
		return employeeRepo.findAll();
	}
	
//deleteEmpolyee
	public void deleteEmployee(Long id) {
		employeeRepo.deleteEmployeeById(id);
	}
//AddEmployee
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
//UpdateEmployee
		public Employee updateEmployee(Employee employee) {
			return employeeRepo.save(employee);
		}
//GetbyID
		
}
