package org.day48demo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        printToConsole();
//        int answer = addTwoNumbers(5,6);
//        System.out.println(answer);
//        System.out.println(avgNums(2,3,5));

//        ArrayList<String> myArray = new ArrayList<String>();
//
//        myArray.add("This is my String");
//        myArray.add("This is my Second String");

//        System.out.println(myArray.size());
//        System.out.println(myArray.get(0));

//        for (int i = 0; i < myArray.size(); i++) {
//            System.out.println(myArray.get(i));
//        }
//
//        for (String sentences : myArray) {
//            System.out.println(sentences);
//        }

//        ArrayList<Integer> numList = new ArrayList<Integer>();
//
//        numList.add(20);
//        numList.add(30);
//        numList.add(40);
//        numList.add(50);
//        numList.add(60);
//
//        System.out.println(numList);
////        numList.remove(2);
//        numList.set(2, 4000);
//        System.out.println(numList.contains(70));

//        int[] nums = new int[4];
//
//        nums[0] = 30;
//        nums[1] = 40;
//        nums[2] = 50;
//        nums[3] = 60;
////        nums[4] = 70;
//
//        System.out.println(nums.length);
//
//        for (int num : nums) {
//            System.out.print(num + ", ");
//        }
//
//        String[] listOfNames = {"Bob", "Moe", "Saj"};
//
//        listOfNames[1] = "Moses";
////        listOfNames[3] = "Jerry"; // Will not work

        ArrayList<Double> nameOfArray = new ArrayList<>();

        nameOfArray.add(3.0);
        nameOfArray.add(3);
        nameOfArray.add("string");

        System.out.println(nameOfArray.get(2));

    }

    public static void printToConsole() {
        System.out.println("Hello Class!");
    }

    public static int addTwoNumbers(int num1, int num2) {
       return num1 + num2;
    }

    public static double avgNums(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        double avg = sum / 3.0;
        return avg;
    }

}
