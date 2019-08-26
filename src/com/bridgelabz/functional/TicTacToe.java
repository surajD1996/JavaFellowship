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
					row = 0 + (int)random.nextInt(3);
					column = 0 + (int)random.nextInt(3);
					
					if(array[row][column]==0)
					{
						array[row][column]=1;
						chance = true;
						for(int k=0;k<array.length;k++)
						{
							for(int l =0;l<array[i].length;l++)
							{
								if(k==0)
								{
									if((array[k][l]==array[k][l+1])&&(array[k][l+1])==array[k][l+2])
									{}
								}
							}
							
						}
					}
					
					
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
