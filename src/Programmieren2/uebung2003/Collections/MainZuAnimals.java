package Programmieren2.uebung2003.Collections;

import java.util.ArrayList;
import java.util.List;

public class MainZuAnimals {
    public static void main(String[] args) {
        //typ Animal weil das der Typ ist da dieser zuerst reingeschrieben wird
        List<Animal> stringListe = new ArrayList<>();
        stringListe.add(new Animal("Hopper","Hase",AnimalType.MAMMAL));
        stringListe.add(new Animal("Henke","Schlange",AnimalType.REPTILE));
        stringListe.add(new Animal("Boris","Pferd",AnimalType.MAMMAL));
        stringListe.add(new Animal("Blubb","Fisch",AnimalType.FISH));
        stringListe.add(new Animal("Werner","Taube",AnimalType.BIRD));

        for (Animal a: stringListe){
            System.out.println(a);
        }
    }
}
