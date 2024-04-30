package Programming2.UebungsbspVererbung.Konto;

public class MainZuKonto {
    public static void main(String[] args) {
        JugendGiroKonto kgk = new JugendGiroKonto("Carsten",200,505);
        SparKonto sk = new SparKonto("Donald");



        //Erstellen Sie ein Objekt vom JugendGiroKonto und casten Sie dieses in ein Konto
        Konto kk = (Konto) kgk; //up casten man muss die (Konto) nicht machen weil up casten automatisch passiert
        System.out.println(kk.inhaber);
        kk.einzahlen(300);

        kk.auszahlen(501);
        System.out.println(kk.getKontostand());



        Konto nw = kgk;
        System.out.println(kk);

        System.out.println("---------");
        sk.einzahlen(1000);
        sk.auszahlen(1000);
        System.out.println(sk.getKontostand());




    }
}
