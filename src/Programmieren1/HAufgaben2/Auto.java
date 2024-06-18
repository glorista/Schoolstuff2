package Programmieren1.HAufgaben2;

public class Auto {
    private String marke;
    private String modell;
    private int jahr;
    private double geschwindigkeit;

    //konstrukter
    public Auto(String marke, String modell, int jahr) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
    }

    //alle Getter
    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public int getJahr() {
        return jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    //alle setter
    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    //hier wird die Geschwindigkeit um so viel erhöht wie man bei speed eingibt
    public void gasGeben(double speed){
        geschwindigkeit=geschwindigkeit+speed;
    }

    //hier wird die Geschwindigkeit um so viel verringert wie man bei speed eingibt
    public void bremsen(double speed){
        geschwindigkeit=geschwindigkeit-speed;
    }

    //hier befindet sich die Logik somit in der Programmieren1.AllesMoegliche.Main nur mehr die Methode toString aufgerufen werden kann
    @Override
    public String toString() {
        return "Marke: "+getMarke()+", Modell: "+getModell()+", Jahr: "+getJahr()+", Geschwindigkeit; "+getGeschwindigkeit();
    }
}
