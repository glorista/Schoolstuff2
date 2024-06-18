package Programmieren2.HashMaps;

import Programmieren2.HasenBeispiel.Hase;
import Programmieren2.HasenBeispiel.Osterhase;
import Programmieren2.HasenBeispiel.Weihnachtshase;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, Hase> register = new HashMap<>();

        Hase h1 = new Hase("Hansi",42,66);
        Hase h2 = new Hase("Susi",22,4);
        Hase h3 = new Osterhase("Mr. Easter",60,50);
        Hase h4 = new Weihnachtshase("Fluffels",120,90);

        register.put(1001,h1);
        register.put(1002,h2);
        register.put(1003,h3);
        register.put(1004,h4);

        //register.put(1001,h4) wert unter diesem Schlüssel wird überschrieben

        //überprüfen ob schlüssel schon in hashmap befindet
        if (register.containsKey(1001)){
            System.out.println("1001 is registered");
        }

        //herauslesen von Wert aus der Hashmap, wenn wir schlüssel kennen
        Hase h =register.get(1002); //h gemacht, weil wir damit noch arbeiten möchten
        if(h != null) {
            System.out.println(h.getName()); // erwarten susi
        }else{
            System.out.println("Gibts net");
        }

        // entfernung von key/value Paars aus der hashmap
        register.remove(1002);

        System.out.println("--------");
        //keyset: wir iterieren klassischerweise über die Schlüssel
        //schlau wenn man den value ändern möchte
        for(Integer hId: register.keySet()){
            Hase ha = register.get(hId); // und mit get können wir uns die einzelnen values/werte
            System.out.println(ha.getName());
        }

        //direkt über hasen objekte iterieren
        for(Hase ha : register.values()){
            System.out.println(ha.getName());
        }


        //Variante 3 bekomme schlüssel und value über entry Objekt
        for(Map.Entry<Integer, Hase> haseEntry: register.entrySet()){
            System.out.println(haseEntry.getKey());
            System.out.println(haseEntry.getValue());
        }






        //nur referenzen noch kein Objekt
        Integer i;
        Float f;

        i= Integer.valueOf(7); //so sollten wir das machen
        i=14; // 14 ist ein primitives int, Integer i ist ein komplexes
        //warum geht das, autoboxing/autounboxing -> wird automatisch umgewandelt

        int y = i;


    }
}
