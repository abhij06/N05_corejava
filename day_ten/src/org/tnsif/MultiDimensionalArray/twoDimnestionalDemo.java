package org.tnsif.MultiDimensionalArray;

import java.util.Scanner;

//program to demonstrate on 2d array
public class twoDimnestionalDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		//printing array
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
