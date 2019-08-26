/******************************************************************************
 *  Purpose	 	contains the logic of all the programs
 *  @author  	Suraj
 *  @version 	1.0
 *  @since   	21-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.utility;
import java.util.Arrays;
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
	 * @param input	number of coupons
	 * @return	randomCount this number of times we need to generate the random numbers
	 */
	public static int couponNumbers(int input) 
	{
		int randomCount = 0;
		boolean isCouponAvailable[] = new boolean[input];
		int randomNumber = 0;
		int count = 0;
		while(count!=input)
		{
			randomCount++;
			randomNumber = (int) (Math.random()*input);
			if(isCouponAvailable[randomNumber]==false)
			{
				count++;
				isCouponAvailable[randomNumber] = true;
			}	
		}
		return randomCount;
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
	
	/**
	 * purpose 	gives the percentage of win of a person in gambling
	 * @param stake
	 * @param goal
	 * @param trails
	 */
	public static void GamblingSimulator(int stake, int goal, int trails)
	{
		int temp = 0;
		double compare;
		double percentage;
		int win = 0, choice;
		
		
		Random random = new Random();
		while((stake!=0)&&(goal!=stake)&&(temp!=trails))
		{				
			System.out.println("Enter Your choice Either 0 or 1");
			choice = Utility.scanInt();
			//compare = Math.random();
			compare =  0 + (int)random.nextInt(2);
			System.out.println("Compare = "+(int)compare);
			if(choice == compare)
			{
				stake++;
				System.out.println("stake = "+(int)stake);
				win++;
			}
			else
			{
				goal = goal=2;
			}
			temp++;		
		}
		System.out.println("Number of wins = "+win);
		percentage = 100*win/trails;
		System.out.println("Win Percentage = "+percentage);
	}
	
	/**
	 * purpose				to search the input integer in the sorted array
	 * @param  array		input array in which we need to search for the element
	 * @param  inputNumber	input number to be searched in array
	 * @return position 	position of the input number
	 */
	public static int binarySearchIntegers(int[] array, int inputNumber) 
	{
		int position = 0;
		array = bubbleSort(array);
		int lowerIndex = 0;
		int higherIndex = array.length-1;
		int middleIndex = (array.length-1)/2;
		while(lowerIndex<higherIndex)
		{
			if(inputNumber == array[middleIndex])
			{
				position = middleIndex;
				break;
			}
			else if(inputNumber<array[middleIndex])
			{
				higherIndex = middleIndex -1;
			}
			else
			{
				lowerIndex = middleIndex + 1;
			}
			middleIndex = (higherIndex+lowerIndex)/2;
		}
		return position;
		
	}
	
	
	public static int notes[] = {1000,500,100,50,20,10,5};
	public static int noteCount[] = new int[7];
	
	/**
	 * Purpose 	calculates minimum number of Notes and the 
	 * 			Notes to be returned by the Vending Machine
	 * @param amount	the amount of which we need to find 
	 * 					minimum number of notes
	 */
	public static void vendingMachine(int amount) 
       {
                            
			
            if(amount >= 1000)
            {
            	noteCount[0]++;
            	amount = amount - 1000;
            	//System.out.println("1000");
            	vendingMachine(amount);
            }
            else if((amount<1000)&&(amount>=500))
            {
            	noteCount[1]++;
            	amount = amount - 500;
            	vendingMachine(amount);
            	//System.out.println("500");
            }
            else if((amount<500)&&(amount>=100))
            {
            	noteCount[2]++;
            	amount = amount - 100;
            	vendingMachine(amount);
            	//System.out.println("100");
            }
            else if((amount<100)&&(amount>=50))
            {
            	noteCount[3]++;
            	amount = amount - 50;
            	vendingMachine(amount);
            	//System.out.println("100");
            }
            else if((amount<50)&&(amount>=20))
            {
            	noteCount[4]++;
            	amount = amount - 20;
            	vendingMachine(amount);
            	//System.out.println("100");
            }
            else if((amount<20)&&(amount>=10))
            {
            	noteCount[5]++;
            	amount = amount - 10;
            	vendingMachine(amount);
            	//System.out.println("100");
            }
            else if((amount<10)&&(amount>=5))
            {
            	noteCount[6]++;
            	amount = amount - 5;
            	vendingMachine(amount);
            	//System.out.println("100");
            }          
       }
		
	/**
	 * Purpose 	Converts the decimal number into binary
	 * @param 	decimalNumber	input decimal number
	 * @return	reverse			binary number of input decimal number
	 */
	public static String binaryConversion(int decimalNumber) 
	{
		int temporary = decimalNumber;
		int bit=0;
		String reverse="0";
		String binaryNumber = "0";
		while(temporary!=0)
		{
			bit = temporary%2;
			temporary = temporary/2;
			binaryNumber = binaryNumber+bit;
			
		}
		int cnt=0;
		int length = binaryNumber.length();
		
		for(cnt=length-1;cnt>0;cnt--)
		{
			reverse=reverse+binaryNumber.charAt(cnt);
			
		}
		
		return reverse;
	}
	
	
	/**
	 * Purpose 	finds the day of the week 
	 * @param month	input month 
	 * @param date	input date
	 * @param year
	 * @return
	 */
	public static int dayOfWeek(int month, int date, int year) {
		if(month>12||date>31)
		{
			return -1;
		}
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int day = (date + x + (31*m)/12) % 7;
        return day;
    }
	
	/**
	 * purpose 		Converts temperature from celcius to Fahrenit  
	 * @param 		celcius 					temperature to be converted
	 * @return		temperatureInFahrenheit 	gives converted temperature to fahrenite
	 */
	public static double temperatureToFahrenit(double celsius) 
	{
		double temperatureInFahrenheit = (celsius * (9/5)) + 32;
		return temperatureInFahrenheit;
	}
	
	
	/**
	 * purpose 		Converts temperature from celcius to Fahrenit
	 * @param 		fahrenite 				temperature to be converted
	 * @return		temperatureInCelsius	gives converted temperature to fahrenite
	 */
	public static float temperatureToCelsius(float fahrenite) 
	{
		float temperatureInCelsius = (fahrenite * (9/5)) + 32;
		return temperatureInCelsius;
	}

	/**
	 * Purpose 	Sort elements of array using bubble sort algorithm
	 * @param 	array		array of integers to be sorted
	 * @return	array		array of sorted integers	
	 */
	public static int[] bubbleSort(int[] array) {
		int i = 0, temp =0, pass = 0;
		for(pass=1;pass<array.length;pass++)
		{
			for(i=0;i<array.length-pass;i++)
			{
				if(array[i]>array[i+1])
				{
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		return array;
	}

	public static float monthlyPayment(int loanAmount, int years, int rate) 
	{
		return 0;
	}

	public static String[] sortString(String first[]) 
	{
		
		
		String temp;
		
		for(int pass = 1; pass<first.length;pass++)
		{
			for(int i=0;i<first.length-1;i++)
			{
				if(first[i].compareTo(first[i+1])>0)
				{
					temp = first[i];
					first[i] = first[i+1];
					first[i+1] = temp;
				}
			}
		}
				
		return first;
	}

	public static boolean anagramDetection(String first, String second) 
	{
		first = first.toLowerCase();
		second = second.toLowerCase();
		
		char firstArray[] = first.toCharArray();
		char secondArray[] = second.toCharArray();
		
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		boolean status = false;
		
		if(firstArray.length!=secondArray.length)
		{
			
			status = false;
		}
		else
		{
			
			if(Arrays.equals(firstArray,secondArray))
			{
				status = true;
			}
		}
		
		return status;
		
	}

	public static void binarySearchString(String inputString[], String word) 
	{
		inputString = sortString(inputString);
		int lowerIndex = 0;
		int higherIndex = inputString.length-1;
		int middleIndex = 0;
		
		int result =0;
		while(lowerIndex<higherIndex)
		{
			result = inputString[middleIndex].compareTo(word);
			if(result == 0)
			{
				System.out.println(middleIndex);
				break;
			}
			else if(result<0)
			{
				higherIndex = middleIndex -1;
			}
			else
			{
				lowerIndex = middleIndex + 1;
			}
			middleIndex = (higherIndex+lowerIndex)/2;
		}
	}
}
