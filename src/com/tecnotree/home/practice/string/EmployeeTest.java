package com.tecnotree.home.practice.string;

import java.util.Arrays;

public class EmployeeTest
{
	public static void main(String args[])
	{
		Employee[] employee = new Employee[5];
		employee[0] = new Employee("Subhash", 1001, "Bangalore", 10000);
		employee[1] = new Employee("Deepak", 1005, "Bangalore", 50000);
		employee[2] = new Employee("Rajesh", 1006, "Bangalore", 70000);
		employee[3] = new Employee("Gopal", 1003, "Bangalore", 30000);
		employee[4] = new Employee("Arya", 1004, "Bangalore", 20000);
		
		
		Arrays.sort(employee);
		System.out.println("Sorted Employee List:: "+Arrays.toString(employee));
	}
}
