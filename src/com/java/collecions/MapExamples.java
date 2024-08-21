package com.java.collecions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapExamples {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        Map<String, Integer> hashTable = new Hashtable<>();

        // Adding elements
        hashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 25);
        treeMap.put("Charlie", 35);
        concurrentHashMap.put("David", 40);
        hashTable.put("Eve", 45);

        // Accessing elements
        System.out.println("HashMap: " + hashMap.get("Alice")); // Output: 30
        System.out.println("LinkedHashMap: " + linkedHashMap.get("Bob")); // Output: 25
        System.out.println("TreeMap: " + treeMap.get("Charlie")); // Output: 35
        System.out.println("ConcurrentHashMap: " + concurrentHashMap.get("David")); // Output: 40
        System.out.println("Hashtable: " + hashTable.get("Eve")); // Output: 45

        // Removing elements
        hashMap.remove("Alice");
        linkedHashMap.remove("Bob");

        // Size of Map
        System.out.println("HashMap Size: " + hashMap.size()); // Output: 0
        System.out.println("LinkedHashMap Size: " + linkedHashMap.size()); // Output: 0

        // Iterating over Map
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
