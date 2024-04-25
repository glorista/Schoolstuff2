package Programming2.UebungsbspAbstrakt.Getraenk;

import java.util.ArrayList;
import java.util.List;

public class TestProgramm {
    public static void main(String[] args) {
        Registrierkasse r = new Registrierkasse();


        Fluessigkeit f = new Fluessigkeit("White Cacao Liquor",30.00,12);
        Fluessigkeit f2 = new Fluessigkeit("Milk",40,0);
        Fluessigkeit f3 = new Fluessigkeit("CremedeMenthe",30.00,10);

        Cocktail c = new Cocktail("Grasshopper");
        c.bestandteile.add(f);
        c.bestandteile.add(f2);
        c.bestandteile.add(f3);


        Fluessigkeit f4 = new Fluessigkeit("Vodka",40,40);
        Fluessigkeit f5 = new Fluessigkeit("Coffe Liquor",20,14);
        Fluessigkeit f6 = new Fluessigkeit("Kaffe",40,0);
        Fluessigkeit f7 = new Fluessigkeit("SugarSyrup",10,0);

        Cocktail c2 = new Cocktail("Espresso Martini");
        c2.bestandteile.add(f4);
        c2.bestandteile.add(f5);
        c2.bestandteile.add(f6);
        c2.bestandteile.add(f7);

        r.alleGetraenke.add(c);
        r.alleGetraenke.add(c2);


        System.out.println(r.getGetraenkeAufgeteiltNachZutaten());
        System.out.println("------");
        System.out.println(r.toString());



    }
}
