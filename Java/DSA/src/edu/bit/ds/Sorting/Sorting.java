package edu.bit.ds.Sorting;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Sorting {
	public static void main(String[] args)
	{
//		sort(List<T> list); 
//		sort(List<T> list,Comparator<T> c);
//		reverse(List<T> list);
//		shuffle(List<T> list);
//		swap(List<T> list,int i,int j);
//		List<String> animals=new LinkedList<String>();
//		animals.add("Dinosaur");
//		animals.add("Dragon");
//		animals.add("Goat");
//		animals.add("Cat");
//		System.out.println(animals);
//		Collections.sort(animals);
//		System.out.println(animals);
//		Collections.sort(animals,Collections.reverseOrder());
//		System.out.println(animals);
		
//		List<Movie> movies=new ArrayList<Movie>();
//		movies.add(new Movie(1,"GOAT",2024));
//		movies.add(new Movie(2,"Pushpa",2022));
//		movies.add(new Movie(3,"KGF",2020));
//		movies.add(new Movie(4,"RRR",2023));
//		movies.add(new Movie(5,"Remo",2016));
//		Collections.sort(movies);
//		for(Movie movie:movies) {
//			System.out.println(movie.getName()+"\t"+movie.getReleasedYear());
//		}
//		Collections.sort(movies,Collections.reverseOrder());
//		for(Movie movie:movies) {
//			System.out.println(movie.getName()+"\t"+movie.getReleasedYear());
//		}
		
		 List<Job> jobList = new LinkedList<>();

	        jobList.add(new Job("Youtube", 3));
	        jobList.add(new Job("OS", 1));
	        jobList.add(new Job("Call", 2));
	        jobList.add(new Job("Instagram", 4));
	        
	        jobList.sort(Comparator.comparingInt(Job::getPriority));
	        for (Job job : jobList) {
	            System.out.println(job.getName() + "\t" + job.getPriority());
	        }
	}
}
