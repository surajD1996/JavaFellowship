/******************************************************************************
 *  Purpose	 	to print day of week
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	23-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class DayOfWeek 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Year");
		int year = Utility.scanInt();
		System.out.println("Enter Month");
		int month = Utility.scanInt();
		System.out.println("Enter date");
		int date = Utility.scanInt();
		
		int day = Utility.dayOfWeek(month, date, year);
		
		
		
		switch(day)
		{
			case 1:
				System.out.println("Its Monday");
				break;
			case 2:
				System.out.println("Its Tuesday");
				break;
			case 3:
				System.out.println("Its Wednesday");
				break;
			case 4:
				System.out.println("Its Thursday");
				break;
			case 5:
				System.out.println("Its Friday");
				break;
			case 6:
				System.out.println("Its Saturday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Error");
				
		}
		
	}

}
