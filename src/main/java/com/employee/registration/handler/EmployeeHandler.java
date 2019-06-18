package com.employee.registration.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.registration.model.Employee;
import com.employee.registration.model.EmployeeForm;
import com.employee.registration.service.EmployeeService;

@Component
public class EmployeeHandler {
	
	@Autowired
	EmployeeService   employeeService;

	public List<Employee> getEmployee(Long empId) {
		
		return employeeService.getEmployee(empId);
	}

	public Employee addEmployee(EmployeeForm empForm) {
		return employeeService.addEmployee(empForm);
	}

}
