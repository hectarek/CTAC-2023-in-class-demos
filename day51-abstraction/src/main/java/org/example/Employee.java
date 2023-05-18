package org.example;

public class Employee implements Principal, Teacher {

    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void canManage() {

    }

    @Override
    public void canSuspendStudents() {

    }

    @Override
    public void canTeach() {

    }

    @Override
    public void canLecture() {

    }
}
