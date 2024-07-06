import java.util.Scanner;
import java.util.Random;

public class guessgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        boolean play = true;
        int totalRounds = 0;
        int totalScore = 0;

        while (play) {
            totalRounds++;
            int attempts = 0;
            int max = 10;

            int randomNumber = rd.nextInt(100) + 1;
            boolean hasWon = false;

            System.out.println(
                    "Round " + totalRounds + ": Guess a number between 1 and 100. You have " + max + " attempts");

            while (attempts < max) {
                System.out.print("enter your guess:");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Correct! guessed the number in " + attempts + " attempts");
                    totalScore += (max - attempts + 1);
                    hasWon = true;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println(" LOW!");
                } else {
                    System.out.println("HIGH!");
                }

                System.out.println("Attempts left:" + (max - attempts));
            }

            if (!hasWon) {
                System.out.println("Game over:( The correct number was " + randomNumber);
            }

            System.out.print("Do you wanna play again? (yes/no): ");
            String response = sc.next();
            play = response.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! You played " + totalRounds + " rounds");
        System.out.println("Your total score is: " + totalScore);
        sc.close();
    }
}
