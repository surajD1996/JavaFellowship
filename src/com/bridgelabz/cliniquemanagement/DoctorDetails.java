package com.bridgelabz.cliniquemanagement;

import com.bridgelabz.utility.Utility;

public class DoctorDetails 
{
	private String doctorName;
	private int doctorID;
	private String specialization;
	private String availability;
	
	public String getDoctorName() 
	{
		return doctorName;
	}
	
	public void setDoctorName() 
	{
		System.out.println("Enter The Name of Doctor");
		this.doctorName = Utility.scanString();
	}
	
	public int getDoctorID() 
	{
		return doctorID;
	}
	
	public void setDoctorID() 
	{
		System.out.println("Enter The ID of Doctor");
		this.doctorID = Utility.scanInt();
	}
	
	public String getSpecialization() 
	{
		return specialization;
	}
	
	public void setSpecialization() 
	{
		System.out.println("Enter Specialization of Doctor ");
		this.specialization = Utility.scanString();
	}
	
	public String getAvailability() 
	{
		return availability;
	}
	
	public void setAvailability() 
	{
		System.out.println("Enter Availability of Doctor");
		this.availability = Utility.scanString();
	}

	@Override
	public String toString() 
	{
		return "DoctorDetails [doctorName=" + doctorName + ", doctorID=" + doctorID + ", specialization="
				+ specialization + ", availability=" + availability + "]";
	}
	
	public void setDoctorDetails()
	{
		setDoctorName();
		setDoctorID();
		setSpecialization();
		setAvailability();
	}
	
}




















