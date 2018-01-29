package com.tecnotree.home.thread.reentrantlock;

public class CallingMyThread
{
	public static void main(String[] args)
	{
		Display display = new Display();
		
		MyThread myThread1 =  new MyThread(display, "Subhash");
		MyThread myThread2 = new MyThread(display, "Deepak");
		MyThread myThread3 = new MyThread(display, "Aditya");
		myThread1.start();
		myThread2.start();
		myThread3.start();
		
	}
}
