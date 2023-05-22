package org.example;

public class Person {

    private final String name;
    private final int age;
    private final Mood mood;

    public Person(String name, int age, Mood mood) {
        this.name = name;
        this.age = age;
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Mood getMood() {
        return mood;
    }

    public void print() {
        System.out.println("This is " + this.name);
    }

    public void filterPerson(Person person) {
        if (person.getMood().equals(Mood.HAPPY)) {
            return something
        } else  {
            return somethineesel
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                '}';
    }
}