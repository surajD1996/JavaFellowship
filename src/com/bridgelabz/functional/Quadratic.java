/******************************************************************************
 *  Purpose	 	to find the roots of quadratic equation
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic 
{
	public static void main(String args[]) throws Exception
	{
		double value1=Double.parseDouble(args[0]);
		double value2=Double.parseDouble(args[1]);
		double value3=Double.parseDouble(args[2]);
		Utility.quadratic(value1, value2, value3);
	}
}