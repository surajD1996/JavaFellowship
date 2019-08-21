/*******************************************************************************************
 *  Purpose	 	user defined function to accept array of integers or double or booleans
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class TwoDimentionalArray 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Number of Rows ");
		int rowCount = Utility.scanInt();
		System.out.println("Enter Number of Columns ");
		int columnCount = Utility.scanInt();
		
		System.out.println("Enter Your Choice ");
		System.out.println("1.Array of integers");
		System.out.println("2.Array of doubles");
		System.out.println("3.Array of booleans");
		int choice = Utility.scanInt();
		
		switch(choice)
		{
			case 1:
				int intArray[][]=new int[rowCount][columnCount];
				intArray = Utility.arrayOfIntegers(rowCount, columnCount);
				for(int i=0;i<intArray.length;i++)
				{
					for(int j=0;j<intArray[i].length;j++)
					{
						System.out.println(intArray[i][j]);
					}
				}
				
				break;
			case 2:
				double doubleArray[][]=new double[rowCount][columnCount];
				doubleArray = Utility.arrayOfDoubles(rowCount, columnCount);
				for(int i=0;i<doubleArray.length;i++)
				{
					for(int j=0;j<doubleArray[i].length;j++)
					{
						System.out.println(doubleArray[i][j]);
					}
				}
				break;
//			case 3:
//				boolean boolArray[][]=new boolean[rowCount][columnCount];
//				Utility.arrayOfBooleans(rowCount, columnCount);
//				for(int i=0;i<boolArray.length;i++)
//				{
//					for(int j=0;j<boolArray.length;j++)
//					{
//						System.out.println(boolArray[i][j]);
//					}
//				}
//				break;
			default:
				System.out.println("Enter Correct Choice");
		}

	}

}
