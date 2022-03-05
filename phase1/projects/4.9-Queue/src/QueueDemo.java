// Java program to demonstrate a Queue

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();

		
		for (int i = 0; i < 5; i++)
			q.add(i);

		// display
		System.out.println("elements of queue: " + q);

		// remove
		int remove = q.remove();					//return and then remove and fifo
		System.out.println("removed element: "+ remove);
		System.out.println(q);

		System.out.println("Size of queue: " + q.size());
	}
}
