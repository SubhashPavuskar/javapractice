package com.tecnotree.home.constructor;

public class ConstructorExample
{
	public int i;
	public String temp;
	public double db;
	ConstructorExample(){
		System.out.println("Integer ::"+i+"\nString ::"+temp+"\n Double ::"+db);
	}

	public static void main(String[] args)
	{
		ConstructorExample constructorExample =  new ConstructorExample();

	}

}
