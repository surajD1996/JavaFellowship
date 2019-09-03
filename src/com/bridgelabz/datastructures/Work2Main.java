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
		Object n;
		for(int i = 0; i<arr.length;i++)
		{
			n = Integer.parseInt(arr[i]);
			ol.add(n);
		}
//		String s = "45";
//		int n = Integer.parseInt(s);
//		System.out.println(n);
//		ol.add(12);
//		ol.add(45);
//		ol.add(89);
//		ol.add(39);
//		ol.add(93);
//		ol.add(35);
//		ol.add(15);
//		ol.add(68);
//		ol.add(48);
//		ol.add(78);
		ol.display();
		System.out.println(ol.size);
		
		ol.sort();
		ol.display();
	}

}
