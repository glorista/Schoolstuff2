package HAufgaben2;

public class TestGrund {
    public static void main(String[] args) {
        Grundsteuer g1 = new Grundsteuer(); //neues Objekt der Klasse Grundsteuer erstellen

        int[][] grundstuecke={ //neues zweidimensionales Array erstellen, typ,länge,breite
                {1,30,40},
                {2,20,50},
                {3,10,30}
        };

        System.out.println("Summe: "+g1.grundsteuerBerechnen(grundstuecke)); //aufrufen der Methode und berechnung mit den Daten vom Array grundstuecke und Ausgabe

    }
}
