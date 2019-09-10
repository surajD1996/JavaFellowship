package com.bridgelabz.objectorientation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.bridgelabz.utility.JSONUtil;

public class InventryDataManagement 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		File jsonFile = new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/Rice.json");
		Scanner readFile = new Scanner(jsonFile);
		String jsonData = readFile.nextLine();
		
		InventryWork info = JSONUtil.convertJsonToJava(jsonData, InventryWork.class);
		
		System.out.println(info.getName());
		System.out.println(info.getPrice());
		System.out.println(info.getWeight());
	}
}
