import java.util.Random;

public class While_Loop {
    public static void main(String[] args) {
        // Zufallsgenerator erstellen
        Random random = new Random();

        // Summe der Zufallszahlen initialisieren
        int summe = 0;

        // Schleife für die Zufallszahlen
        while (true) {
            // Zufallszahl zwischen 10 und 30 generieren
            int zufallszahl = random.nextInt(21) + 10;

            // Zufallszahl zur Summe hinzufügen
            summe += zufallszahl;

            // Ausgabe der generierten Zufallszahl
            System.out.println("Generierte Zufallszahl: " + zufallszahl);

            // Überprüfen, ob die Summe 15 oder 25 erreicht hat
            if (summe == 15 || summe == 25) {
                // Ausgabe der Summe und Programm beenden
                System.out.println("Die Summe der Zufallszahlen ist: " + summe);
                break;
            }
        }
    }
}
