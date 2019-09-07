package com.bridgelabz.utility;



public class Stack<T>
{
	Node <T> head;
	
	public  void push(T expressionArray)
	{
		Node<T> newNode = new Node<T>();
		newNode.data =  expressionArray;
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			newNode.next =   head;
			head = newNode;
		}
	}
	
	public boolean pop()
	{
		Node <T> tempNode = head;
		
		if(head.next == null)
		{
			return false;
		}
		else
		{
			head = head.next;
			Object deleted = tempNode.data;
			tempNode = null;
			return true;
		}
	
	}
	
	public Object peek()
	{
		Object topElement = null;
		topElement = head.data;
			
		return topElement;
	}
	
	public boolean isEmpty()
	{
		if(head == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public int size()
	{
		int top=0;
		Node <T> tempNode = new Node<T>();
		tempNode = head;
		while(tempNode!=null)
		{
			top++;
			tempNode = tempNode.next;
		}
		return top;
	}
	
	public void viewStack()
	{
		Node <T> tempNode = new Node<T>();
		tempNode = head;
		System.out.print("Stack Elements = ");
		while(tempNode!=null)
		{
			System.out.print(tempNode.data+" ");
			tempNode = tempNode.next;
		}
		System.out.println(" ");
	}

	public void viewStackAnagram() 
	{
		Node <T> tempNode = new Node<T>();
		tempNode = head;
		int iCnt = 0;
		while(tempNode!=null)
		{
			if(iCnt<2)
			{
				System.out.println(tempNode.data+" ");
				iCnt++;
			}
			else
			{
				System.out.println();
				iCnt = 0;
			}
			
			tempNode = tempNode.next;
		}
		System.out.println(" ");
	}
	
}
