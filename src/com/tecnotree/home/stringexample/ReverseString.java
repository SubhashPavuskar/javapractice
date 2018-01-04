package com.tecnotree.home.stringexample;

public class ReverseString
{
	public static void main(String[] args)
	{
		String str = "Subhash";
		System.out.println("Before String reverse :: "+str);
		char[] str3 = str.toCharArray();
		char temp =	0 ;
		System.out.print("After string Reverse ::");
		for(int i=str3.length-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
	}
}
