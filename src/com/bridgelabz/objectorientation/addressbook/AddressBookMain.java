package com.bridgelabz.objectorientation.addressbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.jsonpractice.JsonUtility;
import com.bridgelabz.utility.Utility;

public class AddressBookMain {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		List<AddressBook> persons = new ArrayList();
		int choice = 0;
		do
		{
			Person person = new Person();
			Address address = new Address();
			AddressBook addressBook = new AddressBook();
			System.out.println("Enter The Choice ");
			System.out.print("1. Add New Record");
			System.out.print("2. Delete Record");
			System.out.print("3. Update Recort");
			
			choice = Utility.scanInt();
			
			switch(choice)
			{
				case 1:
					
					person.setFirstName("Vaibhav");
					person.setContactNumber(989898987);
					person.setLastName("Khadake");
					address.setCity("Kolhapur");
					address.setState("Maharashtra");
					address.setZipCode(416213);
					
					addressBook.setPerson(person);
					addressBook.setAddress(address);
					
					persons.add(addressBook);
					
					
					JsonUtility.prettyPrint(persons);
					break;
					
				case 2:
					persons.remove(0);
					break;
					
				default:
					System.out.println("Enter Valid choice");
					choice = 5;
					
				
					
			}
			
			
		}while(choice != 5);
		
		
		
		
		
		//JsonUtility.writeToJsonFile(addressBook);
		//JsonUtility.prettyPrint(addressBook);	
	}
}
