package org.example;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ScannerClass {
    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Print "Provide text for the Scanner to read: "
        System.out.println("Provide text for the Scanner to read: ");

        // The string provided by the user will be assigned to the text variable
        // Scanner will read the input entered by the user
        String text = scanner.nextLine();

        // Print the user's text that was entered
        System.out.println(text);

        //Single scanner can read multiple inputs; no need to use an additional scanner. If you do,the scanner name must be different
        Scanner scanner2 = new Scanner(System.in);

        // Print "Provide text for the Scanner to read: "
        System.out.println("What is your name? ");

        // The string provided by the user will be assigned to the text variable
        // Scanner will read the input entered by the user
        String text2 = scanner2.nextLine();

        System.out.println("Where are you from? ");
        String text3 = scanner2.nextLine();

        System.out.println("What is your favorite food?");
        String text4 = scanner2.nextLine();

        // Print the user's text that was entered
        System.out.println("Your name is " + text2 + ". You're from " + text3 + " and your favorite food is " + text4 + "." );

    }
}