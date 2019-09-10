package com.bridgelabz.objectorientation;



public class Person 
{
	private static String personName;
	private static int shareQuantity;
	private static int balance;
	public static String getPersonName() {
		return personName;
	}
	public static void setPersonName(String personName) {
		Person.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public static int getShareQuantity() {
		return shareQuantity;
	}
	public static void setShareQuantity(int shareQuantity) {
		Person.shareQuantity = shareQuantity;
	}
	public static int getBalance() {
		return balance;
	}
	public static void setBalance(int balance) {
		Person.balance = balance;
	}
	
	

}
