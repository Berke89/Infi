package oop;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Katze> mKatzenListe = new ArrayList();
        Katze katze = new Katze ();
        String [] charListe = {"bösartig","gutartig","hinterhältig","lustig","schmusig","lieblich","fotzig"};
        String [] nameListe = {"Julia","Berke","Elias","Elija","Nathanael","Ani","Jacob"};
        String [] farbeListe = {"braun","schwarz","grau","weiß","karriert"};
        String [] oberListe = {"glatt","kurzhaar","rau","samtig","weich","flaushig"};

        for (int i = 1; i<100;i++) {
            //int randomNumber = random.nextInt(max + 1 - min) + min;
            int ci = r.nextInt(charListe.length - 1 -0) + 0;
            int ni = r.nextInt(nameListe.length - 1 -0) + 0;
            int fi = r.nextInt(farbeListe.length - 1 -0) + 0;
            int oi = r.nextInt(oberListe.length - 1 -0) + 0;
            int ai = r.nextInt(25 - 1 -0) + 0;
            mKatzenListe.add(new katze(charListe[0],"nette","weich",6,"weiß","Snow"));
        }
        katze.setAlter(2);
        katze.setCharakter("bösartig");
        katze.setFarbe("karriert");
        katze.setOberflaechenbeschaffenheit("flauschig");
        katze.setName("Mitzi");

        Katze katze2 = new Katze ("nette","weich",6,"weiß","Snow");
        mKatzenListe.add(katze2);

        //System.out.println("Meine Katze "+katze.getName() + " ist " + katze.getAlter() + " Jahre alt!");
        for (Katze k : mKatzenListe){
            System.out.println("Meine Katze "+k.getName() + " ist " + k.getAlter() + " Jahre alt!"+k.getCharakter() +" "+k.getFarbe()+" "+k.getOberflaechenbeschaffenheit());
        }

    }
}
