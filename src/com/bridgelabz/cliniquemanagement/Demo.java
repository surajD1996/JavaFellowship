package com.bridgelabz.cliniquemanagement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Demo {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		
		File jsonFile = new File("/home/user/Suraj/Week1/JavaFellowship/doctorDetails.json");
		ObjectMapper objectMapper = new ObjectMapper();
		
		List<DoctorDetails> doctorsList = new ArrayList<DoctorDetails>();
		
		
		doctorsList = objectMapper.readValue(jsonFile, new TypeReference<List<DoctorDetails>>() {});
		
		System.out.println(doctorsList.get(0).getDoctorName());
		
		

	}

}
