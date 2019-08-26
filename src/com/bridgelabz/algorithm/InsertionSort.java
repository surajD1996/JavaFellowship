package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class InsertionSort{

	public static void main(String[] args) 
	{
		System.out.println("Enter The Number Of Elements in Array");
		int length = Utility.scanInt();
		int inputArray[] = new int[length];
		
		System.out.println("Enter The Elements of Array");
		for(int i = 0;i<inputArray.length;i++)
		{
			inputArray[i] = Utility.scanInt();
		}
		
		int pass =0;
		int j = 0;
		int key = 0;
		
		for(pass = 1;pass<inputArray.length-1;pass++)
		{
			key = inputArray[pass];
			j = pass;
			while((j>0)&&(inputArray[j-1]>key))
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
