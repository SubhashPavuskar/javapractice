package com.tecnotree.home.practice;

import java.util.Scanner;

public class TestOne {

	public static void main(String[] args) {
	
		System.out.println("Enter number::");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		if(i%2 == 0)
			System.out.println("Not Weird");
		else
			System.out.println("Weird");
	}

}
