/*******************************************************************************************
 *  Purpose	 	to replace string in given place
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class ReplaceString 
{

	public static void main(String[] args) 
	{
		String defaultString = "Hello <<User-Name>>, How are you ?";
		System.out.println(" Default String is "+defaultString);
		System.out.println(" Enter Your Name ");
		String inputString = Utility.scanString();
		
		
		Utility.replaceString(defaultString, inputString);

	}

}
