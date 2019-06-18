package com.employee.registration.model;

import java.util.Date;

public class Employee {
	
	private Long empId;
    private String empFName;
    private String empLName;
    private String gender;
    private Date dob;
    private String Dept;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=");
		builder.append(empId);
		builder.append(", empFName=");
		builder.append(empFName);
		builder.append(", empLName=");
		builder.append(empLName);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", Dept=");
		builder.append(Dept);
		builder.append("]");
		return builder.toString();
	}
	public Employee(Long empId, String empFName, String empLName, String gender, Date dob, String dept) {
		super();
		this.empId = empId;
		this.empFName = empFName;
		this.empLName = empLName;
		this.gender = gender;
		this.dob = dob;
		Dept = dept;
	}
	
	 public Employee(EmployeeForm employeeForm) {
		 this.empId = employeeForm.getEmpId();
			this.empFName = employeeForm.getEmpFName();
			this.empLName = employeeForm.getEmpLName();
			this.gender = employeeForm.getGender();
			this.dob = employeeForm.getDob();
			Dept = employeeForm.getDept();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Dept == null) ? 0 : Dept.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((empFName == null) ? 0 : empFName.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empLName == null) ? 0 : empLName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Dept == null) {
			if (other.Dept != null)
				return false;
		} else if (!Dept.equals(other.Dept))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (empFName == null) {
			if (other.empFName != null)
				return false;
		} else if (!empFName.equals(other.empFName))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empLName == null) {
			if (other.empLName != null)
				return false;
		} else if (!empLName.equals(other.empLName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		return true;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		Dept = dept;
	}
    
    
    

}
