package com.DataStructure.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class main1 {

	public static void main(String[] args) {
		
		//by default, the size of the List is 10 if we don't specify
		List<Employee> employeeList = new ArrayList<>();
		
		//add to the emplyeeList
		employeeList.add(new Employee("Jane","Jones",123));
		employeeList.add(new Employee("Suraj", "Gupta", 65484));
		employeeList.add(new Employee("Sumit", "Havaldar", 954));
		
		//prints each Employee from the list
		employeeList.forEach(employee -> System.out.println(employee));
		
		//gets the employee at specific index
		System.out.println(employeeList.get(1));
		
		//checks whether the List is empty or not
		System.out.println(employeeList.isEmpty());
		
		//replaces with the new Employee
		employeeList.set(0, new Employee("Sakshi", "Gupta", 3256));
		employeeList.forEach(employee -> System.out.println(employee));
		
		//verifies how many employees are stored in the list and return the value
		System.out.println(employeeList.size());
		
		//adds the employee at specific index without replacing any employee
		employeeList.add(1, new Employee("Janes", "Jones", 123));
		employeeList.forEach(employee -> System.out.println(employee));
		
		//stores all the elements of the list in the array
		//Employee[] employeeArr = employeeList.toArray(new Employee[employeeList.size()]);
		
		//removes the employee at specific index
		employeeList.remove(2);
		employeeList.forEach(employee -> System.out.println(employee));
	}

}
