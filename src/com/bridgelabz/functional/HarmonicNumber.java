/*******************************************************************************************
 *  Purpose	 	to find Harmonic Number
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		float endPoint = Float.parseFloat(args[0]);
		float answer = 0;
		System.out.println("Yo Entered "+endPoint);
		
		answer = Utility.harmonicNumber(endPoint);
		
		System.out.println("Harmonic Number is "+answer);
	}
}
