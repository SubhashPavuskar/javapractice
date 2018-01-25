package com.tecnotree.home.threadgroup;

class MyThread extends Thread
{
	MyThread(ThreadGroup threadGroup, String name)
	{
		super(threadGroup,name);
	}
	
	public void run() 
	{
		System.out.println("Inside Child thread");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}


public class ThreadGroupExampleTwo
{

	public static void main(String[] args) throws InterruptedException
	{

		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg, "ChildGroup");
		
		MyThread t1 = new MyThread(pg, "ThreadA");
		MyThread t2 = new MyThread(pg, "ThreadB");
		
		t1.start();
		t2.start();
		
		pg.list();
		
		Thread.sleep(1000);
		
		System.out.println("PG Thread Active ::" +pg.activeCount());
		System.out.println("GG Thread Group Active ::" +pg.activeGroupCount());
		
		pg.list();
		
	}

}
