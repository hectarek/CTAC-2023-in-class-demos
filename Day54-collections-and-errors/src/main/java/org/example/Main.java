package org.example;

// LISTS
import java.util.ArrayList;
import java.util.List;

// SETS
import java.util.HashSet;
import java.util.Set;

// MAPS
import java.util.HashMap;
import java.util.Map;

// QUEUES
import java.util.LinkedList;
import java.util.Queue;

// DEQUEUE
import java.util.ArrayDeque;
import java.util.Deque;

// Exceptions
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        // LISTS
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C#");

        // Print the list
        System.out.println("The list is: " + list);

        // Access element at index 1
        System.out.println("Element at index 1: " + list.get(1));

        // Remove element at index 2
        list.remove(2);

        // Print the list after removal
        System.out.println("The list after removal: " + list);



        // SETS
        Set<String> set = new HashSet<String>();
        set.add("Trees");
        set.add("Herbs");
        set.add("Shrubs");

        // Print the set
        System.out.println("The set is: " + set);

        // Check if "Java" is in the set
        System.out.println("Is Java in the set? " + set.contains("Java"));

        // Remove "Java" from the set
        set.remove("Java");

        // Print the set after removal
        System.out.println("The set after removal: " + set);

        // MAPS
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);

        // Print the map
        System.out.println("The map is: " + map);

        // Access the value associated with "Java"
        System.out.println("The value associated with Java: " + map.get("Java"));

        // Remove the key-value pair with "Java"
        map.remove("Java");

        // Print the map after removal
        System.out.println("The map after removal: " + map);

        // QUEUES
        Queue<String> queue = new LinkedList<String>();
        queue.add("Java");
        queue.add("Python");
        queue.add("C++");

        // Print the queue
        System.out.println("The queue is: " + queue);

        // Access the head of the queue
        System.out.println("Head of the queue: " + queue.peek());

        // Remove the head of the queue
        queue.poll();

        // Print the queue after removal
        System.out.println("The queue after removal: " + queue);

        // DEQUEUE
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Java");
        deque.add("Python");
        deque.add("C++");

        // Print the deque
        System.out.println("The deque is: " + deque);

        // Access the head of the deque
        System.out.println("Head of the deque: " + deque.peek());

        // Remove the head of the deque
        deque.pop();

        // Print the deque after removal
        System.out.println("The deque after removal: " + deque);

        // Exception Handling
        try {
            // Code that might throw an exception
        } catch (ArithmeticException e) {
            // Code to handle the exception
        }

        try {
            // Code that might throw an exception
        } catch (Exception e) {
            // Code to handle the exception
        }

        try {
            // Code that might throw an exception
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Caught an exception: " + e.getMessage());
        }


        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }


    }

    // Throws Key word
    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    void myMethod() throws IOException {
        // code that may produce IOException
    }

}

