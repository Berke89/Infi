package oop;

import java.util.ArrayList;

public class Serie {
        private String Plattform;
        private String Bewertung;
        private int AnzahlStaffel;

        public String Plattform() {
            return Plattform;
        }



        private ArrayList<Schauspieler> Schauspilerliste;

        public Serie(String Plattform, String Bewertung, int AnzahlStaffel) {
            this.Plattform= Plattform;
            this.Bewertung = Bewertung;
            this.AnzahlStaffel = AnzahlStaffel;
            this.Schauspilerliste= new ArrayList<>();
        }

        public String getPlattform() {
            return Plattform;
        }

        public void setPlattform(String Plattform) {
            this.Plattform = Plattform;
        }

        public String getBewertung() {
            return Bewertung;
        }

        public void setBewertung(String Bewertung) {
            this.Bewertung = Bewertung;
        }

        public int getANzahlStaffel() {
            return AnzahlStaffel;
        }

        public void setANzahlStaffel(int AnzahlStaffel) {
            this.AnzahlStaffel = AnzahlStaffel;
        }
        public void getInfo() {
            System.out.println("Bewertung: "+ this.Bewertung +
                    "\nPlattform:" + this.Plattform + "\nAnzahl der Zimmer:" + this.AnzahlStaffel);
        }
        public void addSchauspilerliste (Schauspieler Schauspiler){
            if (Schauspilerliste.size() >= this.Schauspiler)
        }
        public void getSchauspielerInSerie () {
            for (Schauspieler k: Schauspilerliste) {
                k.getInfo();
            }

        }
    }

