import java.util.Random;

public class If2 {
    public static void main(String[] args) {
        // Zufallsgeneratoren erstellen
        Random random = new Random();

        // Zwei Zufallszahlen zwischen 0 und 100 generieren
        int zahl1 = random.nextInt(101);
        int zahl2 = random.nextInt(101);

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        if (zahl1 < zahl2 && zahl1 < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        if (zahl1 < 30 || zahl2 < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");
        }

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        if (zahl1 < 50 && zahl2 != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
    }
}
