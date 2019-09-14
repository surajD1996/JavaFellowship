package com.bridgelabz.addressbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class AddressBookDemoMain {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		
		
		File jsonFile = new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/addressBook.json");
		
		BufferedReader br = new BufferedReader(new FileReader(jsonFile));
		
		String jsonData1 = br.readLine();
		
		String tempString = "";
		
		while(jsonData1!=null)
		{
			tempString = tempString + jsonData1 +" ";
			jsonData1 = br.readLine();
		}
		//System.out.println(tempString);
		
		
		ObjectMapper mapper = new ObjectMapper();
		//String jsonData = "";
		
		
		
		 //Person person = mapper.readValue(jsonData, Person.class);
		
		//List <AddressBook> list = new HashMap<AddressBook>();
		
		List <AddressBook> list = mapper.readValue(tempString, new TypeReference<List<AddressBook>>() {});
		
		 list.add(mapper.readValue(tempString, AddressBook.class));
		 
		 //list.get(1);
		 
//		 Person person = addressBook.getPerson();
//		 System.out.println(person.getContactNumber());

	}

}
