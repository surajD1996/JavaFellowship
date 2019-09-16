package com.bridgelabz.objectorientation.addressbook;

public class AddressBook 
{
	PersonInformation person;

	public PersonInformation getPerson() {
		return person;
	}

	public void setPerson(PersonInformation person) {
		this.person = person;
	}

	@Override
	public String toString() 
	{
		return "AddressBook [person=" + person.toString() + "]";
	}
	
}
