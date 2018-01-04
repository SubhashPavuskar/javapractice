package com.tecnotree.home.array;

import java.util.Scanner;

public class ReverseNumber
{

	public static void main(String[] args)
	{

		System.out.println("Enter Number to generate array element::");
		Scanner scanner =  new Scanner(System.in);
		int temp = Integer.parseInt(scanner.nextLine());
		int elemet[] = new int[100];
		for(int i=1; i<=temp ; i++)
		{
			elemet[i] = i;
		}
		
		System.out.println("Elements are::");
		for(int i=1; i<=temp ; i++)
		{
			System.out.print(elemet[i]+" ");
		}
		
		System.out.println("\n Enter Number to reverse::");
		int reversFrom = scanner.nextInt();
		
		for(int i=reversFrom; i<temp; i++)
		{
			
			System.out.print(elemet[i+1]+" ");
		}
		for (int i=0; i< reversFrom ; i++)
		{
			System.out.print(elemet[i+1]+" ");
		}
	}

}
