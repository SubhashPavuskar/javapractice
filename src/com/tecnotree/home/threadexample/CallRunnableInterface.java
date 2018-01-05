package com.tecnotree.home.threadexample;

public class CallRunnableInterface
{

	public static void main(String[] args)
	{

		RunnableExample  runnableExample = new RunnableExample();
		Thread thread = new Thread(runnableExample);
		thread.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Calling runnable Child and count is::-->"+i);
		}
	}

}
