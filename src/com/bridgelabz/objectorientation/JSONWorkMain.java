package com.bridgelabz.objectorientation;


import java.io.File;

import java.io.FileWriter;
import java.io.IOException;


import com.bridgelabz.utility.JSONUtil;



public class JSONWorkMain 
{

	public static void main(String[] args) throws IOException 
	{
//		System.out.println("Enter The Number Of Employees");
//		int numberOfEmployees = Utility.scanInt();
//		JSONWork emp[] = new JSONWork[numberOfEmployees];
		
//		for(int i = 0; i<emp.length ; i++)
//		{
//			emp[i].setEmpNumber(10);
//			emp[i].setName("ABC");
//			emp[i].setSalary(5000);
//		}
		
//		Scanner scanValues = new Scanner(System.in);
//				
//		
//		
//		LinkedListX <JSONWork> list = new LinkedListX();
//		System.out.println("Enter The Number Of Employees");
//		int empCount = Utility.scanInt();
//		
//		for(int i = 0; i<empCount; i++)
//		{
//			JSONWork emp = new JSONWork();
//			System.out.println("Enter ID ");
//			int empID = Utility.scanInt();
//			
//			emp.setEmpNumber(empID);
//			System.out.println("Enter Name ");
//			String empName = scanValues.nextLine();
//			
//			emp.setName(empName);
//			System.out.println("Enter Salary ");
//			double empSal = Utility.scanDouble();
//			
//			emp.setSalary(empSal);
//			list.insert(emp);
//		}
//		
//		list.displayListNodes();
		
		JSONWork emp1 = new JSONWork();
		emp1.setEmpNumber(101);
		emp1.setName("Vaibhav");
		emp1.setSalary(5000000);
		String JSONEmp = JSONUtil.convertJavaToJSON(emp1);
		System.out.println(JSONEmp);
		
		File jsonFile = new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/employee.json"); 
		//FileReader readFile = new FileReader(jsonFile);
		
		FileWriter fw = new FileWriter(jsonFile,true);
		
//		Scanner readFile = new Scanner(jsonFile);
//		
//		String jsonData = readFile.nextLine();
//		
//		System.out.println(jsonData);
		
		fw.write(JSONEmp);
		fw.flush();
		
		JSONWork emp = JSONUtil.convertJsonToJava(JSONEmp, JSONWork.class);
		System.out.println(emp.getEmpNumber()+"  "+emp.getName()+"  "+emp.getSalary());
		
	}
}
