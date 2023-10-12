package org.tnsif.SingleDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of element in an array:");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			
			}
		}
		System.out.println("The largest element in array is:"+max);
		
		Arrays.sort(arr);
		
	}
}
