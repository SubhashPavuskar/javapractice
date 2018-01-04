package com.tecnotree.home.enumexample;

public class EnumExample
{

	public enum Months{
		JAN,FAB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC
	}
	
	Months months;
	public EnumExample(Months months){
		this.months = months;
	}
	
	public void callEnumConst(){
		if(months != null){
			switch(months){
			
			case JAN :
				System.out.println("Jan month");
				break;
				
			case MAR:
				System.out.println("March Month");
				break;
				
			case NOV:
				System.out.println("November month");
				
			case DEC:
				System.out.println("December month");
				break;
				
				default:
					System.out.println("No Months");
			}
			
		}
		
	}
	
	public static void main(String[] args)
	{
		EnumExample jan_month = new EnumExample(Months.JAN);
		jan_month.callEnumConst();
		
		EnumExample nov_month = new EnumExample(Months.NOV);
		nov_month.callEnumConst();
		
		EnumExample no_month = new EnumExample(null);
		no_month.callEnumConst();

	}

}
