package com.bridgelabz.jsonpractice;

import java.io.File;
import java.io.IOException;

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
	
	public static String convertJavaToJson(Person person) throws JsonGenerationException, JsonMappingException, IOException
	{	
		String jsonData = mapper.writeValueAsString(person);
		return jsonData;
	}
	
	public static void writeToJsonFile(Person person) throws JsonGenerationException, JsonMappingException, IOException
	{
		mapper.writeValue(new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/jsonWriteValue.json"), person);
		System.out.println("Wrote Successfully");
	}
	
	public static void prettyPrint(Person person) throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
		writer.writeValue(new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/jsonWriteValue.json"), person);
	}
	

}
