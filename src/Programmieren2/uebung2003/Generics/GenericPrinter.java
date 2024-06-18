package Programmieren2.uebung2003.Generics;
//Großes T zeigt Java das es generic sein soll
public class GenericPrinter<T> {

    public void print(T thingToPrint){
        System.out.println(thingToPrint);
    }
}
