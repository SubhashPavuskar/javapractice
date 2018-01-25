package com.tecnotree.home.threadgroup;

public class CreatingThreadGroup
{

	public static void main(String[] args)
	{

		ThreadGroup threadGroup1 = new ThreadGroup("Thread-A Group");
		System.out.println("Parent of Thread-A Group ::"+threadGroup1.getParent().getName());
		
		ThreadGroup threadGroup2 = new ThreadGroup(threadGroup1, "Thread-B Group");
		System.out.println("Parent of Thread-B Group :: "+threadGroup2.getParent().getName());
	}

}
