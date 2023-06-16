package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of UserService
        UserService userService = new UserService();

        // Creating a new User
        User newUser = new User("JohnDoe", "password", "johndoe@example.com");

        // Registering the user
        boolean registrationSuccessful = userService.registerUser(newUser);
        if (registrationSuccessful) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed. Username might already be taken.");
        }

        // Logging in the user
        User loggedInUser = userService.loginUser("JohnDoe", "password");
        if (loggedInUser != null) {
            System.out.println("User login successful!");
        } else {
            System.out.println("User login failed. Username and password do not match.");
        }

        // Creating an instance of BookService
        BookService bookService = new BookService();

        // Adding some books to the "database"
        bookService.addBook(new Book("1984", "George Orwell", "Dystopian", 9.99));
        bookService.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 14.99));

        // Searching for a book
        List<Book> books = bookService.searchBook("1984");
        if (!books.isEmpty()) {
            System.out.println("Books found:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        } else {
            System.out.println("No books found with the given keyword.");
        }

        // Purchasing a book
        Book bookToPurchase = books.get(0);
        boolean purchaseSuccessful = bookService.purchaseBook(loggedInUser, bookToPurchase);
        if (purchaseSuccessful) {
            System.out.println("Book purchase successful!");
        } else {
            System.out.println("Book purchase failed. The book might not be available.");
        }

        // Adding a book review
        boolean reviewAdded = bookService.addBookReview(loggedInUser, bookToPurchase, "Amazing book!");
        if (reviewAdded) {
            System.out.println("Review added successfully!");
        } else {
            System.out.println("Failed to add review. The user might not have purchased this book.");
        }
    }
}
