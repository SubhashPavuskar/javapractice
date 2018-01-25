package com.tecnotree.home.threadgroup;

public class GetThreadGroupName
{

	public static void main(String args[])
	{
		System.out.println("Main Belongs to "+Thread.currentThread().getThreadGroup().getName() +" Group");
		System.out.println("Parent thread name of main is "+Thread.currentThread().getThreadGroup().getParent().getName());
		
	}
}
