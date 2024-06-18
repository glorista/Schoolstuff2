package Programmieren1.AllesMoegliche;

public class Kreis {
    public static void main(String[] args) {
        /*Programmieren1.AllesMoegliche.objekt k1= new Programmieren1.AllesMoegliche.objekt(6);
        System.out.println(k1.radius);
        System.out.println(k1);

         */

        /*Programmieren1.AllesMoegliche.Rechteck r= new Programmieren1.AllesMoegliche.Rechteck(8,9);
        System.out.println(r);

         */
        /*
        Programmieren1.AllesMoegliche.Person p=new Programmieren1.AllesMoegliche.Person("Horst","Ehrlich",45);
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
