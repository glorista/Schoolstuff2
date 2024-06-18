package Programmieren2.uebung2003.Generics;

public class MainZuFruits {
    public static void main(String[] args) {
        //das hier alles ist unnötig wenn ich einen GenericPrinter benutze
//        StringPrinter stringPrinter = new StringPrinter();
//        IntPrinter intPrinter = new IntPrinter();
//        DoublePrinter doublePrinter = new DoublePrinter();
//        FruitPrinter fruitPrinter = new FruitPrinter();
//
//        stringPrinter.print("Print me");
//        intPrinter.print(123);
//        doublePrinter.print(1.234);
//        fruitPrinter.print(new Fruit(Color.ORANGE, "Orange",12));


        //hier String damit er weiß welcher Datentyp
        //hier muss man jetzt in den <> eine WrapperKlasse benutzen da Java sich sonst beschwert da es eine Typensicherheit gibt
        //die Klasse GenericPrinter vereinfacht und wie müssen nicht 4 andere Klassen schreiben wie StringPrinter,... diese könnte man jetzt löschen
        GenericPrinter<String> stringPrinter = new GenericPrinter<>();
        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>();
        GenericPrinter<Double> doublePrinter = new GenericPrinter<>();
        GenericPrinter<Fruit> fruitPrinter = new GenericPrinter<>();

        stringPrinter.print("Print me");
        integerPrinter.print(123);
        doublePrinter.print(12.4);
        fruitPrinter.print(new Fruit(Color.ORANGE, "orange",17));
    }
}
