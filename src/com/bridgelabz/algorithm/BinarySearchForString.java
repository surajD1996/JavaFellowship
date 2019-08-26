package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BinarySearchForString 
{
	public static void main(String[] args) 
	{
		
		String inputString[] = {"abc","pqr","xyz","yuv","mac"};

		
		System.out.println("Enter The Word to be searched in string ");
		String word = Utility.scanString();
		
		//boolean answer = Utility.binarySearchString(inputString, word);
		Utility.binarySearchString(inputString, word);
		
	}
}
