package org.tnsif.SingleDimensionalArray;
//driver class
public class ArrayofObjectsDemo {

	public static void main(String[] args) {
		Employee arr[]=new Employee[2];
		arr[0]=new Employee(101,"Abhishek", 30000.2);
		arr[1]=new Employee(102,"Rupesh", 12200.8);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
	}

}
