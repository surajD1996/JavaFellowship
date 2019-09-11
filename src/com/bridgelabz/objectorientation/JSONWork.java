package com.bridgelabz.objectorientation;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@SuppressWarnings("serial")
@JsonPropertyOrder(value = {
		"name",
		"empNumber",
		
})
public class JSONWork implements Serializable
{
	private int empNumber;
	private String name;
	@JsonIgnore
	private double salary;
	
	public int getEmpNumber() 
	{
		return empNumber;
	}
	
	public void setEmpNumber(int empNumber) 
	{
		this.empNumber = empNumber;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
}
