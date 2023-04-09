package RockPaperScissorGame;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {

    public static void main(String[] args) {
        int userWins = 0;
        int computerWins = 0;

        // Repeat loop while either user or computer wins are less than or equal to 2
        while (userWins <= 2 && computerWins <= 2) {
            Scanner input = new Scanner(System.in);
            System.out.print("scissors (0), rock (1), paper (2): ");
            int user = input.nextInt();

            Random rand = new Random();
            int computer = rand.nextInt(3);

            // Determine the winner and update the win count
            if (user == 0 && computer == 1) {
                System.out.println("The computer is rock. You are scissors. You lost, sorry.");
                computerWins++;
            } else if (user == 1 && computer == 0) {
                System.out.println("The computer is scissors. You are rock. You win, congratulations!");
                userWins++;
            } else if (user == 1 && computer == 2) {
                System.out.println("The computer is paper. You are rock. You lost, sorry.");
                computerWins++;
            } else if (user == 2 && computer == 1) {
                System.out.println("The computer is rock. You are paper. You win, congratulations!");
                userWins++;
            } else if (user == 2 && computer == 0) {
                System.out.println("The computer is scissors. You are paper. You lost, sorry.");
                computerWins++;
            } else if (user == 0 && computer == 2) {
                System.out.println("The computer is paper. You are scissors. You win, congratulations!");
                userWins++;
            } else if (user == computer) {
                if (user == 0) {
                    System.out.println("The computer is scissors. You are scissors. It's a draw.");
                } else if (user == 1) {
                    System.out.println("The computer is rock. You are rock. It's a draw.");
                } else {
                    System.out.println("The computer is paper. You are paper. It's a draw.");
                }
            }
        }

        // Print the number of wins for user and computer
        System.out.println("The computer wins " + computerWins + " times.");
        System.out.println("You win " + userWins + " times.");
    }
}