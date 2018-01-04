package com.tecnotree.home.practice.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateWordOccuranceCount
{
	
	public static void main(String[] args)
	{
		searchDuplicateWord("Hello Subhash");
		searchDuplicateWord("To the       people         by the people");
		searchDuplicateWord("Testing the test app for test");
	}

	static void searchDuplicateWord(String inputString)
	{
		String[] words = inputString.split(" ");
		
		Map<String, Integer> map =  new HashMap<String,Integer>();
		
		for(String word:words)
		{
			if(map.containsKey(word.toLowerCase()))
			{
				map.put(word.toLowerCase(), map.get(word.toLowerCase())+1);
			}
			else
			{
				map.put(word.toLowerCase(),1);
			}
		}
		
		Set<String> wordInString = map.keySet();
		for (String word : wordInString)
        {
            //if word count is greater than 1
 
            if(map.get(word) > 1)
            {
                //Printing that word and it's count
 
                System.out.println(word+" : "+map.get(word));
            }
        }
		
	}

}
