package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class Calender
{

	public static void main(String[] args) 
	{
		System.out.println("enter month");
		int month =Utility.scanInt();
		System.out.println("enter year");
		int year = Utility.scanInt();
		
		if((month<1)&&(month>12))
		{
			System.out.println("Please Enter Valid Input");
			
		}
		else
		{
			Utility.displayCalender(month, year);
		}
	}
}