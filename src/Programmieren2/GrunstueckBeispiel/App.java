package Programmieren2.GrunstueckBeispiel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {


        List<Property> properties = new ArrayList<>();
        properties.add(new Property("Hansi",100));
        properties.add(new Property("Barbara",1000));
        properties.add(new Property("Susi",639));
        properties.add(new Property("Frank",58.1));


        //es wird direkt in Collection sortiert
        //für arrays verwenden wir Arrays.sort()
        //absteigend
        Collections.sort(properties, new PropertyAreaComparator()); // benutzt die methode aus der Klasse PropertyAreaComparator also den Comparator
        System.out.println(properties);

        System.out.println("-----------");

        //aufsteigend
        Collections.sort(properties); // benutzt die Menthode aus Property den Comparable
        System.out.println(properties);

        System.out.println("-------------");

        //absteigend aber durch reversed aufsteigend
        Collections.sort(properties, new PropertyAreaComparator().reversed());
        System.out.println(properties);


        //exkurs ?: Operator "kurz geschreibenes if"
        int x = 5;
        int y = (x<10) ? 2:1; //x<10 ist der if teil, ? Anweisung falls true,  : Anweisung falls false ist

        //das ist das selbe
        if(x<10){
            y=2;
        }else{
            y=1;
        }
    }
}
