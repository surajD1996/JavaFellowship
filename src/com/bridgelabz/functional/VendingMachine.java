package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) 
	{
		System.out.println("Enter The Amount ");
		int amount = Utility.scanInt();
		Utility.vendingMachine(amount);

	}

}
