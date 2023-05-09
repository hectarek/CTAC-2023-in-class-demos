package org.example;
import java.util.Scanner;

public class LoopsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //Scanner with while loop using break
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to leave? (if yes, enter 'y')");
            String userInput = input.nextLine();
            if (userInput.equals("y")) {
                break;
            }
                System.out.println("Thanks for staying!");
            }

            System.out.println(("See ya later"));

        //Scanner with for loop
        System.out.println("Enter a number");
        int number = Integer.valueOf(input.nextLine());
        for(int k = number; k < 20; k++) {
            System.out.println(k);
        }


        //Scanner with while loop using break and continue
        while (true) {
            System.out.println("Enter any number.");
            int number2 = Integer.valueOf(input.nextLine());

            if (number2 == 0) {
                break;
            }

            if (number2 < 0) {
                System.out.println("Numbers must be positive!");
                continue;
            }


            System.out.println("Your number was " + number2);
        }

    }
}
