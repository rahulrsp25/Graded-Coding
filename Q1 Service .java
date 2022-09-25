ackage com.gl.question1.service;

import java.util.PriorityQueue;

public class Service {
	
	public void printConstructionTable(int floor[]) {
		
		//1. Using priority queue and setting its natural ordering to descending order
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
		
		int max = floor.length;
		
		/*
		 * 2. i. First we will add the floor size received everyday into the queue
		 * ii. Check the queue for the required floor size and pop till all the requirements are met
		 */
		System.out.println("The order of construction is as follows");
		for (int i = 0; i<floor.length; i++) {
			System.out.println("Day: " + (i+1));
			queue.add(floor[i]);
			
			while (!queue.isEmpty() && queue.peek() == max) {
				
				System.out.println(queue.poll() + " ");
				max--;
			}
			System.out.println();
		}
	}

}