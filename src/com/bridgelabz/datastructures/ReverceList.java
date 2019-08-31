package com.bridgelabz.datastructures;

import com.bridgelabz.utility.LinkedListX;

public class ReverceList 
{

	public static <T>void main(String[] args) 
	{
		LinkedListX <T>list = new LinkedListX<T>();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.displayNodes();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
	}

}
