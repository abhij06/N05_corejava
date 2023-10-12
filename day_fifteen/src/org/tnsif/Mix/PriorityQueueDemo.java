package org.tnsif.Mix;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> aqueue=new PriorityQueue<Integer>();
		aqueue.add(40);
		aqueue.add(70);
		aqueue.add(20);
		aqueue.add(80);
		
		System.out.println(aqueue);
		System.out.println("Size: "+aqueue.size());
		System.out.println("Is Empty: "+aqueue.isEmpty());
		System.out.println("Element to be remove first: "+aqueue.peek());
		
		
		while (!aqueue.isEmpty())
		{
			System.out.println(aqueue.remove()+" Removed");
			
		}
		System.out.println(aqueue);
		
	}
}

