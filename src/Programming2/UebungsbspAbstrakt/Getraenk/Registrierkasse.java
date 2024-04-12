package Programming2.UebungsbspAbstrakt.Getraenk;

import java.util.ArrayList;

public class Registrierkasse {
    private ArrayList<Getraenk> alleGetraenke = new ArrayList<>();
    private static int verkaufteGetraenke;


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
        System.out.println();
    }

    public void printGetraenkeSortiertNachMl(){
        System.out.println();
    }
}
