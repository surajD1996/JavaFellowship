package com.bridgelabz.utility;

public class QueueUtility<T> 
{
	Node <T> front;
	Node <T> rear;
	public int size=0;
	
	public void enqueue(Object item)
	{
		Node<T> newNode = new Node<T>();
		newNode.data =  item;
		if(front == null)
		{
			front = rear = newNode;
			size++;
		}
		else
		{
			size++;
			rear.next = newNode;
			rear = rear.next;
		}
	}
	
	public Object dequeue()
	{
		Object data;
		Node<T> tempNode = new Node<T>();
		tempNode = front;
		if(front.next==null)
		{
			size--;
			data = front.data;
			front = null;			
		}
		else
		{
			size--;
			front = front.next;
			 data =  tempNode.data;
			tempNode = null;			
		}
		return data;
	}
	
	public void viewQueue()
	{
		Node<T> tempNode = new Node<T>();
		tempNode = front;
		if(front==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.print("Queue = ");
			while(tempNode!=null)
			{
				System.out.print("  "+tempNode.data);
				tempNode = tempNode.next;
			}
			System.out.println("");
		}
		
	}
	
	public boolean isEmpty()
	{
		if(front==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
