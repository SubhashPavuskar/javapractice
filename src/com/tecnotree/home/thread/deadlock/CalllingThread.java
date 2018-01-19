package com.tecnotree.home.thread.deadlock;

public class CalllingThread extends Thread
{
	ClassA classA = new ClassA();
	ClassB classB = new ClassB();
	
	public void m1() {
		this.start();
		classA.d1(classB);
	}
	public void run()
	{
		classB.d2(classA);
	}

	public static void main(String[] args)
	{
		CalllingThread calllingThread = new CalllingThread();
		calllingThread.m1();
	}

}
