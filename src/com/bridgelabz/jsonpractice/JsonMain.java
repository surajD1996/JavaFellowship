package com.bridgelabz.jsonpractice;

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
	}
}
