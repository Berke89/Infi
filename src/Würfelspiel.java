import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Willkommen beim Würfelspiel!");
        System.out.println("Du spielst gegen den Computer.");

        int spielerPunkte = 0;
        int computerPunkte = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("\nRunde " + i + ":");
            System.out.println("1. Würfeln   2. Beenden");
            System.out.print("Deine Wahl: ");

            int wahl = scanner.nextInt();

            if (wahl == 1) {
                int spielerWurf = wuerfeln();
                int computerWurf = wuerfeln();

                System.out.println("Du hast eine " + spielerWurf + " geworfen.");
                System.out.println("Der Computer hat eine " + computerWurf + " geworfen.");

                spielerPunkte += spielerWurf;
                computerPunkte += computerWurf;
            } else if (wahl == 2) {
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte wähle 1 oder 2.");
                i--; // Runde nicht zählen, da keine gültige Eingabe erfolgt ist
            }
        }

        System.out.println("\nSpiel beendet!");
        System.out.println("Deine Punkte: " + spielerPunkte);
        System.out.println("Computer Punkte: " + computerPunkte);

        if (spielerPunkte > computerPunkte) {
            System.out.println("Herzlichen Glückwunsch! Du hast gewonnen!");
        } else if (spielerPunkte < computerPunkte) {
            System.out.println("Schade! Der Computer hat gewonnen.");
        } else {
            System.out.println("Unentschieden! Es gibt keinen Gewinner.");
        }

        scanner.close();
    }

    private static int wuerfeln() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Würfelergebnis zwischen 1 und 6
    }
}
