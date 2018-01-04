package com.tecnotree.home.practice.hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashcodeAndEqual
{

	public static void main(String args[])
	{
		/*String str1 = "Subhash";
		String str2 = "Subhash";
		String str3 = new String("Subhash");
		
		if(str1 == str3)
		{
			System.out.println("Both String are equal");
		}
		else
		{
			System.out.println("Both String are not equal");
		}*/
		
		Contact contact1 = new Contact(1010, "Subhash", "Address");
		Contact contact2 = new Contact(1010, "Subhash", "Address");
		Contact contact3 = contact1;
		Set<Contact> set =  new HashSet<Contact>();
		set.add(contact1);
		set.add(contact2);
		
		if(set.contains(new Contact(1010, "Subhash", "Address")))
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
		System.out.println("Object Hash Code of Contact contact1:: "+contact1.hashCode());
		
		int originalHashCode = System.identityHashCode(contact1);
		System.out.println("Original HashCode of Contact contact1:: "+originalHashCode);
		
		/*List<Contact> list = new ArrayList<Contact>();
		
		list.add(contact1);
		list.add(contact2);
		
		if(list.contains(new Contact(1010, "Subhash", "Address")))
			System.out.println("YES");
		else
			System.out.println("NO");*/
		
		
		
		/*if(contact1.equals(contact2))
		{
			System.out.println("Both Contact are equal EQUAL");
		}
		else
		{
			System.out.println("Contact are not equal NOT EQUAL");
		}*/
		/*if(contact1 == contact2)
		{
			System.out.println("Both Contact are equal ==");
		}
		else
		{
			System.out.println("Contact are not equal !=");
		}
		
		if(contact1.equals(contact2))
		{
			System.out.println("Both Contact are equal EQUAL");
		}
		else
		{
			System.out.println("Contact are not equal NOT EQUAL");
		}*/
	}
}
