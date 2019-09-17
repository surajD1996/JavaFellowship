package com.bridgelabz.cliniquemanagement;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public interface IClinique 
{
	void addDoctorDetails() throws JsonGenerationException, JsonMappingException, IOException;
	void addPatatientDetails() throws JsonGenerationException, JsonMappingException, IOException;
	//void getAppointment();
	//void printReport();
	
}
