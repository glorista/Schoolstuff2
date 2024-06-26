package Programmieren2.UebungsbspAbstrakt.Getraenk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Registrierkasse {
    protected ArrayList<Getraenk> alleGetraenke = new ArrayList<>();
    private static int verkaufteGetraenke;

    public Registrierkasse(){
        verkaufteGetraenke=0;
    }


    public static int getVerkaufteGetraenke() {
        return verkaufteGetraenke;
    }

    public static void setVerkaufteGetraenke(int verkaufteGetraenke) {
        Registrierkasse.verkaufteGetraenke = verkaufteGetraenke;
    }

    public void verkauft(Getraenk g) {

        if (!alleGetraenke.contains(g)) {
            alleGetraenke.add(g);
            verkaufteGetraenke++;
        }

    }

    public void printGetraenkSortiertNachAnzahlZutaten() {
        Collections.sort(alleGetraenke, new AnzahlZutatenComparator());
        System.out.println(alleGetraenke);
    }

    public void printGetraenkeSortiertNachMl(){
        Collections.sort(alleGetraenke, new MiComparator());
        System.out.println(alleGetraenke);
    }

    public HashMap<Integer,ArrayList<Getraenk>> getGetraenkeAufgeteiltNachZutaten(){
        HashMap<Integer,ArrayList<Getraenk>> alleAlleGetraenke = new HashMap<>();

        for (Getraenk g:alleGetraenke){

            int anzahl=g.getAnzahlZutaten();

            if(alleAlleGetraenke.containsKey(anzahl)){

               alleAlleGetraenke.get(anzahl).add(g);

            }else{
                ArrayList<Getraenk> hansi = new ArrayList<>();
                // getränk hinzufügen hinzufügen
                //
                hansi.add(g);
                alleAlleGetraenke.put(anzahl,hansi);
            }
        }
        return alleAlleGetraenke;
    }

    @Override
    public String toString() {
        return "Registrierkasse{" +
                "alleGetraenke=" + alleGetraenke +
                '}';
    }
}
