package Programmieren2.Vererbung;

public class Perser extends Cat {

    private int haarlaenge;

    //Falls es keinen Konstruktor in der Basisklasse gibt, existiert
    // nur der Dafaultkonstruktor(der ist ohne Parameter)

    //Falls es einen Defaultkonstruktor in der Elternklasse gibt (ohne Parameter)
    // dann wird dieser automatisch zu Beginn des Konstruktors aufgerufen
    public Perser(){
        //hier wird der Defaultkonstruktor aufgerufen, falls dieser existiert
        // und kein expliziertes super(...) von uns hingeschrieben wird
        //super(); //jetzt geht es weil er existiert, aber nicht notwendig, weil es schon automatisch übernommmen wird
        haarlaenge = 10;
    }

    public Perser(String name) {
        super(name);
    }
}
