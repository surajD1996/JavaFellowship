package com.bridgelabz.algorithm;

public class SecondLargestInArray {

	public static void main(String[] args) 
	{
		int arr[] = {9,8,4,7,3};
		int i=0, high = 0, sec = 0;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>high)
			{
				high = arr[i];
			}
			if((arr[i]<high)&&(arr[i]>sec))
			{
				sec = arr[i];
			}
		}
		System.out.println(sec);
		
	}

}
