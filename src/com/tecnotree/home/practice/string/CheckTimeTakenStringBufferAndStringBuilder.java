package com.tecnotree.home.practice.string;

public class CheckTimeTakenStringBufferAndStringBuilder
{
	public static void main(String args[])
	{
		StringBuffer buffer = new StringBuffer("Hello ");
		String str = "Subhash";
		long startTime = System.currentTimeMillis();
		for(long i=0; i<10000000 ; i++)
		{
			buffer.append("Subhash");
		}
		System.out.println("Time taken for StringBuffer::"+ (System.currentTimeMillis() - startTime)+"ms");
		
		StringBuilder builder = new StringBuilder("Hi");
		 startTime =  System.currentTimeMillis();
		for(long i=0 ; i<10000000 ; i++)
		{
			builder.append("SUBHASH");
		}
		System.out.println("Time taken for StringBuilder::"+ (System.currentTimeMillis() - startTime)+"ms");
	}
}
