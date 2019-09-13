package com.bridgelabz.jsonpractice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class Demo 
{

	public static void main(String[] args) throws IOException 
	{
		File file1 = new File("/home/user/Suraj/Week1/JavaFellowship");
		File file2 = new File("/home/user/Suraj/Week1/JavaFellowship");
		List<File> fileList = new ArrayList<File>();
		System.out.println(fileList);
		createBook();
		
	}public static void createBook() throws IOException {
		System.out.println("Enter name of address book");
		String book = Utility.scanString();
		File file = new File(book + ".json");
		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File of that name already exists");
		}
	}
}

