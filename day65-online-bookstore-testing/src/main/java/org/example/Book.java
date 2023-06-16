package org.example;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private String genre;
    private double price;
    private List<String> reviews = new ArrayList<>();


    public Book(String title, String author, String genre, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public Book(String title, String author, String genre, double price, List<String> reviews) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
