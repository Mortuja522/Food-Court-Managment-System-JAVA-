package  classes;

import java.lang.*;

public class Appitizers extends FoodItem
{
	private String size;
	
	public void setSize(String size)
	{
		this.size=size;
	}	
	public String getSize(){return size;}
	
	public void showInfo()
	{
		System.out.println("Food ID: "+fid);
		System.out.println("Food Name: "+name);
		System.out.println("Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
		System.out.println("Size: "+size);
		System.out.println();
	}

}