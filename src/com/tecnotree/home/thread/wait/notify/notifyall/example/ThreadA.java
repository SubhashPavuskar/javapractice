package com.tecnotree.home.thread.wait.notify.notifyall.example;

public class ThreadA
{
	public static void main(String[] args)
	{
		ThreadB threadB = new ThreadB();
		threadB.start();
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		synchronized (threadB)
		{
			System.out.println("Main thread Calling Child thread and waiting for notofication");
			try
			{
				threadB.wait();
				System.out.println("Main thread got notification");
				System.out.println("Sum is ::"+ threadB.sum);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		/*try
		{
			//threadB.join();
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println("Sum is ::"+ threadB.sum);*/
	}
};
