package com.tecnotree.home.innerclass;

//class MyInnerClassExample
//{
//	class InsideMyInnerClass
//	{
//		public void show()
//		{
//			System.out.println("Inside InsideMyInnerClass");
//		}
//	}
//}
//
//public class MyInnerClass
//{
//	static void main(String arg[])
//	{
//		MyInnerClassExample temp = new MyInnerClassExample();
//		MyInnerClassExample.InsideMyInnerClass test = temp.new InsideMyInnerClass();
//		test.show();
//	}
//}

public class MyInnerClass
{
	public static void aMethod() throws Exception
	{
		try
		{
			throw new Exception();
		}
		finally
		{
			System.out.print("finally ");
		}
	}

	public static void main(String args[])
	{
		try
		{
			aMethod();
		}
		catch (Exception e)
		{
			System.out.print("exception ");
		}
		System.out.print("finished");
	}
}