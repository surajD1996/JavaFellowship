package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class isLeap 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter The Year");
		int year=Utility.scanInt();
		boolean answer = Utility.leapYear(year);
		if(answer == true)
		{
			System.out.println(year+" is Leap Year");
		}
		else
		{
			System.out.println(year+" is not Leap Year");
		}

	}

}
