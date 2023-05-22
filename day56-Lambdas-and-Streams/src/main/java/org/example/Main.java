package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Lambda Expressions
    Book myBook = new Book();

//    myBook.print();

    printThing((item) -> System.out.println("This is a " + item));

        // Streams

        List<Person> people = getPeople();

        System.out.println(people);

        List<Person> moods = people.stream()
                .filter(person -> person.getMood().equals(Mood.HAPPY))
                .toList();

        people.forEach(p -> p.filterPerson());

        System.out.println(moods);


        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        System.out.println();

        Map<Mood, List<Person>> groupByMood = people.stream()
                .collect(Collectors.groupingBy(Person::getMood));

        System.out.println(groupByMood);

        groupByMood.forEach((mood, peoples) -> {
            System.out.println(mood);
            peoples.forEach(System.out::println);
            System.out.println();
        });

    }

//    static void printThing( Printable thing ) {
//        thing.print("Candle Stick");
//    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Mood.HAPPY),
                new Person("Alina Smith", 33, Mood.SLEEPY),
                new Person("Helen White", 57, Mood.SCARED),
                new Person("Alex Boz", 140, Mood.SAD),
                new Person("Jamie Goa", 99, Mood.HAPPY),
                new Person("Anna Cook", 7, Mood.ANGRY),
                new Person("Zelda Brown", 120, Mood.HAPPY)
        );
    }

}