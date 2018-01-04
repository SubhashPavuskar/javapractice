package com.tecnotree.home.practice.string;

import java.util.Scanner;

public class TotalNumberOfOccurance
{

	public static void main(String[] args)
	{
		String str = "Hello Java World I am Subhash as as as";
		System.out.println("Enter Charactor to count::");
		Scanner sc = new Scanner(System.in);
		String chara = sc.nextLine();
		int count;
		count = str.length() - str.replace(chara, "").length();
		if(chara.length()>1 && count > 0)
		{
			int temp = chara.length() - 1;
			count = str.length() - str.replace(chara, "").length() - temp;
		}
		else
		{
			count = str.length() - str.replace(chara, "").length();
		}
		System.out.println("Input String is::"+str +"\n Count is::"+count);
	}

}
