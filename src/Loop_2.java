import java.util.Random;
public class Loop_2 {
    public static void main(String[] args) {
        // Zähle die geraden Ziffern zwischen 1 und 1000 zusammen - Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.
        Random random = new Random ();
        int randomNumber = random.nextInt(5 );
        int gesamt = 0;

        // For Schleife
        // DRY. Dont repeat yourself
        for (int i=2;i<1000;i=i+2){
           gesamt = gesamt + i;
            System.out.println(gesamt);
        }
    }
}
