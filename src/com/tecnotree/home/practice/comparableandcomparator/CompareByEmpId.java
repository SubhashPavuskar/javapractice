package com.tecnotree.home.practice.comparableandcomparator;

import java.util.Comparator;

public class CompareByEmpId implements Comparator<EmployeeObj>
{
	@Override
	public int compare(EmployeeObj obj1, EmployeeObj obj2)
	{
		return obj1.getEmpId().compareTo(obj2.getEmpId());
	}
}
