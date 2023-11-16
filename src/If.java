import java.util.Random;

public class If {
    public static void main(String[] args) {
        // Zufallsgenerator erstellen
        Random random = new Random();

        // Zufallszahl zwischen 0 und 100 generieren
        int randomNumber = random.nextInt(101);

        // Ausgabe der Zufallszahl
        System.out.println("Die Zufallszahl ist: " + randomNumber);

        // Wenn die Zahl kleiner ist als 20, gib "Mini" aus
        if (randomNumber < 20) {
            System.out.println("Mini");
        }
        // Wenn die Zahl zwischen 20 und 50 liegt, gib "Medium" aus
        else if (randomNumber >= 20 && randomNumber <= 50) {
            System.out.println("Medium");
        }
        // Wenn die Zahl größer als 50 ist, gib "Large" aus
        else {
            System.out.println("Large");
        }
    }
}
