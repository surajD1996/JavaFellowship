package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class AnagramD {

	public static void anagram()
	{
		int y = 0;

		int[] arr = new int[170];

		for (int i = 1; i <= 1000; i++) {
			boolean flag = true;

			for (int j = 2; j < i - 1; j++) {
				
				if (i % j == 0) 
				{
					flag = false;
					break;
				}
			}
			if (flag == true) {
				arr[y] = i;
				y++;
			}
			
		}
		
	
		int[] a= new int[170];
		
		for(int i=0;i<arr.length;i++)
		{
			a[i]=arr[i];
		}
		
//		int arr[][] = Utility.primeRangeX(2, 1000);
		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(a[i]);
//		}
		
		//String[] array= new String[arr.length];
		
		StringBuffer sb= new StringBuffer(arr.length);
		
		String s=" ";
		
		for(int i=0;i<arr.length;i++)
		{
			s=sb.append(a[i]+" ").toString();
		}
		
		String[] str=s.split(" ");
		
		String arr1[][] = new String[10][30];
		boolean flag=true;
		String[][] s1=new String[arr.length][arr.length];
		//String[][] s2=new String[1000-arr.length][1000-arr.length];
		
		for(int k=0;k<str.length-1;k++)
		{
			for(int l=k+1;l<str.length;l++)
			{
				flag=Utility.anagramDetection(str[k], str[l]);
			
			
				if(flag==true)
				{
					s1[k][l]=str[k]+" "+str[l];
					System.out.println(s1[k][l]);
						
				}
			
			}
		}
		
		
	}

}
