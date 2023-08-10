package org.tnsif.uncheckedException;

public class ArrayIndexOutOfBoundExecutor
{
	static void print(int arr[])
	{
		try 
		{
			System.out.println(arr[4]);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception handled"+e);
		}
		finally
		{
			System.out.println("Finally block always gets executed");
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,20,45};
		print(arr);
	}

}
