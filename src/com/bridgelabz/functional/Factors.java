/******************************************************************************
 *  Purpose	 	to find prime factors of a number
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Factors 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter The Number ");
		int inputNumber = Utility.scanInt();
		Utility.primeFactors(inputNumber);
	}

}
