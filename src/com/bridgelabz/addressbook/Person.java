package com.bridgelabz.addressbook;

import java.io.Serializable;
import java.util.Scanner;

import org.codehaus.jackson.annotate.JsonProperty;

import com.bridgelabz.utility.Utility;

public class Person implements Serializable
{
	
	static Scanner sc = new Scanner(System.in);
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", contactNumber=" + contactNumber
				+ ", address=" + address + "]";
	}
	@JsonProperty
	private String firstName;
	@JsonProperty
	private String lastName;
	@JsonProperty
	private long contactNumber;
	@JsonProperty
	private Address address;
	
	
	
	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}

	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName() 
	{
		System.out.println("Enter The First Name");
		this.firstName = Utility.scanString();
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName() 
	{	
		System.out.println("Enter The Last Name");
		this.lastName = Utility.scanString();
	}
	
	public long getContactNumber() 
	{
		return contactNumber;
		
	}
	
	public void setContactNumber() 
	{
		System.out.println("Enter The Mobile Number");
		this.contactNumber = Utility.scanLong();
		
	}

}
