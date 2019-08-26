/******************************************************************************
 *  Purpose	 	calculates minimum number of Notes and the 
 *	 			Notes to be returned by the Vending Machine
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	23-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) 
	{
		System.out.println("Enter The Amount ");
		int amount = Utility.scanInt();
		Utility.vendingMachine(amount);
		for(int i =0; i<Utility.noteCount.length;i++)
		{
			if(Utility.noteCount[i]!=0)
			{
				if(i == 0)
				{
					
					System.out.println("1000 notes = "+Utility.noteCount[i]);
				}
				else if(i ==1)
				{
					System.out.println("500 notes = "+Utility.noteCount[i]);
				}
				else if(i ==2)
				{
					System.out.println("100 notes = "+Utility.noteCount[i]);
				}
				else if(i ==3)
				{
					System.out.println("50 notes = "+Utility.noteCount[i]);
				}
				else if(i ==4)
				{
					System.out.println("20 notes = "+Utility.noteCount[i]);
				}
				else if(i ==5)
				{
					System.out.println("10 notes = "+Utility.noteCount[i]);
				}
				else if(i ==6)
				{
					System.out.println("5 notes = "+Utility.noteCount[i]);
				}
			}
		}
	}

}