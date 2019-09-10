package com.bridgelabz.ObjectOrientation2;



import java.io.File;
import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Utility;



public class Commercial 
{

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
					
					if(numberOfShares>company.getNumberOfShares())
					{
						System.out.println("Sorry you cant buy shares");
					}
					else
					{
						
						int amount=CommercialOperations.buyShares(person.getBalance(), numberOfShares, company.getShareAmount());
						int availableSharesInCompany=company.getNumberOfShares();
						availableSharesInCompany=availableSharesInCompany-numberOfShares;
						person.setBalance(amount);
						
						int availableShareInPerson=person.getNumberOfShares();
						availableShareInPerson=availableShareInPerson-numberOfShares;
						person.setNumberOfShares(availableShareInPerson);	
						
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
					if(numberOfShares2>company.getNumberOfShares())
					{
						System.out.println("Sorry you cant buy shares");
					}
					else
					{
						
						int amount2=CommercialOperations.sellShares(person.getBalance(), numberOfShares2, company.getShareAmount());
						int availableSharesInCompany=company.getNumberOfShares();
						availableSharesInCompany=availableSharesInCompany-numberOfShares2;
						person.setBalance(amount2);
						
						int availableShareInPerson=person.getNumberOfShares();
						availableShareInPerson=availableShareInPerson+numberOfShares2;
						person.setNumberOfShares(availableShareInPerson);	
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
		

		
	}

}