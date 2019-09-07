package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class PrimeRangeX 
{
	
	
	public static void main(String[] args) 
	{
		int primeArray[][] = Utility.primeRangeX(2,1000);
		for(int i =0;i<primeArray.length;i++)
		{
			for(int j=0;j<primeArray[i].length;j++)
			{
				if(primeArray[i][j]!=0)
				{
					System.out.print(primeArray[i][j]+" ");
				}	
			}
			System.out.println("");
		}
		
		
		
		
	}
}
