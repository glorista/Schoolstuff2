package uebungenVonTagen.uebung1403;

import java.util.Arrays;

public class zuRezept {

    public static void main(String[] args) {
        Rezept r1= new Rezept();
        r1.setName("Nudeln");
        System.out.println(r1.getName());
        r1.setZutaten(new String[]{"Fusilie","Salz"});
        System.out.println(Arrays.toString(r1.getZutaten()));
        r1.setAnzahlPortionen(5);
        System.out.println(r1.getAnzahlPortionen());
        r1.setGesamtpreis(25.4);
        System.out.println(r1.getGesamtpreis());

        Rezept r2= new Rezept();
        r2.setName("Kuchen");
        System.out.println(r2.getName());
        r2.setZutaten(new String[]{"Mehl","Zucker","Salz","Milch","Eier"});
        System.out.println(Arrays.toString(r2.getZutaten()));
        r2.setAnzahlPortionen(6);
        System.out.println(r2.getAnzahlPortionen());
        r2.setGesamtpreis(16.50);
        System.out.println(r2.getGesamtpreis());

        System.out.println();
        System.out.println(r1.toString());

        Rezept r3=new Rezept();



    }
}
