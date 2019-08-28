package com.bridgelabz.datastructures;

public class LinkedListX <T>
{
	Node <T> head;
	
	/**
	 * purpose 		inserts element at first position
	 * @param data	data to be inserted in linked list
	 */
	public void insertAtFirst(Object data)
	{
		Node <T> node = new Node<T>();
		node.data = data;
		if(head == null)
		{
			head = node;
		}
		else
		{
			node.next = head;
			head = node;
		}
		
	}
	
	/**
	 * purpose 		inserts the element at last position
	 * @param data	data to be inserted in linked list
	 */
	public void insertLast(Object data)
	{
		Node <T> node = new Node<T>();
		node.data = data;
		
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node <T>n = new Node<T>();
			n=head;
			while(n.next!=null)
			{
				n=n.next;
				
			}
			n.next=node;
			node.next = null;
		}
		
	}
	
	
	/**
	 * purpose 			insert element in the linked list
	 * @param string	
	 */
	public  void insert(Object string)
	{
		
		Node<T> node = new<T> Node();
		node.data = string;
		node.next = null;
		
		if(head==null)
		{
			head = node;
			
		}
		else
		{
			Node<T> n = new Node<T>();
			n = head;
			while(n.next!=null)
			{
				n = n.next;	
			}
			
			n.next = node;
			
		}
		
	}
	
	public int countNodes()
	{
		Node<T> node = new Node<T>();
		node = head;
		int nodeCount = 0;
		while(node!=null)
		{
			node = node.next;
			nodeCount++;
		}
		return nodeCount;
	}
	
	public void displayNodes()
	{
		Node<T> node = new Node<T>();
		node = head;
		
		while(node!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		
	}
	
	public int search(Object word, int length)
	{
		Node<T> node = new Node<T>();
		node = head;
		int position = 1;
		while(node.next!=null)
		{
			if(word.equals(node.data))
			{
				break;
			}
			node = node.next;
			position++;
		}
		if(position>=length)
		{
			return -1;
		}
		else
		{
			return position;
		}
	}

	public void deletAtPosition(int position) 
	{
		int count = 1;
		Node <T> node = new Node<T>();
		Node <T> node2 = new Node<T>();
		node = head;
		if(position==1)
		{
			head = head.next;
			node = null;
		}
		else
		{
			while(count!=position-1)
			{
				node=node.next;
				count++;
			}
			
			node2 = node.next;
			node.next = node2.next;
			node2 = null;
		}
		
	}
	
	public String[] convertToStringArray(int length)
	{
		int i = 0;
		Node <T> newNode = new Node<T>();
		newNode = head;
		String strArray[] = new String[length];
		while(newNode.next!=null)
		{
			strArray[i] = (String) newNode.data;
			newNode = newNode.next;
			i++;
		}
		
		//newNode = newNode.next;
		strArray[i] = (String) newNode.data; 
		return strArray;
	}
}
