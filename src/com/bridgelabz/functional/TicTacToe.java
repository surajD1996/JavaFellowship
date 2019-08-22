/*******************************************************************************************
 *  Purpose	 	tic tac toe game with computer
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************************/
package com.bridgelabz.functional;

import java.util.Random;

import com.bridgelabz.utility.Utility;

public class TicTacToe 
{

	public static void main(String[] args) 
	{
		int array[][] = new int[3][3];
		boolean chance = false;
		Random random = new Random();
		int temp = 0;
		int row = 0;
		int column = 0;
		for(int i = 0;i < array.length;i++)
		{
			for(int j = 0;j < array[i].length;j++)
			{
				if(chance == false)
				{
					row = 0 + (int)random.nextInt(2);
					column = 0 + (int)random.nextInt(2);
					temp = 1;
					array[row][column] = temp;
					chance = true;
					
					//if()
					
				}
				else
				{
					System.out.println("Enter The Position ");
					row = Utility.scanInt();
					column = Utility.scanInt();
					temp = 2;
					array[row][column] = temp;
					chance = false;
				}
			}
		}
		

	}

}
