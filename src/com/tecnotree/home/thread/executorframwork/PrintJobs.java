package com.tecnotree.home.thread.executorframwork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintJobs implements Runnable
{

	String name;

	PrintJobs(String name)
	{
		this.name = name;
	}

	@Override
	public void run()
	{
		System.out.println(name+" job Started by Thread "+ Thread.currentThread().getName());
		
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(name+" Completed by Thread "+ Thread.currentThread().getName());
	}

	public static void main(String[] args)
	{
		PrintJobs[] jobs = {
				new PrintJobs("Subhash"),
				new PrintJobs("Deepak"),
				new PrintJobs("Gauthami"),
				new PrintJobs("Aditya"),
				new PrintJobs("Seema"),
				new PrintJobs("Smita")
				
		};
		ExecutorService service = Executors.newFixedThreadPool(6);
		for(PrintJobs printJobs : jobs)
		{
			service.submit(printJobs);
		}
		service.shutdown();

	}
}
