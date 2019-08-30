package com.bridgelabz.datastructures;

import com.bridgelabz.utility.StackUtility;
import com.bridgelabz.utility.Utility;

public class BalancedParanthesis 
{
	public static <T> void main(String[] args) 
	{
		StackUtility <T> stack = new  StackUtility<T>();
		System.out.println("Enter The Expression");
		String expression = new String();
		expression = Utility.scanString();
		int top = 0;
		
		char expressionArray[] = expression.toCharArray();
		
		for(int i = 0; i<expressionArray.length; i++)
		{
			if(expressionArray[i]=='(')
			{
				top++;
				stack.push(expressionArray[i]);
			}
			
			else if(expressionArray[i]==')')
			{
				if(top==0)
				{
					top=-1;
					break;
				}
				stack.pop();
					
			}
		}
		if(!(stack.isEmpty())&&(top==0))
		{
			System.out.println("Expression has balanced paranthesis");
		}
		else
		{
			System.out.println("Expression has not balanced paranthesis");
		}
		
//		for(int i = 0;i<expression.length();i++)
//		{
//			stack.push(expression.charAt(i));
//		}
//		int size = stack.size();
//		System.out.println("length = "+size);
//		stack.viewStack();
	}
}
