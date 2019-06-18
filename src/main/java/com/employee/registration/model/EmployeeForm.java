package com.employee.registration.model;

import java.util.Date;

public class EmployeeForm {
	
	private Long empId;
    private String empFName;
    private String empLName;
    private String gender;
    private Date dob;
    private String Dept;
    
    
    public EmployeeForm(Long empId, String empFName, String empLName, String gender, Date dob, String dept) {
		super();
		this.empId = empId;
		this.empFName = empFName;
		this.empLName = empLName;
		this.gender = gender;
		this.dob = dob;
		Dept = dept;
	}
	/**
	 * @return the empId
	 */
	public Long getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	/**
	 * @return the empFName
	 */
	public String getEmpFName() {
		return empFName;
	}
	/**
	 * @param empFName the empFName to set
	 */
	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}
	/**
	 * @return the empLName
	 */
	public String getEmpLName() {
		return empLName;
	}
	/**
	 * @param empLName the empLName to set
	 */
	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return Dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		Dept = dept;
	}
    
    

}
