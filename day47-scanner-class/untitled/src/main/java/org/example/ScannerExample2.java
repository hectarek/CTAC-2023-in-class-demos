package org.example;
import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner input = new Scanner(System.in);

        // Print "Provide text for the Scanner to read: "
        System.out.println("What year is it? ");

        // The integer provided by the user will be assigned to the year variable
        // Scanner will read the input entered by the user
//        int year = input.nextLine();
        int year = Integer.valueOf(input.nextLine());

        // Print the value that the user assigned to the year variable
        System.out.println(year);

        // Scanning a double
        System.out.println("Enter the value of pi: ");
        double value = Double.valueOf(input.nextLine());
        System.out.println(value + " is called pi day, for obvious reasons");


        // Scanning a boolean
        System.out.println("Is the sky blue? Enter true for yes and false for no: ");
        boolean value2 = Boolean.valueOf(input.nextLine());
        System.out.println("It is " + value2 + " that the sky is blue");

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intValue = input2.nextInt();

        System.out.print("Enter a float: ");
        float floatValue = input2.nextFloat();

        System.out.print("Enter a double: ");
        double doubleValue = input2.nextDouble();

        System.out.print("Enter a word: ");
        String wordValue = input2.next();

        System.out.print("Enter a sentence: ");
        input2.nextLine(); // Consume the newline character
        String sentenceValue = input2.nextLine();

        System.out.println("Integer:" + intValue + "\nFloat: " + floatValue + "\nDouble: " + doubleValue + "\nWord: " + wordValue + "\nSentence: " + sentenceValue);


    }
}
