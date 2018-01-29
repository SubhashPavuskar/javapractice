package com.tecnotree.home.thread.reentrantlock.example;

public class CallingMyThreadDemo
{

	public static void main(String[] args)
	{
		MyThreadDemo threadDemo1 = new MyThreadDemo("FirstThread");
		MyThreadDemo threadDemo2 = new MyThreadDemo("SecondThread");
		
		
		threadDemo1.start();
		threadDemo2.start();
	}

}
