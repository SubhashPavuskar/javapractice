package com.tecnotree.home.thread.wait.notify.notifyall.example;

class ThreadB extends Thread
{
	int sum=0;
	
	public void run()
	{
		synchronized (this)
		{
			System.out.println("Child thread called and started calculation");
			for(int i=0; i<=100; i++)
			{
				sum = sum + i;
			}
			System.out.println("Child thread trying to give notification");
			this.notify();
		}
	}
	
	/*public void run()
	{
		for(int i=0; i<=100; i++)
		{
			sum = sum + i;
		}
	}*/
}
