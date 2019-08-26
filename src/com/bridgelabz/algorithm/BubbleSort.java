/******************************************************************************
 *  Purpose	 	to sort the elements of array in ascending order using bubble sort
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	23-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) 
	{
		System.out.println("Enter The Number of Elements");
		int length = Utility.scanInt();
		int inputArray[]=new int[length];
		int i = 0;
		System.out.println("Enter The Elements of array");
		for(i = 0; i<inputArray.length;i++)
		{
			inputArray[i] = Utility.scanInt();
		}
		inputArray = Utility.bubbleSort(inputArray);
		
		for(i = 0; i<inputArray.length;i++)
		{
			System.out.println(inputArray[i]);
		}
	}
}
