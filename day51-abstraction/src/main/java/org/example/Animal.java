package org.example;

abstract class Animal {
    // class contents
    String name;
    boolean isFourLegged;

    // If you want to let them implement it, do this
    abstract void makeSound();

    // If you want to implement it you can
    void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
