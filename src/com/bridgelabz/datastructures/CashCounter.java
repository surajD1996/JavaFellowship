package com.bridgelabz.datastructures;

import com.bridgelabz.utility.QueueUtility;
import com.bridgelabz.utility.Utility;

public class CashCounter {

	public static <T> void main(String[] args) 
	{
		int cashAvailable = 50000;
		QueueUtility <T> cashCounterQueue = new QueueUtility<T>();
		cashCounterQueue.enqueue(1);
		cashCounterQueue.enqueue(2);
		cashCounterQueue.enqueue(3);
		cashCounterQueue.enqueue(4);
		cashCounterQueue.enqueue(5);
		
		cashCounterQueue.viewQueue();
		int choice = 0;
		while(true)
		{
			System.out.println("Enter Your Choice");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Exit");
			
			choice = Utility.scanInt();
			
			switch(choice)
			{
				case 1:		cashAvailable = Utility.deposit(cashAvailable);
							System.out.println("Cash has been deposited");
							break;
				case 2: 	cashAvailable = Utility.withdraw(cashAvailable);
							System.out.println("Cash has been Withdrawn");
							break;
				case 3:		System.out.println("Thank You Visit Again..!!!");
							cashCounterQueue.dequeue();
							cashCounterQueue.viewQueue();
							break;
				default:	System.out.println("Enter Correct Choice");
					
			}
			
			if(cashCounterQueue.isEmpty())
			{
				
				break;
			}
			
		}
		
		//cashCounterQueue.dequeue();		
		
		//cashCounterQueue.viewQueue();
	}

}
