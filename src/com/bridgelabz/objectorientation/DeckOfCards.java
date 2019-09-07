
package com.bridgelabz.objectorientation;

import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {
		String[] suit = {"Club", "Diamond", "Heart", "Spade"};
		String[] rank = {"2", "3", "4", "5","6", "7", "8", "9","10", "Jack", "Queen", "King", "Ace"};
		
		String[] Cat = new String[52];
		
		int count = 0;
		for(int i=0; i<suit.length; i++)
		{
			for(int j=0; j<rank.length; j++)
			{
				Cat[count] = suit[i]+" "+rank[j];
				count++;
			}			
		}
		
		for(String a: Cat)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		String[] shuffledCat=shuffleTheCards(Cat);
		
		for(String a: shuffledCat)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		int count1 = 0;
		for (int i = 1; i<=4; i++) 
		{
			System.out.print("\nPlayer "+i+" has recieved : ");
			for (int j = 0; j < 13; j++) 
			{
				System.out.print(shuffledCat[count1]+" ");
				count1++;
			}
			System.out.println();
		}
	}

	private static String[] shuffleTheCards(String[] Cat) {
		Random random = new Random();
		for(int i=0; i<Cat.length-1; i++)
		{
			int value = random.nextInt(Cat.length);
			String temp = Cat[i];
			Cat[i] = Cat[value];
			Cat[value] = temp;
			//System.out.println(value);
		}
		return Cat;
	}

}