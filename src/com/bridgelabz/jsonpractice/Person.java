package com.bridgelabz.jsonpractice;

public class Person 
{
	private String personName;
	private Address address;
	
	public Person(String personName, Address address)
	{
		this.personName = personName;
		this.address = address;
	}
	
	public String getPersonName() 
	{
		return personName;
	}
	
	public void setPersonName(String personName) 
	{
		this.personName = personName;
	}
	
	public Address getAddress() 
	{
		return address;
	}
	
	public void setAddress(Address address) 
	{
		this.address = address;
	}
		
}
