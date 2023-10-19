import java.util.Random;

public class Loop {
    public static void main(String[] args) {
        // Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen
        Random random = new Random();
        int randomNumber = random.nextInt(5 );
        int gesamt = 0;

        // For Schleife
        // DRY. Dont repeat yourself
        for (int i=0;i<101;i=i+1){
            gesamt = gesamt + i;
            System.out.println(gesamt);
        }

    }
}
