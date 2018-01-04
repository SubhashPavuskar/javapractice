package com.tecnotree.home.practice.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest
{
	public static void main(String args[])
	{
		EmployeeObj employeeObj1 = new EmployeeObj();
		employeeObj1.setEmpfirstName("subhash");
		employeeObj1.setEmpId(1001);
		employeeObj1.setEmplastName("Pavuskar");
		
		EmployeeObj employeeObj2 = new EmployeeObj();
		employeeObj2.setEmpfirstName("Deepak");
		employeeObj2.setEmpId(1004);
		employeeObj2.setEmplastName("Pawaskar");
		
		EmployeeObj employeeObj3 = new EmployeeObj();
		employeeObj3.setEmpfirstName("adhitya");
		employeeObj3.setEmpId(10012);
		employeeObj3.setEmplastName("Shekar");
		
		List<EmployeeObj>  list = new ArrayList<EmployeeObj>();
		
		list.add(employeeObj1);
		list.add(employeeObj2);
		list.add(employeeObj3);
		
		Collections.sort(list);
		System.out.println("Sorted Name are as follows::");
		for(EmployeeObj name : list)
		{
			System.out.println(name.getEmpfirstName());
		}
	}
	
}
