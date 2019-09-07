package com.bridgelabz.utility;

public class Hashing 
{
	Node head;
	public Node insertAtFirst(Object data, Node hashHead)
	{
		head = hashHead;
		
		Node  node = new Node();
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
		hashHead = head;
		return hashHead;
	}
	
	/**
	 * Purpose 	displays all nodes of linked list
	 */
	public void displayNodes(Node hashHead)
	{
		head = hashHead;
		Node node = new Node();
		
		node = head;
		
		while(node!=null)
		{
			//System.out.println("hi");
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println(" ");
	}
}
