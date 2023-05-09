package org.example;

import java.util.Scanner;

public class OperatorsConditionalsExample {
    public static void main(String[] args) {

        //Standard if else statement with comparison and logical and operator
        System.out.println("Is the number between 10 and 20: ");
        int number = 11;

        if (number >= 10 && number <= 20) {
            System.out.println("It is!");
        } else {
            System.out.println("It is not!");
        }

        //Standard if else statement with comparison and logical not operator
        System.out.println("Is the number greater than 13: ");
        int number2 = 21;

        if (!(number2 > 13)) {
            System.out.println("The number is not greater than 13.");
        } else {
            System.out.println("The number is greater than or equal to 13.");
        }

        //Switch statement. Executes code for matching case. If no matching case, the default code is executed
        int dayOfWeek = 4;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println(dayName); // Output: "Wednesday"

        Scanner input = new Scanner(System.in);
        //Conditional and scanner with comparison and logical operators
//        System.out.println("Enter a number between 10 and 20: ");
//
//        int intValue = Integer.valueOf(input.nextLine());
//        if (intValue >= 10 && intValue <= 20) {
//            System.out.println("It is!");
//        } else {
//            System.out.println("It is not!");
//
//        }

        //Conditionals and the scanner using not operator
//        System.out.println("Enter a number to see if it's greater than 13: ");
//        int intValue2 = Integer.valueOf(input.nextLine());
//        //operator placed outside parentheses with condition inside
//        if (!(intValue2 > 13)) {
//            System.out.println("The number is not greater than 13.");
//        } else {
//            System.out.println("The number is greater than or equal to 13.");
//        }


        //Conditionals and the scanner
//        System.out.println("Enter a number: ");
//        int number3 = Integer.valueOf(input.nextLine());
//
//        if (number3 % 2 == 0 && number3 % 5 == 0) {
//            System.out.println("Buzz Lightyear");
//        } else if (number3 % 2 == 0) {
//            System.out.println("Buzz");
//        } else if (number3 % 3 == 0) {
//            System.out.println("Lightyear");
//        } else {
//            System.out.println(number3);
//        }

        //Switch Statement and scanner
//        System.out.println("Enter a number: ");
//        int dayOfWeek = Integer.valueOf(input.nextLine());;
//        String dayName;
//
//        switch (dayOfWeek) {
//            case 1:
//                dayName = "Sunday";
//                break;
//            case 2:
//                dayName = "Monday";
//                break;
//            case 3:
//                dayName = "Tuesday";
//                break;
//            case 4:
//                dayName = "Wednesday";
//                break;
//            case 5:
//                dayName = "Thursday";
//                break;
//            case 6:
//                dayName = "Friday";
//                break;
//            case 7:
//                dayName = "Saturday";
//                break;
//            default:
//                dayName = "Invalid day";
//        }
//
//        System.out.println(dayName); // Output: "Wednesday"

    }
}
