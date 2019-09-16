package com.bridgelabz.objectorientation.addressbook;

import com.bridgelabz.utility.Utility;

public class PersonInformation 
{
	private String firstName;
	private String lastName;
	private long contactNumber;
	private String city;
	private String state;
	private int zipCode;
	
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName() 
	{
		System.out.println("Enter The first name : ");
		
		this.firstName = Utility.scanString();
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName() 
	{
		System.out.println(" Enter Last Name : ");
		this.lastName = Utility.scanString();
	}
	
	public long getContactNumber() 
	{
		return contactNumber;
	}
	
	public void setContactNumber() 
	{
		System.out.println(" Enter The Contact Number : ");
		this.contactNumber = Utility.scanLong();
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity() 
	{
		System.out.println(" Enter The City : ");
		this.city = Utility.scanString();
	}
	
	public String getState() 
	{
		return state;
	}
	
	public void setState() 
	{
		System.out.println(" Enter The State : ");
		this.state = Utility.scanString();
	}
	
	public int getZipCode() 
	{
		return zipCode;
	}
	
	public void setZipCode() 
	{
		System.out.println("Enter The Zip Code : ");
		this.zipCode = Utility.scanInt();
	}
	
	@Override
	public String toString() 
	{
		return "PersonInformation [firstName=" + firstName + ", lastName=" + lastName + ", contactNumber="
				+ contactNumber + ", City=" + city + ", State=" + state + ", zipCode=" + zipCode + "]";
	}
	
	public void setPersonInformation()
	{
		setFirstName();
		setLastName();
		setContactNumber();
		setCity();
		setState();
		setZipCode();
	}
	
		
}
