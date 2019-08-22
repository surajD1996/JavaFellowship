package com.bridgelabz.functional;

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
