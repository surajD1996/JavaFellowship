package com.bridgelabz.jsonpractice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import com.bridgelabz.objectorientation.addressbook.AddressBook;

import java.io.FileOutputStream;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;




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
	
	public static void writeToJsonFile(AddressBook person) throws JsonGenerationException, JsonMappingException, IOException
	{
		mapper.writeValue(new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/addressBook.json"), person);
		System.out.println("Wrote Successfully");
	}
	
	public static void prettyPrint(List<AddressBook> persons) throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
		writer.writeValue(new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/addressBook.json"), persons);
	}

	
	public static <T> T readValueJsonObject(String jsonPath, Class<T> cls) throws JsonParseException, JsonMappingException, IOException
	{
		
		T person = null;
		try 
		{
			person = mapper.readValue(jsonPath, cls);
		}
		catch(JsonParseException e)
		{
			System.out.println("Exception Occured While Converting JSON object to Java"+e.getMessage());
		}
		catch (JsonMappingException e)
		{
			System.out.println("Exception Occured While Converting JSON object to Java"+e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("Exception Occured While Converting JSON object to Java"+e.getMessage());
		}
		return person;
	}
	
		
	
}

