package com.bridgelabz.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;



public class JsonUtility 
{
	private static ObjectMapper mapper;
	
	static
	{
		mapper = new ObjectMapper();
		
	}
	
	public static void writeToJsonFile(List<com.bridgelabz.addressbook.AddressBook> addressBookList) throws JsonGenerationException, JsonMappingException, IOException
	{
		mapper.writeValue(new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/addressBook.json"), addressBookList);
		System.out.println("Wrote Successfully");
	}
	
	public static void prettyPrint(List<com.bridgelabz.addressbook.AddressBook> addressBookList, String fileName) throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
		writer.writeValue(new File("abc.json"), addressBookList);
//		mapper.writeValue(new File("abc.json"), addressBookList);
//		System.out.println("Wrote");
	}
	
}
