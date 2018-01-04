package com.tecnotree.home.practice.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySumUsingSet
{
	public static void main(String args[])
	{ 
		prettyPrint(getRandomArray(9), 11); 
		//prettyPrint(getRandomArray(10), 12); 
	}

	/** * Given an array of integers finds two elements in the array whose sum is equal to n. * @param numbers * @param n */ 
	public static void printPairsUsingSet(int[] numbers, int n)
	{
		if(numbers.length < 2)
		{ 
			return;
		} 
		Set set = new HashSet(numbers.length); 
		System.out.println("numbers::"+Arrays.toString(numbers));
		//System.out.println("SET contains"+set.);
		for(int value : numbers)
		{ 
			System.out.println("Loop"+value);
			int target = n - value; 
			// if target number is not in set then add 
			if(!set.contains(target))
			{ 
				System.out.println("target::"+target+" Adding::"+value);
				set.add(value); 
			}
			else 
			{
				System.out.printf("(%d, %d) %n", value, target); 
			}
		}
		
	}
		/* * Utility method to find two elements in an array that sum to k. */ 
		public static void prettyPrint(int[] random, int k)
		{
			/*System.out.println("Random Integer array : " + Arrays.toString(random));
			System.out.println("Sum : " + k); 
			System.out.println("pair of numbers from an array whose sum equals " + k);*/
			printPairsUsingSet(random, k); 
		} 
		
		/** * Utility method to return random array of Integers in a range of 0 to 15 */ 
		public static int[] getRandomArray(int length)
		{
			/*int[] randoms = new int[length]; 
			for(int i=0; i<length; i++)
			{ 
				randoms[i] = (int) (Math.random()*15); 
			} */
			int[] randoms = {2, 2, 11, 2, 10, 13, 2, 4, -1, 12, 9};
			return randoms; 
		}

}