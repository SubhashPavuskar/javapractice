package com.tecnotree.home.practice;

public class StringExample
{

	/*public enum Alphabets
	{
		A(61), B(62), C(63), D(64), E(65), F(66), G(67), H(68), I(69), J(70), K(71), L(72), M(73), N(74), O(75), P(76), Q(77), R(78), S(79), T(80), U(81), V(82), W(83), X(84), Y(85), Z(86);
		private char value;

		private Alphabets(char value)
		{
			this.value = value;		}
	}*/

	public static void main(String args[])
	{
		/*
		 * for(Alphabets alpha : Alphabets.values()) {
		 * System.out.println("Latter::"+alpha.name()+" Value::"+alpha.value); }
		 */
		String nameIs = "SUBHASH";
		int valueIs=0;
		char temp[] = nameIs.toCharArray();
		for(int i=0; i<temp.length;i++)
		{
			System.out.println(temp[i]);
			char c =temp[i];
			//if(c== Alphabets.)
		}
	}

}
