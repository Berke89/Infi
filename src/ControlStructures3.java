package at.ran.basics;

import java.util.Random;
public class ControlStructures3 {
    public static void main (String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random ();
        int randomNumber = random.nextInt(100);

        if ((randomNumber>50) && (randomNumber<90)){

        } else if (randomNumber<10){

        } else {
        }

        // Gib die Zufallszahl aus


        // Wenn die Zahl kleiner ist als 20 gib aus "Mini"
        // Wenn die Zahl zw. 20 und 50 ist gib "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"
    }
}
