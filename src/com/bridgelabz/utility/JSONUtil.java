package com.bridgelabz.utility;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class JSONUtil 
{
	private static ObjectMapper mapper;
	
	static
	{
		mapper = new ObjectMapper();
	}
	
	public static String convertJavaToJSON(Object object) 
	{
		String JSONResult = "";
		try 
		{
			JSONResult = mapper.writeValueAsString(object);
		}
		catch (JsonGenerationException e)
		{
			System.out.println("Exception Occured While Converting java object to JSON"+e.getMessage());
		}
		catch (JsonMappingException e)
		{
			System.out.println("Exception Occured While Converting java object to JSON"+e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("Exception Occured While Converting java object to JSON"+e.getMessage());
		}
		return JSONResult;
	}
	
	public static <T> T convertJsonToJava(String jsonString, Class<T> cls)
	{
		T result = null;
		try 
		{
			result = mapper.readValue(jsonString, cls);
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
		
		return result;
	}
	
}






