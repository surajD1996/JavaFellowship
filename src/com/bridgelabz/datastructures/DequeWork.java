package com.bridgelabz.datastructures;

import com.bridgelabz.utility.DequeUtility;

public class DequeWork 
{

	public static <T> void main(String[] args) 
	{
		DequeUtility <T> deque = new DequeUtility<T>();
		System.out.println("Deque length "+deque.size);
		deque.addFront(11);
		deque.addFront(20);
		deque.addFront(30);
		deque.addFront(40);
		deque.addRear(31);
		deque.addRear(21);
		deque.addRear(10);
		System.out.println("Deque length "+deque.size);
		deque.viewDequeByFront();
	}

}
