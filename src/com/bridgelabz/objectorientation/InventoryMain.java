package com.bridgelabz.objectorientation;

import java.io.File;

import java.io.IOException;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.Utility;

public class InventoryMain 
{

	public static void main(String[] args) 
	{
		
		//	JSON File
		String jsonFile ="/home/user/Suraj/Week1/JavaFellowship/jsonfiles/RiceWheat.json";
		ObjectMapper mapper = new ObjectMapper();	
		File file = new File(jsonFile);
		int choice = 0;
		String item ="";
		try 
		{
			
			JsonNode jsonNode = mapper.readTree(file);
		
			do 
			{
				
				System.out.println("Enter your choice");
				System.out.println("1. RICE");
				System.out.println("2. PULSES");
				System.out.println("3. WHEAT");
				
				choice = Utility.scanInt();
			
				
			
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
					String name = node.findPath("name").asText();
					System.out.println(name);
					int weight = node.findPath("weight").asInt();
					System.out.println(weight);
					int price = node.findPath("price").asInt();
					System.out.println(price);
					total = total + weight*price;
					System.out.println("Name\t:"+name+"\nPrice\t:"+price+"\nWeight\t:"+weight);
					System.out.println("TOTAL PRICE = "+(price*weight));
					System.out.println();
					System.out.println("TOTAL "+item+" PRICE = "+total);
					
				}
			}while (choice < 4 );
		}
		
		catch (IOException e) 
		{
			System.out.println("Error occured while Opening the file");
		}
		
	}
	
}