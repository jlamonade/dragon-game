package com.company;
import java.util.Scanner;
import java.lang.Exception;

public class Main {

    public static void dragonGame(int choice) {
        if (choice == 1) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        } else if (choice == 2) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumped out in front of you! He reaches into his pocket and...");
            System.out.println("Gives you some of his gold coins!");
        }
    }

    public static int getChoice() throws Exception {
        Scanner getInput = new Scanner(System.in);
        try {
            return getInput.nextInt();
        } catch (Exception e) {
            throw new Exception("Caught Exception: Incorrect Input");
        }
    }

    public static void main(String[] args) throws Exception {
	// write your code here
        System.out.println("You are in a land of dragons. In front of you, you see two caves. " +
                "In one cave, the dragon is friendly and will share his treasure with you. The other " +
                "dragon is greedy and hungry and will eat you on sight. Which cave will you go into? (1 or 2)");

        int input = getChoice();

        while (input != 2 && input != 1) {
            System.out.println("Please enter a valid input...");
            System.out.println("Which cave will you go into? (1 or 2)");
            input = getChoice();
        }
        dragonGame(input);
    }
}
