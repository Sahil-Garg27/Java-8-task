package com.java.collecions;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        hashSet.add("Dog");
        treeSet.add("Cat");
        linkedHashSet.add("Elephant");

        // Removing elements
        hashSet.remove("Dog");
        treeSet.remove("Cat");

        // Size of Set
        System.out.println("HashSet Size: " + hashSet.size()); // Output: 0
        System.out.println("TreeSet Size: " + treeSet.size()); // Output: 0

        // Iterating over Set
        for (String item : linkedHashSet) {
            System.out.println(item);
        }
    }
}

