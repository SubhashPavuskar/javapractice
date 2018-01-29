package com.tecnotree.home.thread.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Display
{
	ReentrantLock reentrantLock = new ReentrantLock();
	public  void wish(String name)
	{
		reentrantLock.lock();
		for(int i=0; i<5; i++)
		{
			System.out.println("Good Morning:: "+name);
			
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		reentrantLock.unlock();
	}
	
}
