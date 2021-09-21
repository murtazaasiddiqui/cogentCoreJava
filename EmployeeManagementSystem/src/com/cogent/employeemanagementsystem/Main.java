package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;

public class Main {
	
	public static void main(String[] args) {
		
	EmployeeService employeeService = new EmployeeService();
	Employee employee = new Employee("ab100","murtaza","siddiqui",100.1f);
	String result = employeeService.addEmployee(employee);
	System.out.println(result);
	
	/**public static void main(String[] args) {
		Employee employee = new Employee();

		//ClassName reference object
		Employee employee2 = new Employee("ab100","murtaza","siddiqui",100.1f);
		
		System.out.println(employee2.getEmployeeId());
		
		Employee employee3 = null;
		//System.out.println(employee3.getAddress());
		int a =10;
		System.out.println(a);
		
		Employee employees[] = new Employee[10];
		for(int i =0; i<employees.length; i++) {
			employees[i] = new Employee();
		}
		
		for(Employee employee4 : employees) {
			System.out.println(employee4);
		}
		
		**/
		
		
		
		
		
		
}
	

}
