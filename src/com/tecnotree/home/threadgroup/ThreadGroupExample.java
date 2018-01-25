package com.tecnotree.home.threadgroup;

public class ThreadGroupExample
{

	public static void main(String[] args)
	{

		ThreadGroup threadGroupA =  new ThreadGroup("ThreadGroupA");
		Thread t1 = new Thread(threadGroupA, "Thread1");
		Thread t2 = new Thread(threadGroupA, "Thread2");
		threadGroupA.setMaxPriority(3);
		Thread t3 = new Thread(threadGroupA, "Thread3");
		
		System.out.println("Thread1 Priority:: " +t1.getPriority());
		System.out.println("Thread2 Priority:: " +t2.getPriority());
		System.out.println("Thread3 Priority:: " +t3.getPriority());
	}

}
