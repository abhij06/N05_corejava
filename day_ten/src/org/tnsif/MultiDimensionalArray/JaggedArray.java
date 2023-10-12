package org.tnsif.MultiDimensionalArray;

import java.util.Scanner;

public class JaggedArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//in jagged array outside side is fix but not inside
		int arr[][]=new int[2][];
		//for outside array index 0,storing 3 elements
		arr[0]=new int[3];
		//for outside array index 1,storing 2 elements
		arr[1]=new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		//
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
