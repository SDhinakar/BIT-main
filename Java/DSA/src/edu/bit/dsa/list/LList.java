package edu.bit.dsa.list;

import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.io.Serializable;
import java.lang.Cloneable;

public class LList 
{
	public static void main(String[] args)
	{
		List<String> fruits = new LinkedList<String>();
		
		fruits.add(null);
		fruits.add("Orange");
		fruits.add("Apple");              
		fruits.add("Mango");              
		fruits.add("Jack Fruit"); 
		fruits.addLast("Orange");
		fruits.addFirst("Banana");
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println(fruits.removeFirst());  
		System.out.println(fruits);
		System.out.println(fruits.removeLast());   
		System.out.println(fruits);
		
		System.out.println(fruits instanceof Serializable);  
		System.out.println(fruits instanceof Cloneable);     
		System.out.println(fruits instanceof RandomAccess);  
 	}
}
