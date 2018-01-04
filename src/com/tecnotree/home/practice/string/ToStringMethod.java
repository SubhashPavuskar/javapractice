package com.tecnotree.home.practice.string;

import java.util.Date;

public class ToStringMethod
{
	private String fName;
	private String lName;
	private Date startDate;
	private Date endDate;
	
	public ToStringMethod(String fname, String lName, Date startDate, Date endDate)
	{
		this.fName = fname;
		this.lName = lName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String toString()
	{
		return String.format("%s %s Birthday %s Hired %s",fName,lName,startDate,endDate);
	}
	

	public static void main(String[] args)
	{
		Date startDate = new Date(2017, 11, 10);
		Date endDate = new Date(2018, 12, 10);
		ToStringMethod toStringMethod = new ToStringMethod("Subhash", "Pavuskar", startDate, endDate);
		System.out.println("Data:: "+toStringMethod);
		
	}

}
