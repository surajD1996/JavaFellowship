package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MiddleElement {

	public static void main(String[] args) {
		
		System.out.println("Enter Number of Elements");
		int len = Utility.scanInt();
		int array[] = new int[len];
		for(int i =0; i<array.length;i++)
		{
			array[i] = Utility.scanInt();
		}
		int mid[] = Utility.midElement(array);
		System.out.println(mid[0]);
		System.out.println(mid[1]);
	}

}
