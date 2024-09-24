package edu.bit.dsa.list;

import java.util.PriorityQueue;
import java.util.Queue;
public class PQueue 
{
	public static void main(String[] args) 
	{
		Queue<String> process=new PriorityQueue<String>();
		process.offer("MS Word");
		process.offer("Paint");
		process.offer("Dsplay");
		process.offer("Browser");
		
		System.out.println(process);
		
		System.out.println(process.peek());
		System.out.println(process.element());
		
		System.out.println(process);
		
		System.out.println(process.poll());
		System.out.println(process);
	}
}