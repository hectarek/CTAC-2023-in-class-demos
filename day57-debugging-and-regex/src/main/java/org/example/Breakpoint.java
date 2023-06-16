package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Breakpoint {
    public static void main(String[] args) {

        // Breakpoint Example
//        int num1 = 1;
//        int num2 = 3;
//
//        int result = addNumbers(num1, num2);
//        System.out.println("Result: " + result);
//
//
//        String name = "Jeremiah";
//
//        System.out.println("My Name is Jeremiah");

        // Object Example
//        Fish goldy = new Fish("Goldy");
//        goldy.setFoodPreference("Fish Flakes");
//        goldy.setAge (3) ;
//
//        Fish angel = new Fish ("Angel");
//        angel.setFoodPreference("Fish Flakes PLUS");
//        angel.getFoodPreference();
//        System.out.println(angel.getAge());

//        // Conditional Breakpoints
//        for (int i = 0; i < 10; i++) {
//            // Some code here...
//            System.out.println(i);
//        }
//
//        // Watches Example
//        int result2 = 0;
//        for (int i = 0; i < 10; i++) {
//            result2 += i;
//        }
//        System.out.println("Result: " + result2);
//
//        // Stack Trace Example
//        printName(null);
//
        // Regex Example 0
//        String word = "trees";
//        boolean isNumber = word.matches("trees"); // This regex matches one or more digits
//        System.out.println(isNumber); // Prints: true

//        // Regex Example 1
//        String input = "12345";
//        boolean isNumber = input.matches("\\d+"); // This regex matches one or more digits
//        System.out.println(isNumber); // Prints: true

//        // Regex Example 2
        String text = "aaabadaaa";
        Pattern pattern = Pattern.compile("a*");
        Matcher matcher = pattern.matcher(text);
//
        while (matcher.find()) {
            System.out.println("Matched: '" + matcher.group() + "' at position " + matcher.start());
        }
//
//        // Regex Example 3
//        String text2 = "abc def ghi";
//        Pattern pattern2 = Pattern.compile("[^abc ]");
//        Matcher matcher2 = pattern2.matcher(text2);
//
//        int count = 0;
//        while (matcher2.find()) {
//            count++;
//        }
//
//        System.out.println("Number of non-'abc ' characters: " + count);
//
//        // Regex Example 4
        String email = "someone@example.com";
        boolean isValid = email.matches("^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)*(\\.[a-zA-Z]{2,})$");
        System.out.println(isValid);  // Prints: true

    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void printName(String name) {
        System.out.println("Name: " + name.toUpperCase());
    }
}
