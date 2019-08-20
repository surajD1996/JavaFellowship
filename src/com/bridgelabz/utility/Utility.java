package com.bridgelabz.utility;

public class Utility 
{

	public static int scanInt() 
	{
		int input;
		return 0;
	}
	
	/**
	 * purpose 	calculates the percentage of head when coin is tossed
	 * @param 	coinTossedArray
	 * @return	percentage of head
	 */
	public static float flipCoin(int coinTossedArray[]) 
	{
		float headPercentage = 0;
		
		int count = 0;
		
		for(count = 0;count < coinTossedArray.length;count++)
		{
			if(coinTossedArray[count]==0)
			{
				headPercentage++;
			}
		}
		
		headPercentage = (headPercentage/coinTossedArray.length)*100;
		
		return headPercentage;
	}
	
	/**
	 * purpose 	tells us the input year is leap year or not
	 * @param 	year input year
	 * return 	returns true if year is leap year else false	
	 */
	public static boolean leapYear(int year)
	{		
		if(year<=1582)
		{			
			return false;
		}
		if((year%400)==0)
		{			
			return true;
		}
		else if((year%100)==0)
		{			
			return false;
		}
		else if((year%4)==0)
		{			
			return true;
		}
		else
		{			
			return false;
		}
	}

	public static void powerOf2(int power) 
	{

		int count = 0;
		int temporary = 0;
		int answer = 0;
		
		for(count = 1;count<=power;count++)
		{
			temporary = count;
			answer = 1;
			
			while(temporary != 0)
			{
				answer = answer * 2;
				temporary--;
			}
			System.out.println(count+" = "+answer);
		}
	}

	
	/**
	 * purpose calculate the harmonic number
	 * @param endPoint	value till we want to calculate harmonic number
	 * @return	answer that is harmonic number
	 */
	public static float harmonicNumber(double endPoint) 
	{
		float answer = 0;
		float count = 0;
		
		for(count = 1;count<=endPoint;count++)
		{
			answer = answer + (1/count);
		}
		
		return answer;
	}
	
	public static boolean checkPrime(int number)
	{
		int count = 0;
		for(count = 2;count < number;count++)
		{
			if((number%2)==0)
			{
				break;
			}
		}
		if(count==number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void primeFactors(int inputNumber) 
	{
		int count = 0;
		boolean check = false;
		for(count = 2;count < inputNumber;count++)
		{
			System.out.println(count);
			if((inputNumber%count)==0)
			{
				System.out.println(count);
				check = checkPrime(count);
			}
			if(check == true)
			{
				System.out.println(count);
			}
		}
		
	}
	
	
}
