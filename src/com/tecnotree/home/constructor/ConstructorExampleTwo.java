package com.tecnotree.home.constructor;

public class ConstructorExampleTwo
{

	public ConstructorExampleTwo(String name,int age){
		System.out.println("Name::"+name+ " Age::"+age);
	}
	
	public ConstructorExampleTwo(int ageIs, String NameIs){
		System.out.println("ageIs::"+ageIs+ " NameIs::"+NameIs);
	}
	
	public static void main(String args[])
	{
		ConstructorExampleTwo constructorExample = new ConstructorExampleTwo("Subhash",29);
		ConstructorExampleTwo constructorExample2 = new ConstructorExampleTwo("Subhash",29);
		ConstructorExampleTwo constructorExample3 = new ConstructorExampleTwo(29,"Test");
		
	}
}
