/*******************************************************************************************
 *  Purpose	 	to find power of two up to the given input
 *  @author  	Suraj 
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************************/
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
