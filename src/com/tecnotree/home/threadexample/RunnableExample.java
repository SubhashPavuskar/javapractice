package com.tecnotree.home.threadexample;

class RunnableExample implements Runnable
{

	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Calling runnable Child and count is::-->"+i);
		}
		
	}

}
