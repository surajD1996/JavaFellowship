package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Stack;
import com.bridgelabz.utility.Utility;

public class BalancedParanthesis 
{
	public static <T> void main(String[] args) 
	{
		Stack <Character> stack = new  Stack();
		System.out.println("Enter The Expression");
		String expression = new String();
		expression = Utility.scanString();
		int top = 0;
		int round = 0 , curly = 0 , square = 0; 
		
		
		char expressionArray[] = expression.toCharArray();
		
//		for(int i = 0; i<expressionArray.length; i++)
//		{
//			if((expressionArray[i]=='(')||(expressionArray[i]=='{')||(expressionArray[i]=='['))
//			{
//				top++;
//				stack.push(expressionArray[i]);
//			}
//			
//			else if((expressionArray[i]==')')||(expressionArray[i]=='}')||(expressionArray[i]==']'))
//			{
//				if(top==0)
//				{
//					top=-1;
//					break;
//				}
//				stack.pop();
//				top--;
//			}
//		}
		//{}[)(]
		for(int i = 0; i < expressionArray.length; i++)
		{
			if(expressionArray[i]=='(')
			{
				round++;
				top++;
				stack.push(expressionArray[i]);
			}
			if(expressionArray[i]=='{')
			{
				curly++;
				top++;
				stack.push(expressionArray[i]);
			}
			if(expressionArray[i]=='[')
			{
				square++;
				top++;
				stack.push(expressionArray[i]);
			}
			if(expressionArray[i]==')')
			{
				if((top==0)||(round==0))
				{
					top = -1;
					round = -1;
					break;
				}
				round--;
				top--;
				stack.pop();
			}
			if(expressionArray[i]=='}')
			{
				if((top==0)||(curly==0))
				{
					curly = -1;
					top = -1;
					break;
				}
				curly--;
				top--;
				stack.pop();
			}
			if(expressionArray[i]==']')
			{
				if((top==0)||(square==0))
				{
					square = -1;
					top = -1;
					break;
				}
				square--;
				top--;
				stack.pop();
			}
			
		}
		
		if((stack.isEmpty())&&(top==0)&&(round==0)&&(curly==0)&&(square==0))
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
