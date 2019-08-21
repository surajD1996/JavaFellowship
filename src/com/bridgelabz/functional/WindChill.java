/******************************************************************************
 *  Purpose: Calculates Effective Temperature 
 *  @author  Suraj Warbhuvan
 *  @version 1.0
 *  @since   21-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill 
{
	public static void main(String arg[])
	{
		double temperature = Double.parseDouble(arg[0]);
		double speed = Double.parseDouble(arg[1]);
		
		double effectiveTemperature = Utility.windChill(temperature, speed);
		
		if(effectiveTemperature==0)
		{
			System.out.println("Note : the formula is not valid if temperature is larger than 50 in absolute value or if speed is larger than 120 or less than 3");
		}
		else 
		{
			System.out.println("Effective Temperature is "+effectiveTemperature);
		}
		
	}
}
