package com.bridgelabz.cliniquemanagement;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.Utility;

public class CliniqueMain 
{
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		ManageClinique manageClinique = new ManageClinique();
		int choice = 0;
		do 
		{
			System.out.println("1. Add New Doctor  ");
			System.out.println("2. Add Patient  ");
			System.out.println("3. Sort Doctors ");
			System.out.println("4. Sort Patients ");
			System.out.println("5. Exit  ");
			System.out.println("Enter Your Choice ");
			choice = Utility.scanInt();
			
			switch(choice)
			{
				case 1:
					manageClinique.addDoctorDetails();
					System.out.println("Doctor's Data has been successfully added ...!!!");
					break;
				case 2: 
					manageClinique.addPatatientDetails();
					System.out.println("Patient's Data has been successfully added ...!!!");
					break;
				case 3: 
					System.out.println("Searching Doctors ");
					manageClinique.searchDoctors();
					break;
				case 4: 
					manageClinique.searchPatients();
					
					break;
				case 5:
					System.out.println("Exiting.....");
					break;
			}
			
			
		}while(choice<4);
	}
}
