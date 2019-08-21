/******************************************************************************
 *  Purpose	 	contains the logic of all the programs
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.utility;
import java.util.Random;
import java.util.Scanner;
public class Utility 
{
	static Scanner scanner = new Scanner(System.in);
	/**
	 * purpose 	scans input integer and returns
	 * @return	input 	scanned integer
	 */
	public static int scanInt() 
	{
		int input = scanner.nextInt();
		return input;
	}
	
	/**
	 * purpose 	scans input which is float and returns
	 * @return 	input 	scanned Float value
	 */
	public static float scanFloat()
	{
		float input = scanner.nextFloat();
		return input;
	}
	private static boolean scanBoolean() 
	{
		boolean input = scanner.hasNextBoolean();
		return input;
	}
	/**
	 * purpose 	to scan a string from user
	 * @return	inputString 	returns string entered by the user
	 */
	public static String scanString()
	{
		String inputString = scanner.nextLine();
		return inputString;
	}
	
	/**
	 * purpose 	scans input which is double and returns
	 * @return	input 	scanned value
	 */
	public static double scanDouble()
	{
		double input = scanner.nextDouble();
		return input;
	}
	
	
	
	/**
	 * purpose 	calculates the percentage of head when coin is tossed
	 * @param 	coinTossedArray
	 * @return	percentage of head
	 */
	public static float flipCoin(int coinTossedArray[]) 
	{
		float headPercentage = 0;
		
		int count = 0;
		
		for(count = 0;count < coinTossedArray.length;count++)
		{
			if(coinTossedArray[count]==0)
			{
				headPercentage++;
			}
		}
		
		headPercentage = (headPercentage/coinTossedArray.length)*100;
		
		return headPercentage;
	}
	
	/**
	 * purpose 	tells us the input year is leap year or not
	 * @param 	year input year
	 * return 	returns true if year is leap year else false	
	 */
	public static boolean leapYear(int year)
	{		
		if(year<=1582)
		{			
			return false;
		}
		if((year%400)==0)
		{			
			return true;
		}
		else if((year%100)==0)
		{			
			return false;
		}
		else if((year%4)==0)
		{			
			return true;
		}
		else
		{			
			return false;
		}
	}

	/**
	 * purpose 	calculates power of 2 up to input 
	 * @param power	 till we want to calculate the power of 2
	 */
	public static void powerOf2(int power) 
	{

		int count = 0;
		int temporary = 0;
		int answer = 0;
		
		for(count = 1;count<=power;count++)
		{
			temporary = count;
			answer = 1;
			
			while(temporary != 0)
			{
				answer = answer * 2;
				temporary--;
			}
			System.out.println(count+" = "+answer);
		}
	}

	
	/**
	 * purpose calculate the harmonic number
	 * @param endPoint	value till we want to calculate harmonic number
	 * @return	answer that is harmonic number
	 */
	public static float harmonicNumber(double endPoint) 
	{
		float answer = 0;
		float count = 0;
		
		for(count = 1;count<=endPoint;count++)
		{
			answer = answer + (1/count);
		}
		
		return answer;
	}
	
	/**
	 * purpose 	 to check the input number is prime or not
	 * @param 	 number 	input which need to check, is prime or not
	 * 
	 */
	public static boolean checkPrime(int number)
	{
		int count = 0;
		for(count = 2;count < number;count++)
		{
			if((number%count)==0)
			{
				break;
			}
		}
		if(count==number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	/**
	 * purpose 	finds the prime factors of the input number
	 * @param  	inputNumber 	number of which, need to find the prime factors
	 */
	public static void primeFactors(int inputNumber) 
	{
		int count = 0;
		boolean check = false;
		for(count = 3;count < inputNumber/2;count++)
		{
			if(inputNumber%2==0)
			{
				System.out.println("2");
			}
			//System.out.println(count);
			if((inputNumber%count)==0)
			{
				//System.out.println(count);
				check = checkPrime(count);
				if(check == true)
				{
					System.out.println(count);
				}
			}			
		}		
	}

	/**
	 * purpose 	to replace a word in a string
	 * @param 	defaultString	a default string in which we need to replace one word
	 * @param 	inputString		input name provided
	 */
	public static void replaceString(String defaultString, String inputString) 
	{
		if(inputString.length()<2)
		{
			System.out.println();
		}
		else
		{
			String defaultArray[] = defaultString.split("\\s");
			
			for(int i=0;i<defaultArray.length;i++)
			{
				
				if(i == 1)
				{
					defaultArray[i] = inputString;
				}
				System.out.print(" "+defaultArray[i]);
			}
			
			
		}
			
		
	}

	/**
	 * purpose 		to generate distinct coupon numbers
	 * @param input	the count of coupon numbers 
	 * @return		array of the coupon numbers
	 */
	public static int[] couponNumbers(int input) 
	{
		Random random = new Random();	
		int couponNumbers[] = new int[input];
		couponNumbers[0] = 111 + (int)random.nextInt(1000);
		int iCnt=0;
		for(int count = 0;count < input; count++)
		{
			int temporary = 100 + (int)random.nextInt(900);
			for(int j = 0;j<input;j++)
			{
				if(temporary==couponNumbers[j])
				{
					break;
				}
				else
				{
					iCnt++;
					couponNumbers[count] = temporary;
				}
			}
		}
		System.out.println(iCnt);
		return couponNumbers;
	}

	/**
	 * purpose 	 to scan the 2D array of integers
	 * @param 	 rowCount		number of rows
	 * @param 	 columnCount	number of columns
	 * @return	 arrayOfIntegers returns the array of integers 	
	 */
	public static int[][] arrayOfIntegers(int rowCount, int columnCount) 
	{
		int arrayOfIntegers[][]=new int[rowCount][columnCount];
		
		for(int i = 0;i<arrayOfIntegers.length;i++)
		{
			for(int j = 0;j<arrayOfIntegers[i].length;j++)
			{	
				
				arrayOfIntegers[i][j] = scanInt();
			}
		}
		return arrayOfIntegers;
	}

	/**
	 * purpose 	
	 * @param rowCount
	 * @param columnCount
	 * @return
	 */
	public static double[][] arrayOfDoubles(int rowCount, int columnCount) 
	{
		double arrayOfDoubles[][]=new double[rowCount][columnCount];
		for(int i = 0;i<arrayOfDoubles.length-1;i++)
		{
			for(int j = 0;j<arrayOfDoubles[i].length-1;j++)
			{	
				System.out.println();
				arrayOfDoubles[i][j] = scanDouble();
			}
		}
		return arrayOfDoubles;
		
	}

	/**
	 * @param array
	 */
	public static void addThreeInts(int[] array) 
	{
		int temp1, temp2;
		for(int i = 0;i<array.length;i++)
		{
			temp1 = array[i];
			for(int j = i+1;j<array.length;j++)
			{
				temp2 = array[j];
				for(int k = j+1;k<array.length;k++)
				{
					if(array[k]+temp1+temp2==0)
					{
						System.out.println(temp1+" "+temp2+" "+array[k]);
					}
				}
			}
		}
	}
	
	/**
	 * @param number
	 * @return
	 */
	public static boolean checkPallindrome(int number) 
	{
		int digit = 0;
		int reverse = 0;
		int temp = number;
		while(temp!=0)
		{
			digit = temp%10;
			temp = temp/10;
			reverse = reverse * 10 + digit;
		}	
		System.out.println(reverse);
		if(reverse == number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * @param lowerLimit
	 * @param upperLimit
	 */
	public static void primeRange(int lowerLimit, int upperLimit) 
	{
		for(int i = lowerLimit;i<=upperLimit;i++)
		{
			boolean temp = checkPrime(i);
			if(temp == true)
			{
				System.out.println(i+" is prime number");
				boolean temp2 = checkPallindrome(i);
				if(temp2 == true)
				{
					System.out.println(i+" is pallindrome number");
				}
			}
		}
	}
	
	/**
	 * Purpose calculates  	euclidean distance between two points
	 * @param  firstNumber	point of which we need to find euclidean distance
	 * @param  secondNumber	point of which we need to find euclidean distance
	 * @return result		euclidean distance between two points
	 */
	public static double euclideanDistance(int firstNumber, int secondNumber)
	{
		double result = 0;
		
		result = Math.sqrt(Math.pow(firstNumber,2)+Math.pow(secondNumber,2));
		
		return result;
	}
	/**
	 * Purpose 	find the roots of the quadratic equation
	 * @param 	value1	value of 'a' in Quadratic Equation	
	 * @param 	value2	value of 'b' in Quadratic Equation
	 * @param 	value3	value of 'c' in Quadratic Equation
	 */
	public static void quadratic(double value1, double value2, double value3)
	{
		double root1, root2;
		
		
		double delta = Math.pow(value2,2) - 4 * value1 * value3;
		if(delta > 0)
		{
			System.out.println("Value of Determinant is "+delta+"i.e. greater than 0");
			root1  = (-value2 + Math.sqrt(delta))/(2*value1);
			root2  = (-value2 - Math.sqrt(delta))/(2*value1);
			System.out.println("Root 1 is "+root1);
			System.out.println("Root 2 is "+root2);
		}
		//if delta is ==0
		else if(delta==0)
		{
			System.out.println("Value of Determinant is "+delta+"i.e. equal to 0");
			root1 = root2 = -value2 / (2 * value1);
			System.out.println("Root 1 is "+root1);
			System.out.println("Root 2 is "+root2);
            
		}
		//if delta is <0
		else 
		{
			System.out.println("Value of Determinant is "+delta+"i.e. less than 0");
			root1 = -value2/(2*value1);
			root2 = (Math.sqrt(delta))/(2*value1);
			System.out.println("Root 1 is "+root1);
			System.out.println("Root 2 is "+root2);
		}
	}
	
	/**
	 * purpose:	Calculates the effective temperature  
	 * @param temperature		temperature which should less than 50
	 * @param speed				speed which should be between 3 and 120
	 * @return					effectiveTemperature 
	 */
	public static double windChill(double temperature, double speed) 
	{
		if((temperature > 50) && (( speed < 3) || ( speed > 120)))
		{
			return 0;
		}
		double effectiveTemperature = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * (Math.pow(speed,0.16)); 
		return effectiveTemperature;
	}
}
