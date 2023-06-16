package org.example;

public class Car {

    String make;
    String model;
    int year;
    int speed;

    public Car(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int mph() {
        int mph;

        mph = this.speed / 60;

        return mph;
    }

}
