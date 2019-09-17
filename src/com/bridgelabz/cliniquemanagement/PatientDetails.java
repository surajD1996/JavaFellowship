package com.bridgelabz.cliniquemanagement;

import com.bridgelabz.utility.Utility;

public class PatientDetails 
{
	private String patientName;
	private long patientContact;
	private int patientID;
	
	public String getPatientName() 
	{
		return patientName;
	}
	
	public void setPatientName() 
	{
		System.out.println("Enter The Name of Patient");
		this.patientName = Utility.scanString();
	}
	
	public long getPatientContact() 
	{
		return patientContact;
	}
	
	public void setPatientContact() 
	{
		System.out.println(" Enter Contact Number of Patient ");
		this.patientContact = Utility.scanLong();
	}
	
	public int getPatientID() 
	{
		return patientID;
	}
	
	public void setPatientID() 
	{
		System.out.println("Enter The Patient ID");
		this.patientID = Utility.scanInt();
	}

	@Override
	public String toString() 
	{
		return "PatientDetails [patientName=" + patientName + ", patientContact=" + patientContact + ", patientID="
				+ patientID + "]";
	}
	
	public void setDetails()
	{
		setPatientName();
		setPatientID();
		setPatientContact();
		
	}
	
}
