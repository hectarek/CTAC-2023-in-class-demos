package org.example;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
