package org.classdemo;

public class Person {

    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        // BMI = Weight (kg) / (Height (m))^2
        return Math.round((this.weight / (heightDivByHundred * heightDivByHundred)) * 100.0) / 100.0;
    }

    public double maximumHeartRate() {
        return Math.round((206.3 - (0.711 * this.age)) * 100.0) / 100.0;
    }

//    public String toString() {
//        return this.name + " Age: " + this.age + ", BMI: " + this.bodyMassIndex()
//                + ", maximum heart rate: " + this.maximumHeartRate();
//    }

}

