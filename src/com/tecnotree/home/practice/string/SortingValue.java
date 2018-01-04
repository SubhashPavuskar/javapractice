package com.tecnotree.home.practice.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingValue
{

	public static void main(String[] args)
	{
		int[] intArray = {10,12,9,4,1,5,6,23,43};
		System.out.println("Before Sort Integer:: "+Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println("After Sort Integer:: "+ Arrays.toString(intArray));
		
		String[] charArray = {"A","C","E","D","B","F","G"};
		System.out.println("Before Sorting Char:: "+Arrays.toString(charArray));
		Arrays.sort(charArray);
		System.out.println("After Sorting Char::"+Arrays.toString(charArray));

		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("18");
		list.add("4");
		list.add("16");
		list.add("15");
		list.add("12");
		list.add("10");
		list.add("11");
		System.out.println("List Item Before Sorting::"+list);
		Collections.sort(list);
		System.out.println("List Item After Sorting::"+list);
		
	}
}
