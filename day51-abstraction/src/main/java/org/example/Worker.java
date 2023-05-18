package org.example;

public class Worker implements SeniorLevel {
    String name;
    String jobTitle;
    double basePay;

    public Worker(String name, double basePay) {
        this.name = name;
        this.jobTitle = "Worker";
        this.basePay = basePay;
    }

    void canBuildGeneralThings () {
        System.out.println("Build Ikea furniture");
    }

    void canConverse () {
        System.out.println("How do you do?");
    }

    double getBasePay () {
        return this.basePay;
    }

    @Override
    public void canNegotiate() {

    }

    @Override
    public void canManageWorkers() {

    }

    @Override
    public void calculateNewSalary() {

    }
}
