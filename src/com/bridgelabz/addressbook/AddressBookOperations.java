package com.bridgelabz.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.Utility;

public class AddressBookOperations 
{
//	public void createJsonFile(Person person) throws IOException
//	{
//		System.out.println("Enter The File Name");
//		String fileName = Utility.scanString();
//		File file = new File(fileName+".json");
//		
//		if(file.createNewFile())
//		{
//			System.out.println("File Created Successfully");
//			
//			JsonUtility obj = new JsonUtility();
//			
//			JsonUtility.writeToJsonFile(person, file);
//		}
//		
//		else
//		{
//			System.out.println("Error");
//		}
//	}
	
	public void addPersonToFile(List<AddressBook> person) throws JsonGenerationException, JsonMappingException, IOException
	{
		JsonUtility.writeToJsonFile(person);
	}
	
	
	
	

}
