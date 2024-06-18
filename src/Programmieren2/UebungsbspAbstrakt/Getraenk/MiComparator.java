package Programmieren2.UebungsbspAbstrakt.Getraenk;

import java.util.Comparator;

public class MiComparator implements Comparator<Getraenk> {

    //aufsteigend nach ml menge

    @Override
    public int compare(Getraenk o1, Getraenk o2) {
        if(o1.mengeInMl()<o2.mengeInMl()){
            return -1;
        }else if (o1.mengeInMl()>o2.mengeInMl()){
            return 1;
        }
        return 0;
    }
}
