package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class PrimeRangeX 
{
	public static int[][] primeRange(int lowerLimit, int upperLimit) 
	{
		int primeArray[][] = new int[10][30];
		for(int i = lowerLimit;i<=upperLimit;i++)
		{
			boolean temp = Utility.checkPrime(i);
			if(temp == true)
			{
				
				for(int j=0;j<primeArray.length;j++)
				{
					for(int k = 0; k<primeArray[j].length;k++)
					{
						if((i>1)&&(i<100))
						{
							primeArray[j][k] = i;
						}
						else if((i>100)&&(i<200))
						{
							primeArray[j][k] = i;
						}
						else if((i>200)&&(i<300))
						{
							primeArray[j][k] = i;
						}
						else if((i>300)&&(i<400))
						{
							primeArray[j][k] = i;
						}
						else if((i>400)&&(i<500))
						{
							primeArray[j][k] = i;
						}
						else if((i>500)&&(i<600))
						{
							primeArray[j][k] = i;
						}
						else if((i>600)&&(i<700))
						{
							primeArray[j][k] = i;
						}
						else if((i>700)&&(i<800))
						{
							primeArray[j][k] = i;
						}
						else if((i>800)&&(i<900))
						{
							primeArray[j][k] = i;
						}
						else if((i>900)&&(i<1000))
						{
							primeArray[j][k] = i;
						}
					}
				}
			}
		}
		return primeArray;
	}
	
	public static void main(String[] args) 
	{
		int primeArray[][] = primeRange(1,1000);
		for(int i =0;i<primeArray.length;i++)
		{
			for(int j=0;j<primeArray[i].length;j++)
			{
				System.out.println(primeArray[i][j]);
			}
		}	
	}
}
