package org.tnsif.assignment2;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Product p1=new Product();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1.Add\n 2.Display\n 3.Exit");
			System.out.println("Enter Your Choice");
			
			int ch=sc.nextInt();
			sc.nextLine();
			
			switch (ch)
			{
			case 1:
					System.out.println("Enter Product Name: ");
					String productName=sc.nextLine();
					p1.addProductToList(productName);
					
				break;
			case 2:
				if(p1.productList.isEmpty())
				{
					System.out.println("Empty list");
				}
				else
				{
					p1.sortProductList();
				}
				break;
			case 3:
					System.out.println("Thank you ");
					System.exit(0);
			default:
				break;
			}
			sc.close();
			
		}
	}

}
