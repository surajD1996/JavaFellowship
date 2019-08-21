
/******************************************************************************
 *  Purpose: Calculates the Euclidean Distance
 *  @author  Suraj Warbhuvan
 *  @version 1.0
 *  @since   21-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Distance
{

	public static void main(String[] args) 
	{
		double result;
		if (args.length!=2)
		{
			System.out.println("Please Enter Tow integers to Perform operation");
		}
		int firstNumber=Integer.parseInt(args[0]);
		int secondNumber=Integer.parseInt(args[1]);
		System.out.println("You Entered Value as ");
		System.out.println("First Value = "+firstNumber);
		System.out.println("Second Value = "+secondNumber);
		
		result=Utility.euclideanDistance(firstNumber, secondNumber);
		
		System.out.println("Euclidean Distance is"+result);
		
	}

}