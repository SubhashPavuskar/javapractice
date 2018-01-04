package com.tecnotree.home.practice.string;

import java.util.Scanner;

public class Palindrom
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=in.nextLine();
		boolean val = isPalindrome(str);
		if(val)
			System.out.println("PALINDROM");
		else
			System.out.println("NOT PALINDROM");
	}

	private static boolean isPalindrome(String str)
	{
		if(str == null)
			return false;

		int strLenght = str.length();
		if(strLenght > 0)
		{
			System.out.println("Lenght:: "+strLenght);
			for(int i=0 ; i< strLenght/2; i++)
			{
				if(str.charAt(i) != str.charAt(strLenght-i-1))
					return false;
			}
			return true;
		}
		return false;
	}
	
	/*private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }*/

}
