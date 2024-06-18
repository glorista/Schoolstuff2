package Programmieren2.UebungsbspAbstrakt.Getraenk;

import java.util.Comparator;

public class AnzahlZutatenComparator implements Comparator<Getraenk> {


    //aufsteigend nach anzahl der zutaten

    @Override
    public int compare(Getraenk o1, Getraenk o2) {
        if(o1.getAnzahlZutaten()>o2.getAnzahlZutaten()){
            return 1;
        } else if (o1.getAnzahlZutaten()<o2.getAnzahlZutaten()) {
            return -1;
        }
        return 0;
    }
}
