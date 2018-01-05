package com.tecnotree.home.threadexample.callingmainthread;

public class CallingMainThread 
{

	public static void main(String[] args) throws InterruptedException
	{
		CallingMainThreadFromChild.childThread = Thread.currentThread();
		
		CallingMainThreadFromChild callingMainThreadFromChild = new CallingMainThreadFromChild();
		Thread thread = new Thread(callingMainThreadFromChild);
		thread.start();
		thread.join();
		for (int i=0; i<10; i++)
		{
			System.out.println("Inside Main method");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
