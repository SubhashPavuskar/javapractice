package com.tecnotree.home.thread.reentrantlock.exampleTwo;

public class CallingMyThreadDemo
{
	public static void main(String[] args)
	{

		MyThreadDemo myThreadDemo1 = new MyThreadDemo("FirstThread");
		MyThreadDemo myThreadDemo2 = new MyThreadDemo("SecondThread");
		
		myThreadDemo1.start();
		myThreadDemo2.start();
	}
}
