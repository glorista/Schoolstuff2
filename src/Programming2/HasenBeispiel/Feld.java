package Programming2.HasenBeispiel;

import java.util.Collections;

public class Feld {
    public static void main(String[] args) {
        Osterhase o = new Osterhase("Herbert",50,30);
        Weihnachtshase w = new Weihnachtshase("Schubert",100,4);
        Hasenstall h = new Hasenstall();

        o.versteckeOstereier();
        w.verteileGeschenke();
        h.addHase(o);
        h.addHase(w);
        h.alleHasenHoppeln();
        o.fressen("Karotten mit Schokosauce");

        System.out.println("------------");
        h.addHase(new Hase("Bunni",12,6));
        h.hoppelSpecial();

        h.addHase(new Hase("Bugs",12,58));

        System.out.println("------");

        Collections.sort(h.alleHasen,new HaseAgeComparator().reversed());
        System.out.println(h.alleHasen);



    }
}

