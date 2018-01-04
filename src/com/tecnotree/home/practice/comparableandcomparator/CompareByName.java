package com.tecnotree.home.practice.comparableandcomparator;

import java.util.Comparator;

public class CompareByName implements Comparator<EmployeeObj>
{
	//Comparing By Name
	@Override
	public int compare(EmployeeObj obj1, EmployeeObj obj2)
	{
		return obj1.getEmpfirstName().compareToIgnoreCase(obj2.getEmpfirstName());
	}
}
