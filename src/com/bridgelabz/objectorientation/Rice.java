package com.bridgelabz.objectorientation;

import com.bridgelabz.utility.Utility;

public class Rice 
{
	String Name;
	int price;
	int weight;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "InventryNew [Name=" + Name + ", price=" + price + ", weight=" + weight + "]";
	}
	
	public void getDetails()
	{
		System.out.println("Enter Details of Rice");
		System.out.println("Name ");
		setName(Utility.scanString());
		System.out.println("Weight ");
		setWeight(Utility.scanInt());
		System.out.println("Price per kgf ");
		setPrice(Utility.scanInt());
	}
	
}



























