package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Hashing;
import com.bridgelabz.utility.Node;
import com.bridgelabz.utility.Utility;

public class HashingFunctionWork 
{

	public static void main(String[] args) 
	{
		
		Node arr[] = new Node[11];
		Hashing hashMap = new Hashing();
		//System.out.println("Hello");
//		arr[0] = hl.insertAtFirst(10, arr[0]);
//		
//		arr[0]=hl.insertAtFirst(18, arr[0]);
//		arr[0]=hl.insertAtFirst(16, arr[0]);
//		arr[0]=hl.insertAtFirst(14, arr[0]);
//		arr[0]=hl.insertAtFirst(12, arr[0]);
//		
//		hl.displayNodes(arr[0]);
//		
//		arr[1] = hl.insertAtFirst(20, arr[1]);
//		
//		arr[1]=hl.insertAtFirst(25, arr[1]);
//		arr[1]=hl.insertAtFirst(85, arr[1]);
//		arr[1]=hl.insertAtFirst(45, arr[1]);
//		arr[1]=hl.insertAtFirst(65, arr[1]);
//		
//		hl.displayNodes(arr[1]);
		
		System.out.println("Enter the Number Of elements");
		int lenght = Utility.scanInt();
		int data[] = new int[lenght];
		System.out.println("Enter Elements");
		
		for(int i = 0;i<data.length;i++)
		{
			data[i] = Utility.scanInt();
		}
		
		for(int j = 0;j<arr.length;j++)
		{
			for(int i = 0; i<data.length;i++)
			{
				if(data[i]%11==j)
				{
					arr[j] = hashMap.insertAtFirst(data[i], arr[j]);	
				}
			}
		}
		
		
		
//		for(int i = 0; i<arr.length; i++)
//		{
//			hashMap.displayNodes(arr[i]);
//		}
		
	}
}
