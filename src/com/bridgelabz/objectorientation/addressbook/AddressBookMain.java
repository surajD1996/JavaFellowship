package com.bridgelabz.objectorientation.addressbook;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.addressbook.AddressBook;
import com.bridgelabz.addressbook.JsonUtility;
import com.bridgelabz.utility.Utility;

public class AddressBookMain
{

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		
		ObjectMapper objectMapper = new ObjectMapper();
		List<AddressBook> addressBookList = new ArrayList<AddressBook>(); 
		int choice = 0;
		String jsonFile = null;
		do 
		{
			System.out.println("1. Create New File ");
			System.out.println("2. Open a File ");
			System.out.println("3. Add Person Information  ");
			System.out.println("4. Save File ");
			System.out.println("5. Sort ");
			System.out.println("6. Exit ");
			System.out.println("Enter Your Choice : ");
			choice = Utility.scanInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Creating New File  ");
					AddressBookOperations.createNewJsonFile();
					break;
					
				case 2: 
					
					System.out.println("Enter The Name Of The File To Open");
					System.out.println("Enter File Name To Open ");
					jsonFile = Utility.scanString();
					jsonFile = AddressBookOperations.openJsonFile(jsonFile);
					
				case 3:
					
//					AddressBookOperations.addJsonFile(addressBookList, 	AddressBookOperations.openJsonFile());
//					System.out.println("Data Added To File Successfully");
//					System.out.println(jsonFile);
//					File fileObject = new File(jsonFile);
//					
//					if(fileObject.length() == 0)
//					{
//						PersonInformation personInformation = new PersonInformation();
//						personInformation.setPersonInformation();
//						System.out.println("You Entered ");
//						System.out.println(personInformation.toString());
//						AddressBook addressBook = new AddressBook();
//						addressBook.setPerson(personInformation);
//						addressBookList.add(addressBook);
//						JsonUtility.prettyPrint(addressBookList, jsonFile);
//					}
//					
//					else
//					{
//						List<AddressBook> oldAddressList = objectMapper.readValue(fileObject, new TypeReference<List<AddressBook>>() {});
//						addressBookList.addAll(oldAddressList);
//						PersonInformation personInformation = new PersonInformation();
//						personInformation.setPersonInformation();
//						System.out.println(addressBookList.get(0).getPerson().getFirstName());
//						System.out.println("You Entered ");
//						System.out.println(personInformation.toString());
//						AddressBook addressBook = new AddressBook();
//						addressBook.setPerson(personInformation);
//						
//						System.out.println(addressBook.getPerson().getFirstName());
//						
//						addressBookList.add(addressBook);
//						
//						JsonUtility.prettyPrint(addressBookList, jsonFile);
//					}
					
					System.out.println("Enter File Name To open ");
					
					String fileName = Utility.scanString();
					try
					{
						File file = new File(fileName+".json");
						List<AddressBook> personList = objectMapper.readValue(file, new TypeReference<List<AddressBook>>() {});
						addressBookList.addAll(personList);
						PersonInformation personInformation = new PersonInformation();
						personInformation.setPersonInformation();
						AddressBook addressBook = new AddressBook();
						addressBook.setPerson(personInformation);
						addressBookList.add(addressBook);
						JsonUtility.prettyPrint(addressBookList, fileName);
						
					}
					catch(Exception e)
					{
						System.out.println("File Not Found");
					}
					
					break;
					
				case 4:
					//System.out.println("Enter File Name ");
					System.out.println("Saving File ---->>>>");
					
					AddressBookOperations.saveJsonFile(addressBookList, jsonFile);
					System.out.println("Saved File Successfully");
					
				case 6:
					System.out.println("Exiting....");
				
			}
			
		}while(choice!=6);
		
	}

}
