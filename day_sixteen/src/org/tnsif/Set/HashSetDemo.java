package org.tnsif.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		//hashset is unordered
		HashSet<String> courses=new HashSet<String>();
		courses.add("Engineering");
		courses.add("MCA");
		courses.add("MBA");
		courses.add("Pharmacy");
		courses.add("Engineering");
		System.out.println(courses);
	
		System.out.println(courses.size());
		Iterator<String> it=courses.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(courses.remove("MBA")?"Course Removed":"Course Not Found");
		System.out.println(courses);
		
		System.out.println("_______________-______________");
		HashSet<Integer> hsOne=new HashSet<Integer>();
		hsOne.add(20);
		hsOne.add(31);
		hsOne.add(335);
		hsOne.add(45);
		hsOne.add(77);
		
		HashSet<Integer> hsTwo=new HashSet<Integer>();
		hsTwo.add(20);
		hsTwo.add(44);
		hsTwo.add(94);
		hsTwo.add(23);
		hsTwo.add(77);
		
		System.out.println("First Set : "+hsOne);
		System.out.println("Second Set : "+hsTwo);
		hsOne.retainAll(hsTwo);
		System.out.println("Intersection : "+hsOne);
		hsOne.removeAll(hsTwo);
		System.out.println(hsOne);
		hsOne.addAll(hsTwo);
		System.out.println("Resultant Set : "+hsOne);
		hsOne.clear();
		
		System.out.println(hsOne);
		
		
		ArrayList<Integer> list=new ArrayList<Integer>(hsTwo);
		
		Collections.sort(list);
		System.out.println(list);
		hsTwo=new HashSet<Integer>(list);
		System.out.println("Second Set : "+hsTwo );
		
		
	}

}
