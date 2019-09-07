package com.bridgelabz.datastructures;



class Node1
{
	int data;
	Node1 left;
	Node1 right;
}
class BinaryTree
{
	 
	
	
	private static final int COUNT = 10;
	

	public Node1 creatNewNode1(int k) {
		Node1 n=new Node1();
		n.data=k;
		n.left=null;
		n.right=null;
		return n;
	}
	
	static void print2DUtil(Node1 root, int space)  
	{  
	    // Base case  
	    if (root == null)  
	        return;  
	  
	    // Increase distance between levels  
	    space += COUNT;  
	  
	    // Process right child first  
	    print2DUtil(root.right, space);  
	  
	    // Print current node after space  
	    // count  
	    System.out.print("\n");  
	    for (int i = COUNT; i < space; i++)  
	        System.out.print(" ");  
	    System.out.print(root.data + "\n");  
	  
	    // Process left child  
	    print2DUtil(root.left, space);  
	}  
	  
	// Wrapper over print2DUtil()  
	static void print2D(Node1 root)  
	{  
	    // Pass initial space count as 0  
	    print2DUtil(root, 0);  
	}


	public Node1 insert(Node1 root, int val){
		if (root==null) {
			return creatNewNode1(val); 
		}
		if(val<root.data) {
			root.left=insert(root.left, val);
		}
		else if(val>root.data) {
			root.right=insert(root.right, val);
		}
		return root;
	}

	public static void main (String[]args) {

		BinaryTree a = new BinaryTree();
		
		Node1 root=null;
		 
		root =a.insert(root, 5);
		root =a.insert(root, 1);
		root =a.insert(root, 2);
		root =a.insert(root, 3);
		root =a.insert(root, 4);
		root =a.insert(root, 100);
		
		
		print2D(root);
		
	}
}
