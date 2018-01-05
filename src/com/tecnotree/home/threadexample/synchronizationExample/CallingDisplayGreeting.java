package com.tecnotree.home.threadexample.synchronizationExample;

public class CallingDisplayGreeting
{
	public static void main(String[] args)
	{
		/*DisplayGreeting displayGreeting = new DisplayGreeting();

		MyThread myThread1 = new MyThread(displayGreeting, "Subhash");
		Thread t1 = new Thread(myThread1);
		
		MyThread myThread2 = new MyThread(displayGreeting, "Deepak");
		Thread t2 = new Thread(myThread2);
		
		DisplayGreeting displayGreeting2 = new DisplayGreeting();
		MyThread myThread3 = new MyThread(displayGreeting2, "Aryan");
		Thread t3 = new Thread(myThread3);
		
		t1.start();
		t2.start();
		t3.start();*/
		
		
		/*----------------------------------------------*/
		
		Display display = new Display();
		
		MyThreadDisplayNumber displayNumber = new MyThreadDisplayNumber(display);
		
		MyThreadDisplayChar myThreadDisplayChar = new MyThreadDisplayChar(display);
		
		displayNumber.start();
		myThreadDisplayChar.start();
		

	}
}
