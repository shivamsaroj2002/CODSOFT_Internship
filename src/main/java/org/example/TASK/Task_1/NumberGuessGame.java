package org.example.TASK.Task_1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        boolean playAgain = true;

        while (playAgain) {
            int attempts = getAttemptsFromUser(scanner);
            int randomNumber = random.nextInt(100) + 1;
            int score = playRound(scanner, randomNumber, attempts);

            System.out.println("Score for this round: " + score);
            totalScore += score;

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAnotherRound = scanner.next().toLowerCase();

            if (!playAnotherRound.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Total Score: " + totalScore);
        System.out.println("Thanks for playing!");
    }

    private static int getAttemptsFromUser(Scanner scanner) {
        System.out.print("Enter the number of attempts for this round: ");
        return scanner.nextInt();
    }

    private static int playRound(Scanner scanner, int randomNumber, int attempts) {
        int attemptCount = 0;

        while (attemptCount < attempts) {
            System.out.print("Guess the number (between 1 and 100): ");
            int userGuess = scanner.nextInt();
            attemptCount++;

            if (userGuess == randomNumber) {
                System.out.println("Correct! It took you " + attemptCount + " attempts.");
                return 10;
            } else if(userGuess > randomNumber){
                System.out.println("your guess is too high");
            }
            else{
                System.out.println("Your guess is too low");
            }
        }
        System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + randomNumber);
        return 0;
    }
}
