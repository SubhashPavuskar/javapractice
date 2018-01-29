package com.tecnotree.home.threadgroup;

public class ActiveThreadInThreadGroupDemo
{
	public static void main(String[] args)
	{
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] threads = new Thread[system.activeCount()];
		
		system.enumerate(threads);
		for(Thread t1: threads) {
			System.out.println(t1.getName()+ "..."+t1.isDaemon());
		}
	}
}
