/*******************************************************************************************
 *  Purpose	 	to find percentage of head and tails after fliping a coin number of times
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************************/

package com.bridgelabz.functional;

import java.util.Random;

import com.bridgelabz.utility.Utility;

public class FlipCoin 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number of Tosses");
		int numberOfTosses = Utility.scanInt();
		float headPercentage=0;
		
		int count = 0;
		int coinTossedArray[]= new int[numberOfTosses]; 
		Random random = new Random();
		System.out.println("Coin is tossed "+numberOfTosses+(" times"));
		
		for(count = 0; count < numberOfTosses; count++)
		{
			 coinTossedArray[count] =  0 + (int)random.nextInt(2);
		}
		/*
		 * for(count = 0;count < numberOfTosses;count++) {
		 * System.out.println(coinTossedArray[count]); }
		 */
		headPercentage = Utility.flipCoin(coinTossedArray);
		System.out.println("Head Win = "+headPercentage);
		System.out.println("Tails Win = "+(100 - headPercentage));
	}

}
