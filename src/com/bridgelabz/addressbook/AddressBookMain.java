package com.bridgelabz.addressbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.Utility;

public class AddressBookMain 
{

	@SuppressWarnings({ "unused", "unused", "unused" })
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		List<AddressBook> addressBookList = new ArrayList<AddressBook>();
		List<String> fileList = new ArrayList<String>();
//		Person person = new Person();
//		person.setFirstName();
//		person.setLastName();
//		person.setContactNumber();
//		Address address = new Address();
//		address.setCity();
//		address.setState();
//		address.setPinCode();
//		person.setAddress(address);
//		AddressBook addressBook = new AddressBook();
//		addressBook.setPerson(person);
//		addressBookList.add(addressBook);
		
		int choice = 0;
		
		do
		{
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice");
			choice = Utility.scanInt();
			
			switch(choice)
			{
				case 1:
//					File file = new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/addressBook.json");
//					BufferedReader br = new BufferedReader(new FileReader(file));
//					
//					String str = br.readLine();
//					
//					String tempStr = "";
//					
//					while(str!=null)
//					{
//						tempStr = tempStr + str + " ";
//						str = br.readLine();
//					}
//					
//					System.out.println(str);
//					
					
					 
					Person person = new Person();
					person.setFirstName();
					person.setLastName();
					person.setContactNumber();
					Address address = new Address();
					address.setCity();
					address.setState();
					address.setPinCode();
					person.setAddress(address);
					AddressBook addressBook = new AddressBook();
					addressBook.setPerson(person);
					addressBookList.add(addressBook);
					JsonUtility.prettyPrint(addressBookList);
					break;
				case 2:
					addressBookList.remove(0);
					JsonUtility.prettyPrint(addressBookList);
					break;
				
				default: System.out.println("Enter Correact Element");
			}
						
		}while(choice!=4);
		
		
		
		
	}

}
