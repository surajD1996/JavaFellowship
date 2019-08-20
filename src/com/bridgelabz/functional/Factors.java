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
