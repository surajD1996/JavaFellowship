package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Node;


public class Work2 
{
	Node head;
	public int size;
	public void add(String data)
	{
		size++;
		Node newNode = new Node();
		newNode.data = data;
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node tempNode = head;
			while(tempNode.next!=null)
			{
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
			
		}
	}
	
	public void sort()
	{
		Node current=head;
		Node index=null;
		int temp;
	
		if(head==null)
		{
			return ;
		}
		else
		{
			//Node index will point to node next to current  
			while(current!=null)
			{
				index=current.next;
			
				while(index!=null)
				{
					//Use bubble sort 
					if((int)current.data > (int)index.data)
					{  
						temp = (int) current.data;  
					    current.data = index.data;  
					    index.data = temp;  
					}
				    index=index.next;
				}
				current=current.next;
			}
		}
	}

	
	public void display()
	{
		Node tempNode = head;
		while(tempNode != null)
		{
			System.out.print("  "+tempNode.data);
			tempNode = tempNode.next;
		}
		System.out.println(" ");
	}
	
}
