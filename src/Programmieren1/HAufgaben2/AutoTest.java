package Programmieren1.HAufgaben2;

public class AutoTest {
    public static void main(String[] args) {
        Auto a1 = new Auto("BMW","G30",2020);
        Auto a2 = new Auto("Toyota","Camry",2018);

        a1.gasGeben(100.0); //auto1 beschleunigt um 100km/h
        System.out.println(a1.toString()); //ausgabe der Daten von a1
        a1.bremsen(60.0); //auto1 bremst um 60km/h
        System.out.println(a1.toString()); //ausgabe der Daten von a1 mit neuer Geschwindigkeit
        a2.gasGeben(260.0); //auto2 beschleunigt um 260km/h
        System.out.println(a2.toString()); //ausgabe der Daten von a2
    }
}
