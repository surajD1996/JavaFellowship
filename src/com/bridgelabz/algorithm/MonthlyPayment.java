/******************************************************************************
 *  Purpose	 	
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	23-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter The Principal Load Amount");
		int loanAmount = Utility.scanInt();
		
		System.out.println("Enter The Number of Years");
		int years = Utility.scanInt();
		
		System.out.println("Enter The Percent Rate");
		int rate = Utility.scanInt();
		
		float monthlyAmount = Utility.monthlyPayment(loanAmount, years, rate);

	}

}
