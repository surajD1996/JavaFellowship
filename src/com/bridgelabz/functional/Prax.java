/*******************************************************************************************
 *  Purpose	 	practice
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Prax 
{

	public static void main(String[] args) 
	{
		boolean ans = Utility.checkPrime(15);
		if(ans == true )
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("not Prime");
		}
		
		ans = Utility.checkPallindrome(151);
		if(ans == true)
		{
			System.out.println("Pallin");
		}
		else
		{
			System.out.println("not ");
		}
	}

}
