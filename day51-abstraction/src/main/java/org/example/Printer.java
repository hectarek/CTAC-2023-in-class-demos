package org.example;

public class Printer<T> {

    private T content;

    public T printToTheClass() {
        return content;
    }

    public void printToTheClass(T content) {
        System.out.println(content);
    }

}
