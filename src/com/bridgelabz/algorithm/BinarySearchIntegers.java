package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BinarySearchIntegers 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter The Number Of Elements");
		int length = Utility.scanInt();
		int array[] = new int[length];
		System.out.println("Enter The Elements ");
		for(int i = 0;i < length; i++)
		{
			array[i] = Utility.scanInt();
		}
		System.out.println("Enter The Number To be searched");
		int inputNumber = Utility.scanInt();
		int position = Utility.binarySearchIntegers(array, inputNumber);
		System.out.println("After Sorting The Elements of Array the number to be searched is on "+position+" index");
		//System.out.println("position = "+position);
	}
}
