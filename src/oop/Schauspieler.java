package oop;

public class Schauspieler {
    private String Sexualität;
    private int alter;
    private String genre;
    private String name;
    public Schauspieler() {
    }

    public Schauspieler(String name, int alter, String genre, String sexualität) {
        this.name = name;
        this.alter = alter;
        this.genre = genre;
        this.Sexualität = Sexualität;

    }
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    public int getalter() {
        return alter;
    }

    public void setalter(int alter) {
        this.alter = alter;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSexualität() {
        return Sexualität;
    }

    public void setSexualität(String Sexualität) {
        this.Sexualität = Sexualität;
    }

    public void getInfo (){
        System.out.println("Name des Schauspilers" + this.name + "Alter: " + this.alter + "Hauptgenre: " +
                this.genre + "Sexualität des Schauspilers: " + this.Sexualität);
    }
}