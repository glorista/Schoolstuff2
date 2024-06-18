package Programmieren2.UebungVergleichen.Kindergarten;

import java.util.Collections;

public class MainZuKindergarten {
    public static void main(String[] args) {
        Kind k1 = new Kind("Hansi","Baum",5);
        Kind k2 = new Kind("Harald","Baum",2);
        Kind k3 = new Kind("Birgit","Faul",4);
        Kind k4 = new Kind("Kerstin","Laut",4);

        Kindergarten kg = new Kindergarten("Fisch");
        kg.addKind(k1);
        kg.addKind(k2);
        kg.addKind(k3);
        kg.addKind(k4);

        Collections.sort(kg.getKinder(),new AlphabeticalComparator());
        System.out.println(kg.getKinder());

        Collections.sort(kg.getKinder(),new AgeComparator());
        System.out.println(kg.getKinder());

    }
}
