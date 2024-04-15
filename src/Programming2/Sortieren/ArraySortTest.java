package Programming2.Sortieren;


import Programming2.Vererbung.Dog;
import Programming2.Vererbung.DogAgeComperator;
import Programming2.Vererbung.DogAgeNameComparator;
import Programming2.Vererbung.DogNameComparator;

import java.util.*;

public class ArraySortTest {
    public static void main(String[] args) {
        int[] zahli = {1,2,77,3};
        System.out.println(Arrays.toString(zahli));

        for (int zahl:zahli){
            System.out.println(zahl);
        }

        //Hilfsmethoden zum sortieren
        Arrays.sort(zahli);
        System.out.println(Arrays.toString(zahli));


        String [] stringi ={"Hansi","Anna","Tina","Tom","Steffi"};

        Arrays.sort(stringi);
        System.out.println(Arrays.toString(stringi));

        //Geht das auch mit eigenen Objekten
        //nein noch nicht da Java nicht weiß wie wir Hunde sortieren möchten
        Dog[] dogs ={new Dog("Hansi",6), new Dog("Schnuffels",4)};
        Arrays.sort(dogs); //geht noch nicht
        System.out.println(Arrays.toString(dogs));

        String hansi = "Hansi";
        String anna = "Anna";

        //hansi ruft methode compare to auf,ist in der Ausführung dieser Methode das this objekt-anna ist erster parameter
        hansi.compareTo(anna);
        System.out.println(hansi.compareTo(anna));


        //in collections ist das genauso möglich wie bei hunden
        List<Dog> dogslist = new ArrayList<>();

        dogslist.add(new Dog("Hansi",3));
        dogslist.add(new Dog("Snuffels",4));

        //sortieren mit collections
        Collections.sort(dogslist);
        System.out.println(dogslist);

        //comparator testen, groß klein von Strings wichtig sonst ist arnold zb ganz hinten und Arnold ganz vorne
        dogslist.add(new Dog("Arnold",6));
        System.out.println("------------");
        System.out.println("Comparatortest");
        Collections.sort(dogslist, new DogNameComparator());

        System.out.println(dogslist);


        System.out.println("*** Comparator Age(aufsteigend) ***");
        dogslist.add(new Dog("Puppy",0));

        Collections.sort(dogslist,new DogAgeComperator());
        System.out.println(dogslist);

        System.out.println("----------------");

        //umgekehrt sortieren, wir können einen reversed Comparator holen
        Collections.sort(dogslist,new DogAgeComperator().reversed());
        System.out.println(dogslist);

        System.out.println("----------");


        dogslist.add(new Dog("Arabella",0));
        Collections.sort(dogslist, new DogAgeNameComparator());
        System.out.println(dogslist);




    }


}
