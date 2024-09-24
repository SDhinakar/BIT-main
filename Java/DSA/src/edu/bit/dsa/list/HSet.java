package edu.bit.dsa.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        Set capacitySet = new HashSet();
        Set capacityFillSet = new HashSet();

        set.add(143);
        set.add("sam");
        set.add("ram");
        set.add(143);

        System.out.println(set);

        set.stream().forEach(System.out::println);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
