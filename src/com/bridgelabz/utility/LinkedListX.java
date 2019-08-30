package com.bridgelabz.utility;

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
		node.data = (T) data;
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
		node.data = (T) data;
		
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
	 * purpose 	insert element in the linked list at the end
	 * @param 	string	data of the node	
	 */
	public  void insert(Object string)
	{
		
		Node<T> node = new<T> Node();
		node.data = (T) string;
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
	
	/**
	 * Purpose	to count the elements from the linked list
	 * @return	nodeCount 	count of nodes
	 */
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
	
	/**
	 * Purpose 	displays all nodes of linked list
	 */
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
	
	/**
	 * Purpose 	search the element in the linked list
	 * @param  	word	 the element which should be searched in linked list	 
	 * @param   length 	 total number of nodes in linked list 
	 * @return	position the position of the searched element
	 */
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

	/**
	 * Purpose 	delete the element of particular position
	 * @param position	the position from which the element should be deleted
	 */
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
	
	/**
	 * Purpose 	converts linked list elements to a string array
	 * @param 	length	 total numbers of nodes from linked list
	 * @return	strArray is array of elements from linked list
	 */
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
