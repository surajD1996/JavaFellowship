package com.bridgelabz.datastructures;

public class LinkedListMain <T>
{
	public static <T>void main(String[] args) 
	{
		LinkedListX <T> list = new LinkedListX<T>();
		list.insert("Hello");
		list.insert("Suraj");
		list.insert("abc");
		
		list.displayNodes();
		list.insertAtFirst("xyz");
		list.displayNodes();
		
		list.insertLast("pqr");
		list.displayNodes();
		
		int count = list.countNodes();
		System.out.println(count);
	}
}
