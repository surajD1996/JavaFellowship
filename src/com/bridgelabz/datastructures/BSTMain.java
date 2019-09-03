package com.bridgelabz.datastructures;

import com.bridgelabz.utility.LinkedListD;
import com.bridgelabz.utility.Node2;

class Node 
{
	Node left,right;
	int data;
}

class BST
{
	public Node createNewNode(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.left = newNode.right = null;
		return newNode;
	}
	
	public Node insert(Node node, int data)
	{
		if(node == null)
		{
			return createNewNode(data);
		}
		if(data< node.data)
		{
			node.left = insert(node.left,data);
		}
		else if(data>node.data)
		{
			node.right = insert(node.right, data);
		}
		
		return node;
	}
	
	public void display(Node node)
	{
		Node temp = node;
		
	}
	
}



public class BSTMain {

	public static void main(String[] args) 
	{
		LinkedListD bst = new LinkedListD();
		BST a = new BST();
		Node root = null;
		a.insert(root, 8);
		a.insert(root, 3);
		a.insert(root, 15);
		System.out.println();
	}

}
