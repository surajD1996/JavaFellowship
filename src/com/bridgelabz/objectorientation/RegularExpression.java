package com.bridgelabz.objectorientation;

import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

public class RegularExpression 
{
	private String firstName;
	private String lastName;
	private String fullName;
	private String strDate;
	private String mobileNumber;
	
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName() 
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
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName() 
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
	
	public String getFullName() 
	{
		return fullName;
	}
	
	public void setFullName() 
	{
		this.fullName = firstName+" "+lastName;
	}
	
	public String getDate() 
	{
		return strDate;
	}
	
	public void setDate() 
	{
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    strDate= formatter.format(date); 
	}
	
	public String getMobileNumber() 
	{
		return mobileNumber;
	}
	
	public void setMobileNumber() 
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
			System.exit(0);
		}
		
	}
	
}
