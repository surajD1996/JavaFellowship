package com.bridgelabz.functional;

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
		
		int position = Utility.binarySearchIntegers(array);
		System.out.println("position = "+position);
	}

}
