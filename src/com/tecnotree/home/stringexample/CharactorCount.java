package com.tecnotree.home.stringexample;

import org.apache.commons.lang3.StringUtils;

public class CharactorCount
{

	public static void main(String[] args)
	{
		String reverseIs = StringUtils.reverse("azbzczd");
		int count = countMatches("azbzczd", "z");
		System.out.println("Count ::" + count);
		System.out.println("String reverse ::"+reverseIs);
	}

	public static boolean isEmpty(CharSequence cs)
	{
		return cs == null || cs.length() == 0;
	}

	public static int countMatches(String str, String sub)
	{
		if (isEmpty(str) || isEmpty(sub)) { return 0; }
		int count = 0;
		int idx = 0;
		while ((idx = str.indexOf(sub, idx)) != -1)
		{
			count++;
			idx += sub.length();
		}
		return count;
	}

}
