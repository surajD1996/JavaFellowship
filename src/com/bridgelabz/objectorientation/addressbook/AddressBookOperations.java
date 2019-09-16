package com.bridgelabz.objectorientation.addressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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

public class AddressBookOperations 
{
	static List<String> fileList = new ArrayList<String>();
	
	public static ObjectMapper objectMapper;
	static 
	{
		objectMapper = new ObjectMapper();
	}
	
	public static void createNewJsonFile() 
	{
		System.out.println("Enter New File Name ");
		String filePath = Utility.scanString()+".json";
		
		try
		{
			File jsonFile = new File(filePath);
			boolean status = jsonFile.createNewFile();
			
			if(status)
			{
				System.out.println("New File is Created. File Name = "+jsonFile);
			}
			else
			{
				System.out.println("File is already Present as "+jsonFile);
			}
			fileList.add(filePath);
			
			File listOfFiles = new File("/home/user/Suraj/Week1/JavaFellowship/abc.txt");
			FileWriter write = new FileWriter(listOfFiles, true);
			BufferedWriter br = new BufferedWriter(write);
			br.write(filePath+"\n");
			
			br.flush();
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Occured while Creating File");
		}
		
		
	}

	public static String openJsonFile() 
	{
		System.out.println("Enter File Name To Open ");
		String jsonFile = Utility.scanString();
		
		for(int i = 0; i<fileList.size(); i++)
		{
			String tempFileName = fileList.get(i);
			if(jsonFile.equals(tempFileName))
			{
				System.out.println(jsonFile+"Hiii");
				return jsonFile;
			}
		}
		System.out.println(jsonFile);
		return jsonFile;
	}
	
	public static void addJsonFile(List <AddressBook> addressBookList, String jsonFile) throws JsonGenerationException, JsonMappingException, IOException
	{
		System.out.println(addressBookList.toString());
		//System.out.println(jsonFile);
		File fileObject = new File("abc.json");
		System.out.println(fileObject.toString());
		System.out.println(fileObject.length()+" "+fileObject.list());
		if(fileObject.length() == 0)
		{
			PersonInformation personInformation = new PersonInformation();
			personInformation.setPersonInformation();
			System.out.println("You Entered ");
			System.out.println(personInformation.toString());
			AddressBook addressBook = new AddressBook();
			addressBook.setPerson(personInformation);
			addressBookList.add(addressBook);
			JsonUtility.prettyPrint(addressBookList, "abc.json");
		}
		
		else
		{
			List<AddressBook> oldAddressList = objectMapper.readValue(fileObject, new TypeReference<List<AddressBook>>() {});
			System.out.println(oldAddressList.get(0).getPerson().getFirstName());
//			System.out.println(oldAddressList.get(1).getPerson().getFirstName());
//			System.out.println(oldAddressList.get(2).getPerson().getFirstName());
			addressBookList.addAll(oldAddressList);
			PersonInformation personInformation = new PersonInformation();
			personInformation.setPersonInformation();
			
			System.out.println("You Entered ");
			System.out.println(personInformation.toString());
			AddressBook addressBook = new AddressBook();
			addressBook.setPerson(personInformation);
			
			System.out.println(addressBook.getPerson().getFirstName());
			
			addressBookList.add(addressBook);
			
			JsonUtility.prettyPrint(addressBookList, "abc.json");
		}
	}
	
	public static void saveJsonFile(List <AddressBook>addressBookList, String jsonFile) throws JsonGenerationException, JsonMappingException, IOException
	{
		JsonUtility.prettyPrint(addressBookList, "abc.json");
	}
	
	
}
