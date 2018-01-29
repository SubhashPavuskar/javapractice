package com.tecnotree.home.thread.reentrantlock.example;

import java.util.concurrent.locks.ReentrantLock;

public class MyThreadDemo extends Thread
{
	static ReentrantLock reentrantLock = new ReentrantLock();
	
	public MyThreadDemo(String name)
	{
		super(name);
	}
	
	public void run()
	{
		if(reentrantLock.tryLock()) {
			System.out.println(Thread.currentThread().getName()+" is got lock and performing Operation");
			
			try
			{
				Thread.sleep(10000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" dint get the lock and continuing Operation");
		}
	}
}
