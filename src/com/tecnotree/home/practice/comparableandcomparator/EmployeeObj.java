package com.tecnotree.home.practice.comparableandcomparator;

public class EmployeeObj implements Comparable<EmployeeObj>
{
	private String empfirstName;
	private String emplastName;
	private Integer empId;
	
	public String getEmpfirstName()
	{
		return empfirstName;
	}
	public void setEmpfirstName(String empfirstName)
	{
		this.empfirstName = empfirstName;
	}
	public String getEmplastName()
	{
		return emplastName;
	}
	public void setEmplastName(String emplastName)
	{
		this.emplastName = emplastName;
	}
	public Integer getEmpId()
	{
		return empId;
	}
	public void setEmpId(Integer empId)
	{
		this.empId = empId;
	}
	@Override
	public int compareTo(EmployeeObj employeeObj)
	{
		return this.empfirstName.compareToIgnoreCase(employeeObj.getEmpfirstName());
	}
	/*@Override
	public int compareTo(T o)
	{
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	
	
	

}
