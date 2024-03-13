package HAufgaben;

public class HAufgabe5 {
    public static void main(String[] args) {
        Unterkunft unterkunft=new Unterkunft(10,2,"standard");

        System.out.println("Der Preis pro Bett ist: "+unterkunft.preisProBett());
        System.out.println("Der Preis pro Unterkunft beträgt: "+unterkunft.preisProUnterkunft());
        System.out.println("Preis pro Buchung (20 Betten): "+unterkunft.preisProBuchung(20));
        unterkunft.bucheBetten(20);
        System.out.println("Freie Betten: "+unterkunft.freieBetten());
        unterkunft.ausgebucht();
        unterkunft.bucheBetten(1);


    }
}
