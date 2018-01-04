package com.tecnotree.home.practice;

public class EvenOddNumber
{

	public static void main(String[] args)
	{
		EvenOddNumber evenOddNumber =  new EvenOddNumber();
		evenOddNumber.checkEvenOrOdd(20);
	}

	private void checkEvenOrOdd(int num)
	{
		if((num & 1) == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd");
		}
		
	}

}
