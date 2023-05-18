package org.example;

import org.example.librarymanagement.Book;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice", 25);
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger");

        System.out.println("User: " + user.getName() + ", Age: " + user.getAge());
        System.out.println("Book: " + book.getTitle() + ", Author: " + book.getAuthor());

        ExampleClass ex = new ExampleClass();

        final int MY_ACCOUNT_NUM = 123483829;

//        MY_ACCOUNT_NUM = 3423;

        System.out.println(MY_ACCOUNT_NUM);

        // Hashmaps

        HashMap<Integer, String> lunch = new HashMap();

        lunch.put(123, "Jimmy");
        lunch.put(124, "Sarah");
        lunch.put(125, "Maurice");

        System.out.println(lunch);

    }
}