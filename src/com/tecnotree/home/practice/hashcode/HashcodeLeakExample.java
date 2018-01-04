package com.tecnotree.home.practice.hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashcodeLeakExample
{
	private String id;

	public HashcodeLeakExample(String id)
	{
		this.id = id;
	}
	
	public int hashCode()
	{
		return 13*id.hashCode();
	}

	public static void main(String args[])
	{
		try
		{
			Map<HashcodeLeakExample, String> map = new HashMap<HashcodeLeakExample, String>();
			/*while (true)
			{
				
			}*/
			
			for(int i=0; i<1000000000;i++)
			{
				map.put(new HashcodeLeakExample("id"), "any value");
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}