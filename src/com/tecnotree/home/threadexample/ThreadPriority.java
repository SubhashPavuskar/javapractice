package com.tecnotree.home.threadexample;

public class ThreadPriority implements Runnable
{

	@Override
	public void run()
	{

		
		System.out.println("Thread Name::"+Thread.currentThread().getName());
		System.out.println("Thread Priority:: "+Thread.currentThread().getPriority());
		for(int i=0; i<5 ; i++) {
			System.out.println("Inside Child Method");
		}
		/*Thread.currentThread().setName("Deepak");
		Thread.currentThread().setPriority(3);
		System.out.println("Thread Name after setting::"+Thread.currentThread().getName());
		System.out.println("Thread Priority after setting:: "+Thread.currentThread().getPriority());*/
	}

	

}
