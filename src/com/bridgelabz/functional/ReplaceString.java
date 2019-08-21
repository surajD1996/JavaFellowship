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
		
		//String answer = Utility.replaceString(defaultString, inputString);
		Utility.replaceString(defaultString, inputString);
//		if(answer == null)
//		{
//			System.out.println("Please Enter Valid String");
//		}
//		else
//		{
//			for(int i = 0;i<answer.length();i++)
//			{
//				System.out.println(answer);
//			}
//			
//		}
		
		//System.out.println(answer);
	}

}
