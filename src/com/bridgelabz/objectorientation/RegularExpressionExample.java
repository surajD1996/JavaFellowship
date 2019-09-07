package com.bridgelabz.objectorientation;

public class RegularExpressionExample  
{

	public static void main(String[] args) 
	{
		
		String output = "Hello <<name>>, We have your full name as <<full name>> "
				+ "in our system. your contact number is 91-xxxxxxxxxx. Please,let us "
				+ "know in case of any clarification Thank you BridgeLabz 01/01/2016.";
				
		RegularExpression regularExpression = new RegularExpression();
		regularExpression.setFirstName();
		regularExpression.setLastName();
		regularExpression.setFullName();
		regularExpression.setDate();
		regularExpression.setMobileNumber();
		
		if((regularExpression.getFullName()!=null)&&
			(regularExpression.getDate()!=null)&&
			(regularExpression.getMobileNumber()!=null))
		{
			output = output.replaceAll("<<name>>",regularExpression.getFirstName());
			output = output.replaceAll("<<full name>>",regularExpression.getFullName());
			output = output.replaceAll("xxxxxxxxxx",regularExpression.getMobileNumber());
			output = output.replaceAll("01/01/2016",regularExpression.getDate());
			System.out.println(output);
		}
		else
		{
			System.out.println("You Have Entered Invalid Details");
		}
			
	}	
}