package Programmieren2.uebung2003.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        //erstellung von HashMap
        Map<Integer, String> map = new HashMap<>();

        //add values to HashMap
        map.put(1,"eins");
        map.put(2,"zwei");
        map.put(3,"drei");
        map.put(4,"vier");

        //show values in map, Integer groß weil wir bei Maps und Listen nur mit Objekten arbeiten und hierfür brauchen wir WrapperKlassen
        for (Integer i : map.keySet()){
            System.out.println("Key: "+i+" Value: "+map.get(i));
        }

        //delete values via key
        map.remove(3);

        for (Integer i : map.keySet()){
            System.out.println("Key: "+i+" Value: "+map.get(i));
        }

        //iterate of values
        for(String s: map.values()){
            if(s.contains("r")){ //wenn ein r drinnen ist im value
                System.out.println(s);
            }
        }

        //so kann man eine Liste in eine HashMap einbauen
        Map<String, List<String>> complexMap = new HashMap<>();
    }
}
