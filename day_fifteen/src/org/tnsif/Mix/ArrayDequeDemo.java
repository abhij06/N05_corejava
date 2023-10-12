package org.tnsif.Mix;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> aqueue=new ArrayDeque<Integer>();
		aqueue.add(40);
		aqueue.add(45);
		aqueue.add(79);
		
		System.out.println(aqueue);
		
		aqueue.addFirst(22);
		aqueue.addLast(100);
		
		System.out.println(aqueue);
		System.out.println("Size: "+aqueue.size());
		System.out.println("Is Empty: "+aqueue.isEmpty());
		System.out.println("Element to be remove first: "+aqueue.peek());
		System.out.println("Element to be remove first: "+aqueue.peekFirst());
		System.out.println("Element to be remove last: "+aqueue.peekLast());
		System.out.println("Element to be remove first: "+aqueue.removeFirst());
		System.out.println(aqueue);
		
		
		while (!aqueue.isEmpty())
		{
			System.out.println(aqueue.remove()+" Removed");
			
		}
		System.out.println(aqueue);
		
	}
}
