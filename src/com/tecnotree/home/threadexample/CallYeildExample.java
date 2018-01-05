package com.tecnotree.home.threadexample;

public class CallYeildExample
{
	public static void main(String[] args)
	{
		YieldExample yieldExample = new YieldExample();
		Thread t = new Thread(yieldExample);
		//Thread.currentThread().setPriority(2);
		t.start();
		try
		{
			t.join(500);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Inside Parent method");
		}

	}
}
