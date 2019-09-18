package com.bridgelabz.cliniquemanagement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Utility;



public class ManageClinique implements IClinique 
{
	ObjectMapper objectMapper = new ObjectMapper();
	
	List<DoctorDetails> doctorsList = new ArrayList<DoctorDetails>();
	
	List<PatientDetails> patientsList = new ArrayList<PatientDetails>();
	
	
	@Override
	public void addDoctorDetails() throws JsonGenerationException, JsonMappingException, IOException
	{
		File doctorDetails = new File("doctorDetails.json");
		
		if(doctorDetails.length() == 0)
		{
			DoctorDetails doctorObject = new DoctorDetails();
			doctorObject.setDoctorDetails();
			doctorsList.add(doctorObject);
			CliniqueUtility.prettyPrint(doctorsList, "doctorDetails.json");
		}
		else
		{
			List<DoctorDetails> tempDoctorsList = objectMapper.readValue(doctorDetails,new TypeReference<List<DoctorDetails>>() {});
			doctorsList.addAll(tempDoctorsList);
			DoctorDetails doctorObject = new DoctorDetails();
			doctorObject.setDoctorDetails();
			doctorsList.add(doctorObject);
			CliniqueUtility.prettyPrint(doctorsList, "doctorDetails.json");
		}
	}

	@Override
	public void addPatatientDetails() throws JsonGenerationException, JsonMappingException, IOException 
	{
		File patientDetails = new File("patientDetails.json");
		
		if(patientDetails.length() == 0)
		{
			try 
			{
				PatientDetails patientObject = new PatientDetails();
				patientObject.setDetails();
				patientsList.add(patientObject);
				CliniqueUtility.prettyPrint(patientsList, "patientDetails.json");
			} 
			catch (Exception e) 
			{
				System.out.println(" NO ");
				e.printStackTrace();
			}
		}
		else
		{
			List <PatientDetails> tempPatientsList = objectMapper.readValue(patientDetails, new TypeReference<List<PatientDetails>>() {});
			patientsList.addAll(tempPatientsList);
			PatientDetails patientObject = new PatientDetails();
			patientObject.setDetails();
			patientsList.add(patientObject);
			CliniqueUtility.prettyPrint(patientsList, "patientDetails.json");
		}
	}

	public void searchDoctors() throws JsonParseException, JsonMappingException, IOException 
	{
		int choice = 0;
		System.out.println("1. Search by Name ");
		System.out.println("2. Search by Specialization ");
		System.out.println("3. Search by Availability ");
		System.out.println("Enter Your Choice >>>>");
		choice = Utility.scanInt();
		switch(choice)
		{
			case 1:
				System.out.println("Searching By Name ");
				searchDoctorByName();
				break;
			case 2:
				System.out.println("Searching By Specialization ");
				searchDoctorBySpecialization();
				break;
			case 3:
				System.out.println("Searching By Availability ");
				
				searchDoctorByAvailability();
				break;
			default:
				System.out.println("Enter Valid Choice");
		}
		
	}
	
	private void searchDoctorByAvailability() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("Enter The Availablity ");
		System.out.println("AM or PM ");
		String doctorAvailability = Utility.scanString();
		File doctorDetails = new File("doctorsDetails.json");
		List<DoctorDetails> doctorList = objectMapper.readValue(doctorDetails, new TypeReference<List<DoctorDetails>>() {});
		boolean status = false;
		
		for(DoctorDetails tempList : doctorList)
		{
			if(tempList.getAvailability().equalsIgnoreCase(doctorAvailability))
			{
				status = true;
				break;
			}
		}
		
		if(status == true)
		{
			System.out.println("Doctor is available");
		}
		else
		{
			System.out.println("Doctor is not available");
		}
	}

	private void searchDoctorBySpecialization() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("Enter Specialization of Doctor to be Searched ");
		String doctorSpecialization = Utility.scanString();
		File doctorDetails = new File("doctorDetails.json");
		List<DoctorDetails> doctorsList = objectMapper.readValue(doctorDetails, new TypeReference<List<DoctorDetails>>(){});
		boolean status = false;
		
			//if(doctorName.equalsIgnoreCase(doctorList.))
			for(DoctorDetails tempList : doctorsList)
			{
				if(tempList.getSpecialization().equalsIgnoreCase(doctorSpecialization))
				{
					status = true;
					//System.out.println(" Doctor is Available ");
					break;
				}
//				else
//				{
//					status = false;
//					//System.out.println(" Doctor is Not Available ");
//				}
			}
			if(status)
			{
				System.out.println("Doctor is available");
			}
			else
			{
				System.out.println(" Doctor is Not Available ");
			}
		
	}

	private void searchDoctorByName() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("Enter Name of Doctor to be Searched ");
		String doctorName = Utility.scanString();
		File doctorDetails = new File("doctorDetails.json");
		List<DoctorDetails> doctorsList = objectMapper.readValue(doctorDetails, new TypeReference<List<DoctorDetails>>(){});
		boolean status = false;
		
			//if(doctorName.equalsIgnoreCase(doctorList.))
			for(DoctorDetails tempList : doctorsList)
			{
				if(tempList.getDoctorName().equalsIgnoreCase(doctorName))
				{
					status = true;
					//System.out.println(" Doctor is Available ");
					break;
				}
//				else
//				{
//					status = false;
//					//System.out.println(" Doctor is Not Available ");
//				}
			}
			if(status)
			{
				System.out.println("Doctor is available");
			}
			else
			{
				System.out.println(" Doctor is Not Available ");
			}
	}

	public void searchPatients() throws JsonParseException, JsonMappingException, IOException
	{
		int choice = 0;
		System.out.println("1. Search by Name ");
		System.out.println("2. Search by Contact Number ");
		System.out.println("3. ID ");
		System.out.println("Enter Your Choice >>>>");
		
		switch(choice)
		{
			case 1:
				System.out.println("Searching Patient by Name");
				searchPatientByName();
				break;
			case 2:
				searchPatientByContact();
				break;
			case 3:
				searchPatientByID();
				break;
			default:
				System.out.println("Enter Valid Choice");
		}		
		
	}

	private void searchPatientByID() 
	{
		
	}

	private void searchPatientByContact() 
	{
			
	}

	private void searchPatientByName() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("Enter Name of Patient >>>>>>");
		String searchPatientName = Utility.scanString();
		File patientsDetails = new File("searchPatientName.json");
		List<PatientDetails> tempPatientList = objectMapper.readValue(patientsDetails, new TypeReference<List<PatientDetails>>() {});
		boolean status = false;
		for(PatientDetails tempList: tempPatientList)
		{
			if(tempList.getPatientName().equalsIgnoreCase(searchPatientName))
			{
				status = true;
				break;
			}
		}
		
		if(status == true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}

















