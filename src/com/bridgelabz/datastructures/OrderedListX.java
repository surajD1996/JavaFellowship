package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;


import com.bridgelabz.utility.LinkedListD;

public class OrderedListX {

	public static void main(String[] args) throws Exception 
	{
		LinkedListD dlinked = new LinkedListD();
		
		File file = new File("/home/user/Suraj/Week1/JavaFellowship/SampleIntegers");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = br.readLine();
		String[] strArray = str.split(" ");
		

//		for(int i = 0;i<strArray.length;i++)
//		{
//			dlinked.add((strArray[i]));
//		}
		
		dlinked.add(100);
//		dlinked.add(1);
//		dlinked.add(5);
//		dlinked.add(8);
//		dlinked.add(9);
//		dlinked.add(30);
//		dlinked.add(9);
//		dlinked.add(85);
//		dlinked.add(46);
//		dlinked.add(55);
//		dlinked.add(50);
//		dlinked.add(13);
//		dlinked.add(95);
//		dlinked.add(25);
//		dlinked.add(20);
//		dlinked.add(99);
//		dlinked.add(23);
//		dlinked.add(92);
////		
//		dlinked.display();
	}

}
