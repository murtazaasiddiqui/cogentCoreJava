package com.cogent.employeemanagementsystem.model;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private float empSalary;
	private String address;
	//setter methods- to send value
	//to retrieve the values
	//we need getter methods - get the value
	public Employee(String employeeId, String firstName, String lastName, float empSalary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empSalary = empSalary; 
	}//this is a constructor.right click on source, generate cons field
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
