package com.bridgelabz.algorithm;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class AnagramDetection 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter The 1st String");
		String first = Utility.scanString(); 
		System.out.println("Enter The 2nd String");
		String second = Utility.scanString();
		boolean answer = false;
		answer = Utility.anagramDetection(first, second);
		
		if(answer == true)
		{
			System.out.println("Input strings are anagram");
		}
		else
		{
			System.out.println("Input strings are not anagram");
		}
		
	}
}
