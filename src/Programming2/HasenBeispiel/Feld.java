package Programming2.HasenBeispiel;

public class Feld {
    public static void main(String[] args) {
        Osterhase o = new Osterhase("Herbert");
        Weihnachtshase w = new Weihnachtshase("Schubert");
        Hasenstall h = new Hasenstall();

        o.versteckeOstereier();
        w.verteileGeschenke();
        h.addHase(o);
        h.addHase(w);
        h.alleHasenHoppeln();
        o.fressen("Karotten mit Schokosauce");

        System.out.println("------------");
        h.addHase(new Hase("Bunni"));
        h.hoppelSpecial();
    }
}

