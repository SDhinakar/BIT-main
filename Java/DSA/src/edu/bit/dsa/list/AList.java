package edu.bit.dsa.list;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.io.Serializable;

public class AList {
	public static void main(String[] args) 
	{
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(143);
		numbers.add(132);
		numbers.add(2,341);
		//allows null values
		numbers.add(null);
		
		//random access
		System.out.println(numbers instanceof RandomAccess);
		System.out.println("index 3 valus is "+numbers.get(3));
		
		//Serialiazation
		System.out.println(numbers);
		System.out.println(numbers instanceof Serializable);

		//object cloning
		System.out.println(numbers instanceof Cloneable);

		
	numbers.stream().forEach(System.out::println);
		numbers.add(2);
		numbers.add(3);
	System.out.println(numbers);
		//remove using index
		numbers.remove(2);
		System.out.println(numbers);
		//remove using value
		numbers.remove(Integer.valueOf(2));
		System.out.println(numbers);
	}  
}//heterogenous,null,duplicates ,insertion order must be maintain,random search,
