package com.bridgelabz.objectorientation;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryMain {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		// JSON FILE'S PATH
		String path ="/home/user/Suraj/Week1/JavaFellowship/jsonfiles/Rice";
		ObjectMapper mapper = new ObjectMapper();	
		File file = new File(path);
		int choice = 0;
		
		try 
		{
			JsonNode jsonNode = mapper.readTree(file);
			do 
			{
				System.out.println("Enter your choice");
				System.out.println("1. RICE");
				System.out.println("2. PULSES");
				System.out.println("3. WHEAT");
				try 
				{
					choice = scanner.nextInt();
				}
				catch (Exception e) 
				{
					System.out.println("Invalid input");
				}
			
			} while (choice > 3 || choice < 1);
			String item =""; // THE STRING WHICH HAS CHOICE DATA
			switch (choice)
			{
				case 1:
						item = "RICE";
						break;
				
				case 2:
						item = "PULSES";
						break;
				
				case 3:
						item = "WHEAT";
						break;	
				
						default:
						System.out.println("Invalid input");
			}
			JsonNode inventory = jsonNode.findPath(item);
			System.out.println("-----------"+item+"-------------");
			System.out.println();
			int total = 0;
			for(JsonNode node : inventory)
			{
			
				String name = node.findPath("Name").asText();
				int weight = node.findPath("Weight").asInt();
				int price = node.findPath("Price").asInt();
				total = total + weight*price;
				// System.out.println("Name\t:"+name+"\nPrice\t:"+price+"\nWeight\t:"+weight);
				//	System.out.println("TOTAL PRICE = "+(price*weight));
				//	System.out.println();
			}
			System.out.println("TOTAL "+item+" PRICE = "+total);
			System.out.println("----------------------------------");
		
		}
		
		catch (IOException e) 
		{
			System.out.println("Error occured while parsing");
		}
		
		finally
		{
			scanner.close();
		}
	}
}