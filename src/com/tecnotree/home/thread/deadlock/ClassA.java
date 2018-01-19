package com.tecnotree.home.thread.deadlock;

public class ClassA
{
	public synchronized void d1(ClassB b){
		System.out.println("Thread ClassA start Executing");
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Thread ClassA Calling ClassB Last() method");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Calling last() menthod of Class B");
	}
}
