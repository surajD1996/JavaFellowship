package com.bridgelabz.cliniquemanagement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import com.bridgelabz.objectorientation.InventryNew;





public class CliniqueUtility 
{
	private static ObjectMapper mapper;
	
	static
	{
		mapper = new ObjectMapper();
		
	}
	
	public static void writeToJsonFile(List<com.bridgelabz.addressbook.AddressBook> addressBookList) throws JsonGenerationException, JsonMappingException, IOException
	{
		mapper.writeValue(new File(""), addressBookList);
		System.out.println("Wrote Successfully");
	}
	
	public static <T> void prettyPrint(List<InventryNew> inventryList, File inventryFile) throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
		writer.writeValue((inventryFile), inventryList);
	}
}