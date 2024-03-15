package uebung1503;

import java.util.Scanner;

public class Hund {

    private String name;
    private int alter;
    private String rasse;
    private String farbe;

    public Hund(String name, int alter, String rasse, String farbe) {
        this.name = name;
        this.alter = alter;
        this.rasse = rasse;
        this.farbe = farbe;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public String getRasse() {
        return rasse;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void bellen(){
        System.out.println("Wuff Wuff");
    }

    public void stoeckchenBringen(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Kann der Hund das Stöckchen bringen, true oder false");
        String abfrage = scanner.next();

        if (abfrage.toLowerCase().equals("true")){
            System.out.println("Ja, Hund kann Stöckchen bringen");
        } else {
            System.out.println("Nein, Hund kann kein Stöckchen bringen");
        }
    }
}
