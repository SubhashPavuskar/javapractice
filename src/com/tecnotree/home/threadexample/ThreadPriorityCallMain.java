package com.tecnotree.home.threadexample;

public class ThreadPriorityCallMain
{

	public static void main(String[] args)
	{
		/*System.out.println("Thread Name::"+Thread.currentThread().getName());
		System.out.println("Thread Priority:: "+Thread.currentThread().getPriority());
		Thread.currentThread().setName("Subhash");
		//Thread.currentThread().setPriority(7);
		System.out.println("Thread Name after setting::"+Thread.currentThread().getName());
		System.out.println("Thread Priority after setting:: "+Thread.currentThread().getPriority());
		*/
		Thread.currentThread().setPriority(2);
		ThreadPriority priority = new ThreadPriority();
		
		Thread thread = new Thread(priority);
		Thread.currentThread().setPriority(7);
		thread.start();
		for(int i=0; i<5 ; i++) {
			System.out.println("Inside Main Method");
		}
		
	}

}
