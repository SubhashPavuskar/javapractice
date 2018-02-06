package com.tecnotree.home.thread.executor.threadlocal;

public class CustomerThread extends Thread
{

	static int value=0;
	public CustomerThread(String name)
	{
		super(name);
	}
	
	private static ThreadLocal  local = new  ThreadLocal() {
	
		protected Object initialValue() {
			return ++value;
		}
	};
	
	@Override
	public void run()
	{
		System.out.println( Thread.currentThread().getName()+" Executing with customer ID:: "+local.get());
	}
	

	public static void main(String[] args)
	{
		CustomerThread customerThread1 = new CustomerThread("CustomerThread-1");
		CustomerThread customerThread2 = new CustomerThread("CustomerThread-2");
		CustomerThread customerThread3 = new CustomerThread("CustomerThread-3");
		CustomerThread customerThread4 = new CustomerThread("CustomerThread-4");
		
		customerThread1.start();
		customerThread2.start();
		customerThread3.start();
		customerThread4.start();
	}

}
