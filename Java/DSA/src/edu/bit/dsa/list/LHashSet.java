package edu.bit.dsa.list;
import java.util.*;
public class LHashSet {
	public static void main(String[] args) {
		Set<String> relationship=new LinkedHashSet<String>();
		relationship.add("meet");
		relationship.add("chatting");
		relationship.add("feeling");
		relationship.add("job");
		relationship.add("marriage");
		System.out.println(relationship);
	}
}