package com.tecnotree.home.starpattern;

public class PatternOne
{
	public static void main(String args[]){
		
		
		/*Pattern:: * * * * 
					* * * * 
					* * * * 
					* * * *      */
		/*for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}*/
		
		
		/*Pattern 2:: */
		
		/*for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(i==1 || i==4 || j==1 || j==4)
				{
					System.out.print("* ");
					System.out.print(" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}*/
		
		/*Pattern 3:: */
		
		int num  = 4;
        for(int j=0;j<num;j++){
            for(int i=1;i<=num;i++){
                System.out.print(i<num-j?" ":"*");
            }
            System.out.println("");
        }
		
		
	}

}
