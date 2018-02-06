package com.tecnotree.home.thread.reentrantlock.exampleTwo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThreadDemo extends Thread
{
	static ReentrantLock reentrantLock =new ReentrantLock();
	public MyThreadDemo(String name)
	{
		super(name);
	}
	public void run()
	{
		do
		{
			try
			{
				if(reentrantLock.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+ " Occupied the lock");
					Thread.sleep(30000);
					reentrantLock.unlock();
					System.out.println(Thread.currentThread().getName()+ " Releases  the lock");
					break;
				} else {
					System.out.println(Thread.currentThread().getName()+ " Unable to get the lock and will retry again");
				}
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}while(true);
	}
}
