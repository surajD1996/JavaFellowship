package com.bridgelabz.objectorientation;

import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

public class RegularExpression 
{
	private static String firstName;
	private static String lastName;
	private static String fullName;
	private static String strDate;
	private static String mobileNumber;
	
	
	public static String getFirstName() 
	{
		return firstName;
	}
	
	public static void setFirstName() 
	{
		System.out.println("Enter Your First Name ");
		String tempString = Utility.scanString();
		if(Pattern.matches("[a-zA-z]+", tempString))
		{
			firstName = tempString;
		}
		else
		{	
			System.out.println("Enter Valid Input");
			System.exit(0);
		}
	}
	
	public static String getLastName() 
	{
		return lastName;
	}
	
	public static void setLastName() 
	{
		System.out.println("Enter Your Last Name ");
		String tempString = Utility.scanString();
		if(Pattern.matches("[a-zA-z]+", tempString))
		{
			lastName = tempString;
		}
		else
		{	
			System.out.println("Enter Valid Input");
			System.exit(0);
		}
	}
	
	public static String getFullName() 
	{
		return fullName;
	}
	
	public static void setFullName() 
	{
		fullName = firstName+" "+lastName;
	}
	
	public static String getDate() 
	{
		return strDate;
	}
	
	public static void setDate() 
	{
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    strDate= formatter.format(date); 
	}
	
	public static String getMobileNumber() 
	{
		return mobileNumber;
	}
	
	public static void setMobileNumber() 
	{
		
		System.out.println("Enter Your Contact Number ");
		String tempNumber = Utility.scanString();
		if(Pattern.matches("[789][0-9]{9}",tempNumber))
		{
			mobileNumber = tempNumber;
			
		}
		else
		{	
			System.out.println("Enter Valid Input");
			
		}
		
	}
	
}
