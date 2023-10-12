package org.tnsif.UserDefinedException;

import java.util.Scanner;

//driver class
public class CustomExceptionExecution {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter email and passowrd:");
		String email=s.nextLine();
		String password=s.nextLine();
		try
		{
			if(email.equals("abhishekjadhav502@gmail.com") && password.equals("pass@123"))
			{
				System.out.println("Credential matched");
			}
			else 
			{
				throw new LoginCredintial("Invalid Credential!!!");
			}
		}
		catch(LoginCredintial e)
		{
			System.out.println(e);
		}
		
	}

}
