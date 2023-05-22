package org.example;

// LISTS
import java.util.*;

// SETS

// MAPS

// QUEUES

// DEQUEUE


public class App {

    public static void main(String[] args) {

//        // LISTS
//
//        List<Integer> list = new ArrayList<>();
//        List<String> otherList = new LinkedList<>();
//
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        list.get(1);
//        list.remove(2);
//
//        System.out.println(list);
//
//        otherList.add("3");
//        otherList.add("4");
//        otherList.add("5");
//
//        System.out.println(otherList);
//
//        // SETS
//        Set<String> colors = new HashSet<>();
//
//        colors.add("blue");
//        colors.add("red");
//        colors.add("orange");
//        colors.add("teal");
//
//        System.out.println(colors.contains("red"));
//
//        // Maps
//        Map<Integer, String> social = new HashMap<>();
//
//        social.put(123451233, "Bob Schmit");
//        social.put(234234235, "Sally Ortega");
//        social.put(890237498, "Raj Savvhan");
//
//        // Queue
//        Queue<String> pplAtACoffeeShop = new LinkedList<>();
//
//        pplAtACoffeeShop.add("Butcher");
//        pplAtACoffeeShop.add("Baker");
//        pplAtACoffeeShop.add("Candle Stick Maker");
//
//        System.out.println(pplAtACoffeeShop);
//
//        pplAtACoffeeShop.poll();
//
//        System.out.println(pplAtACoffeeShop);
//
//        // Deque
//        Deque<String> blizzardFlavors = new ArrayDeque<>();
//
//        blizzardFlavors.add("vanilla");
//        blizzardFlavors.add("snickers");
//        blizzardFlavors.add("cookies and creme");
//        blizzardFlavors.add("oreos");
//
//        System.out.println(blizzardFlavors);
//
//        System.out.println(blizzardFlavors.peek());
//
//        blizzardFlavors.pop();
//
//        System.out.println(blizzardFlavors);

        //  Try Catch

//        try {
//            Scanner scan = new Scanner(System.in);
//
//            System.out.println("Hey, can you give me a number?");
//
//            scan.nextInt();
//
//        } catch (InputMismatchException e) {
//            System.out.println(e);
//            System.out.println("Hey, you need to give a number, but you gave something else.");
//        } finally {
//            System.out.println("Thanks for using my program");
//        }
//
//        try {
//            int i = 0;
//            while(true) {
//                System.out.println(i);
//                i++;
//            }
//        } catch (Error e) {
//            System.out.println(e);
//        }


        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Access denied - You must be at least 18 years old.");
        }

        List<String> list = new LinkedList<>();


    }

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
//            System.out.println("Hey, you are too young");
//            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
