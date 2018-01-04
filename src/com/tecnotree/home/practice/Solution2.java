package com.tecnotree.home.practice;

import java.util.Scanner;;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt())
            System.out.println("This input is  of type Integer"+scan.hasNextInt());
        else if(scan.hasNextFloat())
            System.out.println("This input is  of type Float");
        else
            System.out.println("This is something else");
        }
}
