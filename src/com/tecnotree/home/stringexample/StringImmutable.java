package com.tecnotree.home.stringexample;

import java.util.Hashtable;

public class StringImmutable
{

	public static void main(String[] args)
	{
		Hashtable<String, Integer> temp = new Hashtable<String, Integer>();
		
		StringBuffer str = null;
		str = new StringBuffer("Subhash");
		temp.put(str.toString(), 1);
		//temp.put("Subhash", 1);
		temp.put("Deepak", 2);
		temp.put("Aryan", 3);
		
		String str1 = str.toString();
		str1 = str1.toUpperCase();
		Object obj =  temp.get("SUBHASH");
		System.out.println("Value is ::"+obj);

	}

}
