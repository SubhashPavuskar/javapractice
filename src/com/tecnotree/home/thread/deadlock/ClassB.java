package com.tecnotree.home.thread.deadlock;

public class ClassB
{
	public synchronized void d2(ClassA a){
		System.out.println("Thread ClassB start Executing");
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Thread ClassB Calling ClassA Last() method");
		a.last();
		
	}
	
	public  synchronized void last() {
		System.out.println("Calling last() menthod of Class B");
	}

}
