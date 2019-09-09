package com.bridgelabz.objectorientation;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

public class DeckOfCards 
{

	public static void main(String[] args) 
	{		
		Queue <String> player1 = new Queue();
		Queue <String> player2 = new Queue();
		Queue <String> player3 = new Queue();
		Queue <String> player4 = new Queue();
		String suit[] = {"Club","Dimond","Heart","Spade"}; 
		String rank[] = {"2","3","4","5","6","7","8","9","10","King","Queen","King","Ace"};
		
		String cards[] = new String[52];
		
		
		int count = 0;
		for(int i = 0; i < suit.length; i++)
		{
			for(int j = 0; j<rank.length; j++)
			{
				cards[count] =suit[i] + rank[j];
				count++;
			}
		}
		
		for(String i:cards)
		{
			System.out.print(" "+i);
		}
		
		System.out.println("  ");
		String shuffeledCards [] = Utility.shuffelCards(cards);
		
		
		for(int i = 0; i<shuffeledCards.length; i++)
		{
			System.out.print(" "+shuffeledCards[i]);
		}
		System.out.println();
		System.out.println();
		
		String players[][] = DistributeCards.distributeCards(shuffeledCards);
		
		
//		for(int i = 0; i<players.length; i++)
//		{
//			System.out.print(" Player "+ (i+1)+" : ");
//			for(int j = 0; j<players[i].length; j++)
//			{
//				System.out.print(players[i][j]+" ");
//				
//			}
//			System.out.println(" ");
//		}
		
		int one = 0, two = 0, three = 0, four = 0;
		
		for(int i = 0; i < 36; i++)
		{
			if(i % 4 == 0)
			{
				player1.enqueue(players[0][one]);
				one++;
			}
			else if(i % 4 == 1)
			{
				player2.enqueue(players[1][two]);
				two++;
			}
			else if(i % 4 == 2)
			{
				player3.enqueue(players[2][three]);
				three++;
			}
			else if(i % 4 == 3)
			{
				player4.enqueue(players[3][four]);
				four++;
			}
			
		}
		
		player1.viewQueue();
		player2.viewQueue();
		player3.viewQueue();
		player4.viewQueue();
		
	}

}
