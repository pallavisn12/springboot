package com.employee.registration.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.registration.handler.EmployeeHandler;
import com.employee.registration.model.Employee;
import com.employee.registration.model.EmployeeForm;

@RestController
@RequestMapping("/employee")
public class EmployeeControler {

	@Autowired
	EmployeeHandler employeeHandler;

	@RequestMapping(value = "/getEmployee", //
			method = RequestMethod.PUT, //
			produces = { MediaType.APPLICATION_JSON_VALUE, //
					MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public List<Employee> getEmployee(@RequestBody Long empId) {

		return employeeHandler.getEmployee(empId);
	}
	@RequestMapping(value = "/addEmployee", //
            method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee addEmployee(@RequestBody EmployeeForm empForm) {
  
        return employeeHandler.addEmployee(empForm);
    }
	
	
}
