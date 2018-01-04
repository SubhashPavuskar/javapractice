package com.tecnotree.home.practice.string;

public class Employee
{
	private String empName;
	private int empNumber;
	private String empCity;
	private int salary;
	
	
	public Employee(String empName, int empNumber, String empCity,int salary)
	{
		this.empName = empName;
		this.empNumber = empNumber;
		this.empCity = empCity;
		this.salary = salary;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public int getEmpNumber()
	{
		return empNumber;
	}
	public void setEmpNumber(int empNumber)
	{
		this.empNumber = empNumber;
	}
	public String getEmpCity()
	{
		return empCity;
	}
	public void setEmpCity(String empCity)
	{
		this.empCity = empCity;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public String toString()
	{
		String str = "[Name="+this.empName +"Emp Number="+this.empNumber+"City="+this.empCity+"Salary="+this.salary+"]";
		return str;
	}

}
