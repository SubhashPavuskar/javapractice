package com.tecnotree.home.thread.executor.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo implements Callable
{
	int num;
	public CallableDemo(int num)
	{
		this.num = num;
	}
	@Override
	public Object call() throws Exception
	{
		int sum=0;
		System.out.println(Thread.currentThread().getName()+" responsible to find sum of "+num+" Numbers");
		for(int i=0; i<num; i++)
		{
			sum = sum + i;
		}
		
		Thread.sleep(2000);
		return sum;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		CallableDemo[] jobs = {
				new CallableDemo(50),
				new CallableDemo(60),
				new CallableDemo(70),
				new CallableDemo(80),
				new CallableDemo(90),
				new CallableDemo(100)
		};
		
		ExecutorService service = Executors.newFixedThreadPool(6);
		
		for(CallableDemo job : jobs)
		{
			Future future = service.submit(job);
			System.out.println(future.get());
		}
		service.shutdown();
	}
}
