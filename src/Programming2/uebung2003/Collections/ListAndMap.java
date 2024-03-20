package Programming2.uebung2003.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListAndMap {
    public static void main(String[] args) {
        //Liste:
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        for (Integer i:integerList) {
            System.out.println(i);
        }

        integerList.remove(2); //löscht den Inhalt vom Index an der Stelle 2 hier also die Zahl 3
        for (Integer i:integerList) {
            System.out.println(i);
        }


        List<String> stringList = new ArrayList<>();
        stringList.add("Hallo");
        stringList.add("das");
        stringList.add("ist");
        stringList.add("toll");

        for (String s: stringList){
            System.out.print(s + " ");
        }

        System.out.println(stringList.size());

    }
}
