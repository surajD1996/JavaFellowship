package com.bridgelabz.jsonpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class JsonMain 
{
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		Address address = new Address("Mumbai","MH");
		Person person = new Person("Vaibhav", address);
		
		String jsonData = JsonUtility.convertJavaToJson(person);
		System.out.println(jsonData);
		
		JsonUtility.writeToJsonFile(person);
		
		JsonUtility.prettyPrint(person);
		
// Reading data from json file using readValue
//		NOT WORKING
//Exception Occured While Converting JSON object to JavaNo 
//suitable constructor found for type [simple type, class 
//com.bridgelabz.jsonpractice.Address]: can not instantiate 
//from JSON object (need to add/enable type information?)
		
		
//		
//		File jsonFile = new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/jsonWriteValue.json");
//		
//		BufferedReader br = new BufferedReader(new FileReader(jsonFile));
//		
//		String jsonData1 = br.readLine();
//		
//		String tempString = "";
//		
//		while(jsonData1!=null)
//		{
//			tempString = tempString + jsonData1 +" ";
//			jsonData1 = br.readLine();
//		}
//		
//		person = JsonUtility.readValueJsonObject(tempString, Person.class);
//		System.out.println(person.getPersonName());
//		System.out.println(person.getAddress());
//		
//		br.close();
//		
		
		
		
		
	}
}
