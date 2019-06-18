package com.employee.registration.test.controler;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.employee.registration.controler.EmployeeControler;
import com.employee.registration.dao.EmployeeDAO;
import com.employee.registration.model.Employee;
import com.employee.registration.model.EmployeeForm;

public class EmployeeTestControler {
	@InjectMocks
	EmployeeDAO employeeDAO;

	private MockMvc mock;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mock = MockMvcBuilders.standaloneSetup(EmployeeControler.class).build();

	}

	@Test
	public void getEmployee() {
		long id = 1L;
		Employee e = employeeDAO.getEmployee(id);
		if (e == null) {
			AssertionError a = new AssertionError(e);
			a.getMessage();
		}
	}

	@Test
	public void addEmployee() {
		long id = 1L;
		Date dob = null;
		EmployeeForm emp = new EmployeeForm(1L, "E01", "Smith", "female", dob, "Clerk");
		Employee e = employeeDAO.addEmployee(emp);
		if (e == null) {
			AssertionError a = new AssertionError(e);
			a.getMessage();
		}

	}

}
