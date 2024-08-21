package com.java.collecions;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Adding elements
        arrayList.add("Apple");
        linkedList.add("Banana");

        // Accessing elements
        System.out.println("ArrayList: " + arrayList.get(0)); // Output: Apple
        System.out.println("LinkedList: " + linkedList.get(0)); // Output: Banana

        // Removing elements
        arrayList.remove("Apple");
        linkedList.remove("Banana");

        // Size of List
        System.out.println("ArrayList Size: " + arrayList.size()); // Output: 0
        System.out.println("LinkedList Size: " + linkedList.size()); // Output: 0

        // Iterating over elements
        for (String item : arrayList) {
            System.out.println(item);
        }

        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}
