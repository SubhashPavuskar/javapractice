package com.tecnotree.home.threadexample.synchronizationExample;

class DisplayGreeting
{

	public static synchronized void  wish(String name)
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Welcome to 2018 "+name);
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

}


class Display
{
	public synchronized void displayNumber()
	{
		for(int i=0; i<10; i++)
		{
			System.out.print(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
	
	public synchronized void displayChar()
	{
		for(int i=65; i<75; i++)
		{
			System.out.print((char)i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}