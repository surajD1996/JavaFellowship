/******************************************************************************
 *  Purpose	 	to print prime numbers in given range
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PrimeRange 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter The Range ");
		int lowerLimit = Utility.scanInt();
		int upperLimit = Utility.scanInt();
		
		Utility.primeRange(lowerLimit, upperLimit);
	}
}
