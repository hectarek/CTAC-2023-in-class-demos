package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class BookServiceTest {
    private BookService bookService;

    @Before
    public void setUp() {
        bookService = new BookService();

        Book book1 = new Book("Title1", "Author1", "Genre1", 10.99);
        Book book2 = new Book("Title2", "Author2", "Genre2", 15.99);

        bookService.addBook(book1);
        bookService.addBook(book2);
    }

    @Test
    public void testSearchBook() {
        List<Book> searchResult = bookService.searchBook("Title1");
        Assert.assertEquals(1, searchResult.size());
        Assert.assertEquals("Title1", searchResult.get(0).getTitle());

        // Negative case
        searchResult = bookService.searchBook("NonExistentTitle");
        Assert.assertTrue(searchResult.isEmpty());

        // Edge case with empty string as keyword
        searchResult = bookService.searchBook("");
        Assert.assertTrue(searchResult.isEmpty());
    }

    @Test
    public void testPurchaseBook() {
        User user = new User("username", "password", "email@example.com");
        Book book = new Book("Title1", "Author1", "Genre1", 10.99);
        Assert.assertTrue(bookService.purchaseBook(user, book));

        // Negative case
        Book nonExistentBook = new Book("NonExistentTitle", "Author", "Genre", 10.99);
        Assert.assertFalse(bookService.purchaseBook(user, nonExistentBook));
    }

    @Test
    public void testAddBookReview() {
        User user = new User("username", "password", "email@example.com");
        Book book = new Book("Title1", "Author1", "Genre1", 10.99);
        user.getPurchasedBooks().add(book);

        Assert.assertTrue(bookService.addBookReview(user, book, "Great book!"));

        // Negative case
        Book nonPurchasedBook = new Book("NonPurchasedTitle", "Author", "Genre", 10.99);
        Assert.assertFalse(bookService.addBookReview(user, nonPurchasedBook, "Great book!"));

        // Edge case with empty string as review
        Assert.assertFalse(bookService.addBookReview(user, book, ""));
    }
}
