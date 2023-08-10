package org.tnsif.uncheckedException;

import java.util.Scanner;

public class finallyBlockNotExecuted 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		try
		{
			System.out.println(x/y);
			System.exit(0);
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled"+e);
		}
		finally 
		{
			/*divide by 0*/
			System.out.println("Finally Block always get executed");
		}

	}

}
