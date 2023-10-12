package org.tnsif.Generic;

public class GenericClassDemo {

	public static void main(String[] args) {
		Repo<Integer> objOne=new Repo<Integer>();
		objOne.setData(10);
		System.out.println(objOne.getData());
		
		Repo<String> objTwo=new Repo<String>();
		objTwo.setData("Java");
		System.out.println(objTwo.getData());
		
		
		Repo<Student> objThree=new Repo<Student>();
		objThree.setData(new Student(101,"Mahesh",67));
		System.out.println(objThree.getData());
	}

}
