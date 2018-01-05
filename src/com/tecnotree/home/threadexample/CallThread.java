package com.tecnotree.home.threadexample;

public class CallThread
{
	public static void main(String[] args)
	{
		MyThread myThread = new MyThread();
		myThread.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Execting main thread and cont is-->"+i);
		}

	}
}
