package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class InsertionSortStrings 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter The Number Of Elements in Array");
		int length = Utility.scanInt();
		String inputArray[] = new String[length];
		
		System.out.println("Enter The Elements of Array");
		for(int i = 0;i<inputArray.length;i++)
		{
			inputArray[i] = Utility.scanString();
		}
		for(int i = 0;i<inputArray.length;i++)
		{
			System.out.println(inputArray[i]);
		}
		
		int pass =0;
		int j = 0;
		String key = null;
		
		for(pass = 1;pass<inputArray.length;pass++)
		{
			key = inputArray[pass];
			j = pass;
			int result = inputArray[j-1].compareTo(key);
			while((j>0)&&(result>0))
			{
				inputArray[j] = inputArray[j-1];
				j--;
				
			}
			inputArray[j] = key;
		}
		
		for(int i = 0;i<inputArray.length;i++)
		{
			System.out.println(inputArray[i]);
		}	
	}
}
