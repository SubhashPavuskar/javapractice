package com.tecnotree.home.threadexample.callingmainthread;

class CallingMainThreadFromChild implements Runnable
{

	static Thread childThread;
	@Override
	public void run()
	{
		try
		{
			childThread.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Inside child method");
		}
	}
}
