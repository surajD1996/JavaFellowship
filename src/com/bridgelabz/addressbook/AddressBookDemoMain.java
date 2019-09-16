package com.bridgelabz.addressbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonGenerator;
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
		//System.out.println(list);
//		for(int i = 0; i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		//System.out.println(list.get(0).person.getAddress());
	//	long per = list.get(1).person.getContactNumber();
	//	System.out.println(per);
		//Address strr = list.get(0).person.getAddress();
	//	String s = strr.getState();
		 System.out.println(s);
		 //list.get(1);
		 
//		 Person person1 = new Person();
//		 person1.setFirstName();
//		 person1.setLastName();
//		 person1.setContactNumber();
//		 
//		 Address address1 = new Address();
//		 address1.setState();
//		 address1.setCity();
//		 address1.setPinCode();
//		 
//		 person1.setAddress(address1);
//		 
//		 Person person2 = new Person();
//		 person2.setFirstName();
//		 person2.setLastName();
//		 person2.setContactNumber();
//		 
//		 Address address2 = new Address();
//		 address2.setState();
//		 address2.setCity();
//		 address2.setPinCode();
//		 
//		 person2.setAddress(address2);
//		 
//		 Person person3 = new Person();
//		 person3.setFirstName();
//		 person3.setLastName();
//		 person3.setContactNumber();
//		 
//		 Address address3 = new Address();
//		 address3.setState();
//		 address3.setCity();
//		 address3.setPinCode();
//		 
//		 person3.setAddress(address3);
		 
//		 Person person = addressBook.getPerson();
//		 System.out.println(person.getContactNumber());
		 
//		 try {
//		        JsonGenerator g = mapper.getJsonFactory().createJsonGenerator(new FileOutputStream(jsonFile));
//
//		        mapper.writeValue(g, person1);
//		        mapper.writeValue(g, person2);
//		        mapper.writeValue(g, person3);
//		        g.close();
//		    } catch (IOException e) {
//		        e.printStackTrace();
//		    }
		 
		 
		 
		 
		 
		 

	}

}
