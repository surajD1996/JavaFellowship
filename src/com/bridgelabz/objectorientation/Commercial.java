package com.bridgelabz.objectorientation;
//
import java.util.List;

import java.io.File;

import java.io.IOException;
//
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
//
import com.bridgelabz.utility.CommercialUtility;

import com.bridgelabz.utility.Utility;
//
//public class CommercialMain 
//{
//
//	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
//	{
//		Person person = new Person();
//		Company company = new Company();
//		
//		ObjectMapper mapper = new ObjectMapper();
//		
//		File personJson = new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/person.json");
//		File companyJson = new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/company.json");
//		
////		BufferedReader br = new BufferedReader(new FileReader(personJson));
////		String str1 = br.readLine();
////		System.out.println(str1);
////		
////		List<Person> personList = mapper.readValue(str1, new TypeReference<List<Person>>() 
////		{
////		});
//		
//		
//		List<Person> personList = mapper.readValue(personJson, new TypeReference<List<Person>>() 
//		{
//		});
//		
//		List<Company> companyList = mapper.readValue(companyJson, new TypeReference<List<Company>>() 
//		{
//		});
//		
////		Person p = JSONUtil.convertJsonToJava(personJson, Person.class);
////		System.out.println();
//		int choice = 0;
//		
//		do
//		{
//			System.out.println("1. Buy ");
//			System.out.println("2. Sell ");
//			System.out.println("3. Save File ");
//			System.out.println("4. Print Report ");
//			System.out.println("5. Exit ");
//			
////			choice = Utility.scanInt();
////			
////			System.out.println("Enter index");
////			int index = Utility.scanInt();
////			person = personList.get(index);
////			System.out.println(" " + person.toString());
//			
//			switch(choice)
//			{
//				case 1:	System.out.println("Enter The Index Number of Person");
//						int personIndex = Utility.scanInt();
//						person = personList.get(personIndex);
//						System.out.println(person.toString());
//						
//						System.out.println("Enter Index Number of Company");
//						int companyIndex = Utility.scanInt();
//						company = companyList.get(companyIndex);
//						System.out.println(company.toString());
//						
//						System.out.println("How Many Shares You Want To Buy");
//						int toBuy = Utility.scanInt();
//						
//						if(toBuy>Company.getShareQuantity())
//						{
//							System.out.println("Sorry ");
//						}
//						
//						else
//						{
//							int amount=CommercialUtility.buyShares(person.getBalance(), toBuy, company.getAmount());
//							int availableSharesInCompany=company.getShareQuantity();
//							availableSharesInCompany=availableSharesInCompany - toBuy;
//							person.setBalance(amount);
//
//							int availableShareInPerson=person.getShareQuantity();
//							availableShareInPerson=availableShareInPerson - toBuy;
//							person.setShareQuantity(availableShareInPerson);
//						}
//					
//			}
//			
//			
//		}while(choice!=5);
//		
//		Utility.writeObjectToJson(personList, "person.json");
//		System.out.println(personList);
//		
//		Utility.writeObjectToJson(companyList, "company.json");
//		System.out.println(companyList);
//		
//		
//	}
//
//}





public class Commercial {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		Person person = new Person();
		Company company= new Company();
		ObjectMapper mapper=new ObjectMapper();
		File personFile=new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/person.json");
		File companyFile=new File("/home/user/Suraj/Week1/JavaFellowship/jsonfiles/company.json");
		
		List<Person> personList=mapper.readValue(personFile, new TypeReference <List <Person> >(){ });
		
		List<Company> companyList=mapper.readValue(companyFile, new TypeReference <List <Company> >(){ });
		int choice=0;
		do
		{
			//System.out.println("Press \n1.Buy Share\n2.Sell Share\n3.Save File\n4.Print Report\n5.Exit");
			System.out.println("Press \n1.Buy Share\n2.Sell Share\n3.Print Report\n4.Exit");
			choice=Utility.scanInt();
			
			
			switch (choice)
			{
			case 1:
				System.out.println("Enter index of person");
				int indexPerson=Utility.scanInt();
				person=personList.get(indexPerson);
				System.out.println(person.toString());
				
				System.out.println("Enter index of company");
				int indexCompany=Utility.scanInt();
				company=companyList.get(indexCompany);
				System.out.println(company.toString());
				
				System.out.println("Enter how many share to buy : ");
				int numberOfShares=Utility.scanInt();	
				
				if(numberOfShares>company.getShareQuantity())
				{
					System.out.println("Sorry you cant buy shares");
				}
				else
				{
					//call buyshare method to buy share
					int amount=CommercialUtility.buyShares(person.getBalance(), numberOfShares, company.getAmount());
					int availableSharesInCompany=company.getShareQuantity();
					availableSharesInCompany=availableSharesInCompany-numberOfShares;
					person.setBalance(amount);
					
					int availableShareInPerson=person.getShareQuantity();
					availableShareInPerson=availableShareInPerson-numberOfShares;
					person.setShareQuantity(availableShareInPerson);	
					
				}
				break;
			case 2:
				System.out.println("Enter index of person");
				int indexPerson2=Utility.scanInt();
				person=personList.get(indexPerson2);
				System.out.println(person.toString());
				
				System.out.println("Enter index of company");
				int indexCompany2=Utility.scanInt();
				company=companyList.get(indexCompany2);
				System.out.println(company.toString());
				
				System.out.println("Enter how many share to sell : ");
				int numberOfShares2=Utility.scanInt();	
				if(numberOfShares2>company.getShareQuantity())
				{
					System.out.println("Sorry you cant buy shares");
				}
				else
				{
					//call sellshare method to buy share
//					int amount2=CommercialUtility.sellShares(person.getBalance(), numberOfShares2, company.getAmount());
//					int availableSharesInCompany=company.getShareQuantity();
//					availableSharesInCompany=availableSharesInCompany-numberOfShares2;
//					person.setBalance(amount2);
//					
//					int availableShareInPerson=person.getShareQuantity();
//					availableShareInPerson=availableShareInPerson+numberOfShares2;
//					person.setShareQuantity(availableShareInPerson);	
				}
				break;
			case 3:
				Utility.writeObjectToJson(personList, "person.json");
				System.out.println(personList);
				
				Utility.writeObjectToJson(companyList, "company.json");
				System.out.println(companyList);
				break;
			case 4:
				System.exit(0);
				default:
					System.out.println("Wrong Input");
			}
		}while(choice<5);
		
//		Utility.writeObjectToJson(personList, "Person.json");
//		System.out.println(personList);
//		
//		Utility.writeObjectToJson(companyList, "Company.json");
//		System.out.println(companyList);
		
	}

}