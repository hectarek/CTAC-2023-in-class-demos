package org.classdemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // STATE OF AN OBJECT

//        Rectangle rec = new Rectangle(12, 10);
//        System.out.println("Rectangle Dimensions " + rec.toString());
//        System.out.println("Rectangle Surface Area " + rec.surfaceArea());
//
//        rec.widen();
//
//        System.out.println("Rectangle Dimensions " + rec.toString());
//        System.out.println("Rectangle Surface Area " + rec.surfaceArea());

        // Work with Objects in Lists

//        ArrayList<Person> people = new ArrayList<>();
//
//        Person jose = new Person("Jose", 35, 80, 180); // weight in Kilos, height in Centimeters
//
//        people.add(jose);
//
//        System.out.println(jose.toString());
//
//        people.add(new Person("Magdalena", 31, 60, 163));
//        people.add(new Person("Martin", 74, 68.9, 164));
//
////        System.out.println(people);
//
//        for (Person person : people) {
//            System.out.println(person);
//        }

        // Overloading Methods

//        System.out.println(add(3,3));
//        System.out.println(add(3.0,3.0));

//        Main.main("Hey, this is gonna run");
//        Main.main("This is my first arg", "This is my second arg");


        int myNumber  = 3;

        myNumber = 4;

        String name = "Exampke";

        System.out.println(myNumber);

        Person per = new Person("Bob");

        System.out.println(per);

        per = new Person("Guillermo");

        System.out.println(per);

        new Person("Bob") = new Person("Guillermo");

        3 = 4;

    }
//
//    public static int add(int x, int y) {
//        return x + y;
//    }
//
//    public static double add(double x, double y) {
//        return x + y;
//    }
//
//    public static void main(String arg) {
//        System.out.println(arg);
//    }
//
//    public static void main(String arg1, String arg2) {
//        System.out.println("First Arg: " + arg1 + " Second Arg: " + arg2);
//    }

}