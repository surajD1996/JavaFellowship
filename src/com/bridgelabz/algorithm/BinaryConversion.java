/******************************************************************************
 *  Purpose	 	to convert a decimal number to its binary number
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	23-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BinaryConversion 
{

	public static void main(String[] args) 
	{
		int decimalNumber = Integer.parseInt(args[0]);
		System.out.println("You Entered "+decimalNumber);
		String answer = Utility.binaryConversion(decimalNumber);
		System.out.println("Its Binary Number is "+answer);
	}

}
