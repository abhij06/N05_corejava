package org.tnsinterface;

public class SBIDebitCard implements DebitCard
{

	@Override
	public void displayCardDetails() 
	{
		System.out.println("Card No is:"+cardno);
		
	}

}
