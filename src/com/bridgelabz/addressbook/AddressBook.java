package com.bridgelabz.addressbook;

public class AddressBook 
{
	@Override
	public String toString() {
		return "AddressBook [person=" + person + "]";
	}

	Person person;
		
	public Person getPerson() 
	{
		return person;
	}
	
	public void setPerson(Person person) 
	{
		this.person = person;
	}
}
