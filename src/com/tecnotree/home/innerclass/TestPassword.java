package com.tecnotree.home.innerclass;

public class TestPassword
{

	public static void main(String[] args)
	{
//		int randomPin   =(int)(Math.random()*900000)+100000;
//		Object object=123456;
//		String password  =(String)object;    //.valueOf(object);
		
		
		
		int randomPin = (int)(Math.random() * 900000.0D) + 100000;
	    String password = String.valueOf(randomPin);
		System.out.println(password);

	}

}
