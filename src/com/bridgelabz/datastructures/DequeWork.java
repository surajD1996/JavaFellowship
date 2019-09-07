package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Deque;

public class DequeWork 
{
	public static <T> void main(String[] args) 
	{
		Deque <Integer> deque = new Deque();
		System.out.println("Deque length "+deque.size);
		
		deque.addFront(13);
		deque.addFront(14);
		deque.addFront(15);
		deque.addFront(16);
		deque.addFront(17);
		deque.addFront(18);
		deque.addFront(19);
		deque.addFront(20);
		deque.addFront(21);
		deque.addFront(22);
		System.out.println("Deque length "+deque.size);
		deque.viewDequeByFront();
		
		Object var = deque.removeFront();
		System.out.print("  "+var);
		
		var = deque.removeRear();
		System.out.print("  "+var);
		
		 var = deque.removeFront();
		System.out.print("  "+var);
		
		var = deque.removeRear();
		System.out.print("  "+var);
		
		 var = deque.removeFront();
		System.out.print("  "+var);
		
		var = deque.removeRear();
		System.out.print("  "+var);
		
		var = deque.removeFront();
		System.out.print("  "+var);
		
		var = deque.removeRear();
		System.out.print("  "+var);
		var = deque.removeFront();
		System.out.print("  "+var);
		
		var = deque.removeRear();
		System.out.print("  "+var);
				
	}
}
