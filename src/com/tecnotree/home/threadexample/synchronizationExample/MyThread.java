package com.tecnotree.home.threadexample.synchronizationExample;

class MyThread implements Runnable
{

	DisplayGreeting displayGreeting;
	String name;
	
	public MyThread(DisplayGreeting displayGreeting, String name)
	{
		this.displayGreeting = displayGreeting;
		this.name = name;
	}
	
	
	@Override
	public void run()
	{
		displayGreeting.wish(name);
	}

}


class MyThreadDisplayNumber extends Thread
{
	Display  display;
	MyThreadDisplayNumber(Display  display)
	{
		this.display = display;
	}
	
	public void run()
	{
		display.displayNumber();
	}
}


class MyThreadDisplayChar extends Thread
{
	Display  display;
	MyThreadDisplayChar(Display  display)
	{
		this.display = display;
	}
	
	public void run()
	{
		display.displayChar();
	}
}