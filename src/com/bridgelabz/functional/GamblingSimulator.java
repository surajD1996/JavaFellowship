package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class GamblingSimulator {

	public static void main(String[] args) {
		int stake, goal;//done
		int trails = 0; 
		
		System.out.println("Enter Your Stake Amount");
		stake = Utility.scanInt();
		System.out.println("Enter Maximum Win Amount");
		goal = Utility.scanInt();
		System.out.println("Enter Number of trails");
		trails = Utility.scanInt();
		
		Utility.GamblingSimulator(stake, goal, trails);
	}

}
