package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		int power = Integer.parseInt(args[0]);
		System.out.println("You Entered "+power);
		Utility.powerOf2(power);
	}

}
