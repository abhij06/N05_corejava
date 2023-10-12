//program to demonstrate homogeneous arraylist 
package org.tnsif.Mix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(10);
		intList.add(17);
		intList.add(61);
		intList.add(11);
		
		System.out.println(intList);
		
		intList.add(2,50);
		System.out.println(intList);
		
		Collections.sort(intList);
		
		System.out.println("-------------------------After Sorting");
		System.out.println(intList);
		
		System.out.println("------------------------After Reversing");
		Collections.reverse(intList);
		System.out.println(intList);

		
		System.out.println("is 10 Present??"+ intList.contains(10));
		
		//System.out.println(intList.remove(5));
		System.out.println("Remove element 61 "+intList.remove(intList.indexOf(61)));
		
		System.out.println(intList);
		
		System.out.println(intList.indexOf(17)>=0?"Present":"17 not Present");
		
		Iterator<Integer> it=intList.iterator();
		while(it.hasNext())
		{
			int no=it.next();
			System.out.println(no+":"+no*no);
		}
		
		
	}

}
