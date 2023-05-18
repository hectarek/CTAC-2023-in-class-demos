package org.example;

public class Cat extends Animal implements Roars {

    String name;
    boolean isFourLegged;

    public Cat(String name) {
        this.name = name;
    }
    public Cat(String name, boolean isFourLegged) {
        this.name = name;
        this.isFourLegged = isFourLegged;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFourLegged() {
        return isFourLegged;
    }

    public void setFourLegged(boolean fourLegged) {
        isFourLegged = fourLegged;
    }

    @Override
    void makeSound() {

    }

    @Override
    public void roars(String roar) {

    }
}
