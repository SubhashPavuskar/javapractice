package com.tecnotree.home.thread.executor.threadlocal;

public class ThreadLocalDemo
{

	public static void main(String[] args)
	{
		//ThreadLocal local = new ThreadLocal();
		ThreadLocal local = new ThreadLocal() {
			public Object initialValue() {
				return "Subhash Pavuskar";
			}
		};
		System.out.println("Local Value "+local.get());
		local.set("Subhash");
		System.out.println("Local Value "+local.get());
		local.remove();
		System.out.println("Local Value "+local.get());
	}

}
