package com.bridgelabz.objectorientation;

public class DistributeCards 
{

	public static String[][] distributeCards(String[] shuffelCards) 
	{
		
		String players[][] = new String[4][9];
		for(int i = 0, count =0; i < players.length; i++)
		{
			for(int j = 0; j < players[i].length; j++)
			{
				players[i][j] = shuffelCards[count];
				count++;
			}
		}
		return players;
	}
	

}
