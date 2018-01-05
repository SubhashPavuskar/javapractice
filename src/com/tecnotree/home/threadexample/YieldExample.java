package com.tecnotree.home.threadexample;

public class YieldExample implements Runnable
{

	@Override
	public void run()
	{
		// Thread.currentThread().setPriority(2);
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Inside child method");
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			// Thread.yield();
		}
	}

}
