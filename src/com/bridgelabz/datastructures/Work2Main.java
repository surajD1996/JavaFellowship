package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

public class Work2Main 
{

	public static void main(String[] args) throws Exception 
	{
		Work2 ol = new Work2();
		File file = new File("/home/user/Suraj/Week1/JavaFellowship/SampleIntegers");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = br.readLine();
		String arr[] = str.split(" ");
		for(int i = 0; i<arr.length;i++)
		{
			ol.add(arr[i]);
		}
		ol.display();
		System.out.println(ol.size);
		
		ol.sort();
		ol.display();
	}

}
