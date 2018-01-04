package com.tecnotree.home.stringexample;

public class StringExampleTwo
{

	public static void main(String[] args)
	{

		String str1 = "Subhash";
		String str2 =  "SUBHASH";
		String str3 = new String("SUBHASH");
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		if(str2.equals(str3)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		if(str2 == str3){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
	}

}
