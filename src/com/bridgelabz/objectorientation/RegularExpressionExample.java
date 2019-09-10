package com.bridgelabz.objectorientation;

public class RegularExpressionExample extends RegularExpression 
{

	public static void main(String[] args) 
	{
		
		String output = "Hello <<name>>, We have your full name as <<full name>> "
				+ "in our system. your contact number is 91-xxxxxxxxxx. Please,let us "
				+ "know in case of any clarification Thank you BridgeLabz 01/01/2016.";
				
		//RegularExpression regularExpression = new RegularExpression();
		
		boolean done = false;
//		do 
//		{
//			regularExpression.setFirstName();
//			regularExpression.setLastName();
//			regularExpression.setFullName();
//			regularExpression.setDate();
//			regularExpression.setMobileNumber();
//			
//			
//			if((regularExpression.getFullName()!=null)&&
//					(regularExpression.getDate()!=null)&&
//					(regularExpression.getMobileNumber()!=null))
//				{
//					output = output.replaceAll("<<name>>",regularExpression.getFirstName());
//					output = output.replaceAll("<<full name>>",regularExpression.getFullName());
//					output = output.replaceAll("xxxxxxxxxx",regularExpression.getMobileNumber());
//					output = output.replaceAll("01/01/2016",regularExpression.getDate());
//					System.out.println(output);
//					done = true;
//				}
//				else
//				{
//					System.out.println("You Have Entered Invalid Details");
//				}
//		}while(done==false);
		
//		while(done == false)
//		{
//			regularExpression.setFirstName();
//			regularExpression.setLastName();
//			regularExpression.setFullName();
//			regularExpression.setDate();
//			regularExpression.setMobileNumber();
//			
//			
//			if((regularExpression.getFullName()!=null)&&
//					(regularExpression.getDate()!=null)&&
//					(regularExpression.getMobileNumber()!=null))
//				{
//					output = output.replaceAll("<<name>>",regularExpression.getFirstName());
//					output = output.replaceAll("<<full name>>",regularExpression.getFullName());
//					output = output.replaceAll("xxxxxxxxxx",regularExpression.getMobileNumber());
//					output = output.replaceAll("01/01/2016",regularExpression.getDate());
//					System.out.println(output);
//					done = true;
//				}
//				else
//				{
//					System.out.println("You Have Entered Invalid Details");
//				}
//		}
		
		while(done == false)
		{
			setFirstName();
			setLastName();
			setFullName();
			setDate();
			setMobileNumber();
			
			if((getFullName()!=null)&&
					(getDate()!=null)&&
					(getMobileNumber()!=null))
				{
					output = output.replaceAll("<<name>>",getFirstName());
					output = output.replaceAll("<<full name>>",getFullName());
					output = output.replaceAll("xxxxxxxxxx",getMobileNumber());
					output = output.replaceAll("01/01/2016",getDate());
					System.out.println(output);
					done = true;
				}
				else
				{
					System.out.println("You Have Entered Invalid Details");
				}
			
		}
		
	}
}