package org.tnsif.uncheckedException;

import java.io.IOException;

public class throwExecutor {
	
	public static void isEligible(int age,int weight) throws IOException 
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible for Donate blood");
		}
		else
		{
			throw new IOException("Age and weight criteria not fulfill!!!!!");
		}
	}
	public static void main(String[] args) throws IOException 
	{
			isEligible(29, 51);
		
	}

}
