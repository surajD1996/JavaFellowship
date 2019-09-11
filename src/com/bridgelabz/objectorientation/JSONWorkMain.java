package com.bridgelabz.objectorientation;


import java.io.File;

import java.io.FileWriter;
import java.io.IOException;


import com.bridgelabz.utility.JSONUtil;



public class JSONWorkMain 
{

	public static void main(String[] args) throws IOException 
	{

		
		JSONWork emp1 = new JSONWork();
		emp1.setEmpNumber(101);
		emp1.setName("Vaibhav");
		emp1.setSalary(5000000);
		
		JSONWork emp2 = new JSONWork();
		emp2.setEmpNumber(102);
		emp2.setName("Vaib");
		emp2.setSalary(5000);
		
		String JSONEmp = JSONUtil.convertJavaToJSON(emp1);
		System.out.println(JSONEmp);
		
		String JSONEmp1 = JSONUtil.convertJavaToJSON(emp2);
		System.out.println(JSONEmp1);
				
//		JSONWork emp = JSONUtil.convertJsonToJava(JSONEmp, JSONWork.class);
//		System.out.println(emp.getEmpNumber()+"  "+emp.getName()+"  "+emp.getSalary());
//		
//		JSONWork emp3 = JSONUtil.convertJsonToJava(JSONEmp1, JSONWork.class);
//		System.out.println(emp3.getEmpNumber()+"  "+emp3.getName()+"  "+emp3.getSalary());
		
		
		
	}
}
