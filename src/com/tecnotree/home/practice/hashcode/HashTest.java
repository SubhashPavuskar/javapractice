package com.tecnotree.home.practice.hashcode;

import java.util.HashSet;
import java.util.Set;

public class HashTest
{
	private Long mutableField;
	private final int immutableField;
	private String name;
	
	public HashTest(Long mutableField, int immutableField, String name)
	{
		this.mutableField = mutableField;
		this.immutableField = immutableField;
		this.name = name;
	}


	public void setMutableField(int mutableField)
	{
		this.mutableField = (long) mutableField;
	}


	@Override
	public boolean equals(Object o)
	{
		if (o instanceof HashTest)
		{
			return (mutableField == ((HashTest) o).mutableField) && (immutableField == ((HashTest) o).immutableField);
		}
		else
		{
			return false;
		}
	}

	@Override
	public int hashCode()
	{
		int result = 17;
		/*result = 37 * result + this.mutableField;
		result = 37 * result + this.immutableField;*/
		return result  + name.hashCode();
	}

	public static void main(String[] args)
	{
		Set<HashTest> set = new HashSet<HashTest>();
		HashTest obj = new HashTest((long) 6622458, 626304, "");
		set.add(obj);
		System.out.println(set.contains(obj));
		obj.setMutableField(3867602);
		
		System.out.println(set.contains(obj));
		System.out.println(set.contains(new HashTest((long)6622458, 626304, "")));
	}
}