public class Kreis {
    public static void main(String[] args) {
        /*objekt k1= new objekt(6);
        System.out.println(k1.radius);
        System.out.println(k1);

         */

        /*Rechteck r= new Rechteck(8,9);
        System.out.println(r);

         */
        /*
        Person p=new Person("Horst","Ehrlich",45);
        System.out.println(p);
        p.neuesHaustier("Hund");
        p.neuesHaustier("Giraffe");
        p.neuesHaustier("Totenkopfäffchen");
        System.out.println(p.anzahlHaustiere());
        p.haustierinfo();

         */

        Lehrveranstaltung lv=new Lehrveranstaltung(5,"Datenbanken");

        for (int i = 1; i <=16 ; i++) {
            lv.neueNote(i);

        }
        System.out.println(lv);
        System.out.println(lv.besteNote());


    }
}
