package org.tnsif.assignment;

public class Discount 
{
	public double calculateDiscount(Bero bObj)
	{
		double discount;
		if(bObj.getBeroType().equals("Steel Bero"))
		{
			discount=(bObj.getPrice() * 10)/100;
			return discount;
		}
		else if(bObj.getBeroType().equals("Wood Bero"))
		{
			discount=(bObj.getPrice() * 15)/100;
			return discount;
		}
		else
		{
			return 0;
		}
	}
}