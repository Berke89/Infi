import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dice Game!");

        int winsOfPlayer = 0;
        int winsOfComputer = 0;
        int draws = 0;

        for (int round = 1; round <= 6; round++) {
            System.out.println("\nRound " + round);

            int playerRoll = rollDie(random);
            int computerRoll = rollDie(random);

            System.out.println("Computer rolled: " + computerRoll);
            System.out.print("Enter your roll (1-6): ");
            int playerInput = scanner.nextInt();

            if (playerInput < 1 || playerInput > 6) {
                System.out.println("Invalid input. You must roll a die between 1 and 6.");
                round--; // Repeat the current round.
                continue;
            }

            System.out.println("You rolled: " + playerInput);

            if (playerRoll > computerRoll) {
                System.out.println("You win this round!");
                winsOfPlayer++;
            } else if (playerRoll < computerRoll) {
                System.out.println("Computer wins this round!");
                winsOfComputer++;
            } else {
                System.out.println("It's a draw!");
                draws++;
            }
        }

        System.out.println("\nGame Over!\nResults:");
        System.out.println("Player Wins: " + winsOfPlayer);
        System.out.println("Computer Wins: " + winsOfComputer);
        System.out.println("Draws: " + draws);

        if (winsOfPlayer > winsOfComputer) {
            System.out.println("Congratulations! You win!");
        } else if (winsOfPlayer < winsOfComputer) {
            System.out.println("Sorry, you lose. Better luck next time!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    private static int rollDie(Random random) {
        return random.nextInt(6) + 1;
    }
}
