package com.bridgelabz.utility;

public class CommercialUtility 
{
	public static  int buyShares(int balance,int toBuy,int shareAmount)
	{
		int paidAmount=toBuy*shareAmount;
		System.out.println("Amount to purchase share : "+paidAmount);
		return (balance-paidAmount);
	}

	public static void sellShares(int balance,int toSell,int shareAmount)
	{
		int sellAmount=toSell*shareAmount;
		System.out.println("After sell share new total balance : "+(balance+sellAmount));
	}
}
