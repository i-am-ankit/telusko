package com.ankit.telusko;

public class Tyre 
{
	private String brand;

	/*public Tyre(String brand) 
	{
		super();
		this.brand = brand;
	}*/

	public String getBrand() 
	{
		return brand;
	}

	public void setBrand(String brand) 
	{
		this.brand = brand;
	}

	@Override
	public String toString() 
	{
		return "Tyre";
		//return "Tyre [brand=" + brand + ", getBrand()=" + getBrand() + "]";
	}	
	
	
}
