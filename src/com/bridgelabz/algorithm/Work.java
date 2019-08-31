package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Work 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter The Values");
		String str = Utility.scanString();
		//str = str.substring(4);
		System.out.println(str);
		String str2 = Utility.scanString();
		
		for(int i=0;i<10;i++)
		{
			System.out.println(Math.random());
		}
//		
//		char a = 'a';
//		char b = 'a';
//		if(a==b)
//		{
//			System.out.println("yes");
//		}
//		else
//			System.out.println("no");
//			
		
	}

}


//public class Work { 
//
//    public static void main(String[] args) {
//        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
//        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
//        int trials = Integer.parseInt(args[2]);    // number of trials to perform
//
//        int bets = 0;        // total number of bets made
//        int wins = 0;        // total number of games won
//
//        // repeat trials times
//        for (int t = 0; t < trials; t++) {
//
//            // do one gambler's ruin simulation
//            int cash = stake;
//            while (cash > 0 && cash < goal) {
//                bets++;
//                if (Math.random() < 0.5) cash++;     // win $1
//                else                     cash--;     // lose $1
//            }
//            if (cash == goal) wins++;                // did gambler go achieve desired goal?
//        }
//
//        // print results
//        System.out.println(wins + " wins of " + trials);
//        System.out.println("Percent of games won = " + 100.0 * wins / trials);
//        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
//    }
//
//}