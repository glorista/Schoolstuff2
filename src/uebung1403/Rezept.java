package uebung1403;

import java.util.Arrays;

public class Rezept {
    private String name;
    private String[] zutaten;
    private int anzahlPortionen;
    private double gesamtpreis;

    public String getName() {
        return name;
    }
    public String[] getZutaten() {
        return zutaten;
    }
    public int getAnzahlPortionen(){
        return anzahlPortionen;
    }
    public double getGesamtpreis(){
        return gesamtpreis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZutaten(String[] zutaten) {
        this.zutaten = zutaten;
    }

    public void setAnzahlPortionen(int anzahlPortionen){
        this.anzahlPortionen= anzahlPortionen;
    }

    public void setGesamtpreis(double gesamtpreis){
        this.gesamtpreis = gesamtpreis;
    }
    public Rezept(){

    }

    public Rezept(String name, String[] zutaten, int anzahlPortionen, double gesamtpreis) {
        this.name = name;
        this.zutaten = zutaten;
        this.anzahlPortionen = anzahlPortionen;
        this.gesamtpreis = gesamtpreis;
    }

    @Override
    public String toString() {
        String zutaten ="";
        for (int i = 0; i < this.zutaten.length; i++) {
            zutaten=zutaten.concat(this.zutaten[i]+", ");
        }
        return "Rezept:" +
                "name= '" + name + '\'' +
                ", zutaten= " + zutaten +
                " anzahlPortionen= " + anzahlPortionen +
                ", gesamtpreis= " + gesamtpreis +
                '}';
    }
}
