package com.tecnotree.home.practice.string;

import java.util.Arrays;

public class AdditionAndTotal
{
	public static void main(String[] args)
	{
		int[] element ={1,3,2,5,7,8,5,4,9,0};
		int a[] = null;
		System.out.println("Array elements are:: "+Arrays.toString(element));
		for(int i=0; i< element.length; i++)
		{
			for(int j=1; j<element.length - 1; j++)
			{
				if( element[i]+element[j] == 10)
				{
					int temp = element[i]+element[j];
					System.out.println(element[i] +" And "+ element[j] +" Total ::"+temp);
				}
			}
		}
	}
}
