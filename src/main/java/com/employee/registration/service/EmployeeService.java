package com.employee.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.registration.dao.EmployeeDAO;
import com.employee.registration.model.Employee;
import com.employee.registration.model.EmployeeForm;

public class EmployeeService {

	@Autowired
    private EmployeeDAO employeeDAO;
	
	public List<Employee> getEmployee(Long empId) {
		
		return employeeDAO.getAllEmployees();
				
	}

	public Employee addEmployee(EmployeeForm empForm) {
		return employeeDAO.addEmployee(empForm);
	}

}
