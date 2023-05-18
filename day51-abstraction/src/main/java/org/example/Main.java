package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Review of Inheritance
//        Plant somePlant = new Plant("Tree");
        Tree oak = new Tree("Oak", true);
        Vegetation birch = new Tree ("Birch", true);

        oak.photosynthesis2();
        oak.absorbTheWater();

        // Generics

        ArrayList<Integer> myList = new ArrayList<>();

        Printer<Double> print = new Printer<>();

        Printer<String> print2 = new Printer<>();

//        print.printToTheClass(40.9);
//        print2.printToTheClass("This is something");

        // Enums

        Suit myCard = Suit.HEARTS;

//        Suit mySecondCard = "This";
//        Suit myThirdCard = 3;

        Month may = Month.MAY;

        System.out.println(may);
        System.out.println(may.getDays());

    }
}
