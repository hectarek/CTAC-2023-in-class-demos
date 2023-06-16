package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Example 1
        //        int number1 = 5;
//        int number2 = 8;
//
//        int result = add(number1, number2);
//
//        System.out.println(result);

        // Looping
//        for (int i = 0; i < 20; i++) {
//            // some code here
//            System.out.println(i);
//
//            int example = 4 + i;
//            System.out.print(" this is our example " + example);
//
//        }

//        sayHelloInsideMethod("Hello");
//
//        System.out.println("It should stop here");

//        int result = 0;
//        for (int i = 0; i < 10; i++) {
//            result += i;
//        }

//        System.out.println("This is my Result: " + result);

        // Regex
//        String text1 = "Hello";
//        String text2 = "HEllo";
//
//        System.out.println(text1 == text2);

//        String input = "12345";
//        boolean isNumber = input.matches("\\d+");
//        System.out.println(isNumber);

        String textToDecipher = "28217-292832";

        Pattern pat = Pattern.compile("^\\d{5}(?:[-\\s]\\d{6})?$");
        Matcher matcher = pat.matcher(textToDecipher);

        while(matcher.find()) {
            System.out.println("Matches: " + matcher.group() + " at " + matcher.start());
        }

    }

//    public static void sayHelloInsideMethod(String word) {
//        System.out.println("My Word: " + word.toUpperCase());
//    }
//    public static int add(int num1, int num2) {
//        return num1 + num2;
//    }
}