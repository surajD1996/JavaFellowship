/*******************************************************************************************
 *  Purpose	 	to find which three numbers give 0 after adding using cubic running time
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SumOfThreeIntegers 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter The number Of Elements");
		int size = Utility.scanInt();
		int array[] = new int[size];
		System.out.println("Enter The Elements");
		for(int i = 0;i<array.length;i++)
		{
			array[i] = Utility.scanInt();
		}
		Utility.addThreeInts(array);
	}

}
