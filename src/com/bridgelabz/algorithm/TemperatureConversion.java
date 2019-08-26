/******************************************************************************
 *  Purpose	 	converts temperature from celcius to fahrenheit or vice versa
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	23-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion 
{

	public static void main(String[] args) 
	{
		System.out.println("1. Convert from Celsius to Fahrenheit ");
		System.out.println("2. Convert from Fahrenheit to Celsius ");
		int choice=Utility.scanInt();
		
		//String input = Utility.scanString();
		
		
		
		switch(choice)
		{
			case 1:
				System.out.println("enter your celsius value: ");
				double celsius = Utility.scanDouble();
				double temperatureInFahrenheit = Utility.temperatureToFahrenit(celsius); 
				System.out.println("Temperater in Fahrenheit is "+ temperatureInFahrenheit);
				break;
			case 2:
				System.out.println("enter your fahrenhite value: ");
				float fahrenhite = Utility.scanFloat();
				float temperatureInCelsius = Utility.temperatureToCelsius(fahrenhite);
				System.out.println("Temperater in Fahrenheit is "+ temperatureInCelsius);
				break;
			default : 
				System.out.println("Invalid Input");

		}

	}
}
