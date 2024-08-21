package com.java.collecions;

import java.util.*;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();
        Stack<String> stack = new Stack<>();

        // Adding elements
        priorityQueue.add("Task 1");
        stack.push("Task 2");

        // Removing elements
        System.out.println("PriorityQueue Poll: " + priorityQueue.poll()); // Output: Task 1
        System.out.println("Stack Pop: " + stack.pop()); // Output: Task 2

        // Size of Queue/Stack
        System.out.println("PriorityQueue Size: " + priorityQueue.size()); // Output: 0
        System.out.println("Stack Size: " + stack.size()); // Output: 0
    }
}

