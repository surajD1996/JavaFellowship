package com.bridgelabz.datastructures;

import com.bridgelabz.utility.LinkedListX;

public class LinkedListMain <T>
{
	public static <T>void main(String[] args) 
	{
		LinkedListX <Integer> list = new LinkedListX();
		list.insert(5);
		list.insert(15);
		list.insert(25);
		
		list.displayNodes();
		list.insertAtFirst(10);
		list.displayNodes();
		
		list.insertLast(20);
		list.displayNodes();
		
		int count = list.countNodes();
		System.out.println(count);
		
//		Work2 ll = new Work2();
//		ll.add(86);
//		ll.add(48);
//		ll.add(89);
//		ll.add(78);
//		ll.add(32);
//		ll.add(13);
//		ll.add(45);
//		ll.add(65);
//		ll.display();
//		ll.sort();
//		ll.display();
	}
}
