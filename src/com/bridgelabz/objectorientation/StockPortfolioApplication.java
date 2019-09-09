package com.bridgelabz.objectorientation;




import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

/*
* The main function is written to take input from the user and
* calls various methods that manages the stocks
*/
public class StockPortfolioApplication 
{
	
	public static void main(String[] args) throws IOException
	{
		String jsonStackFile = "/home/user/Suraj/Week1/JavaFellowship/jsonfiles/stock.json";
		ObjectMapper mapper = new ObjectMapper();
		File file = new File(jsonStackFile);
		
		try
		{
			JsonNode jsonNode = mapper.readTree(file);
			
			int totalStockPrice = 0;
			JsonNode mainNode = jsonNode.findPath("Stocks");
			for(JsonNode node : mainNode)
			{
				String stockName = node.findPath("Stock_Name").asText();
				System.out.print("Stock name = "+stockName+"\t");
				
				int numberOfStocks = node.findPath("Shares").asInt();
				System.out.print("Number of shares = "+numberOfStocks+"\t");
				
				int price = node.findPath("Share_Price").asInt();
				System.out.print("Price of each Stock = "+price);
				
				
				System.out.println(" Price of "+numberOfStocks+" is "+(price*numberOfStocks));
				
				System.out.println("");
				
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Error while reading the file");
		}
		
	}
}