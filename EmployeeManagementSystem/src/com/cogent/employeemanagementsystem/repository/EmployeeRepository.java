package com.cogent.employeemanagementsystem.repository;

import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepository {

	
	private Employee employees[] = new Employee[10];
	//Employee is the class name and employee[] array references
	
	private EmployeeRepository(){
		
	}
	private static EmployeeRepository employeeRepository;
	
	public static EmployeeRepository getInstance() {
		
		if(employeeRepository == null) {
			employeeRepository = new EmployeeRepository();
			return employeeRepository;
		}
		return employeeRepository;
		
	}
	//static creates only one copy
	static int counter = -1;
	public String addEmployee(Employee employee) {
		
		
		if(counter >= employees.length) {
			return "array is full";
		}
		
		employees[++counter] = employee;
		return "succcess";
	}
	
	//this method gives us employee details on the basis of id
		public Employee getEmployeeById(String id) {
			
			for(Employee employee : employees) {
				
				if(id.equals(employee.getEmployeeId()) && employee != null){
					return employee;
				}
				
			}
			return null;
			
		}

	
	
	
}
