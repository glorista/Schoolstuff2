package HAufgaben2;

public class Auto {
    private String marke;
    private String modell;
    private int jahr;
    private double geschwindigkeit;

    public Auto(String marke, String modell, int jahr) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
    }

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

    public void gasGeben(double speed){
        geschwindigkeit=geschwindigkeit+speed;
    }

    public void bremsen(double speed){
        geschwindigkeit=geschwindigkeit-speed;
    }

    @Override
    public String toString() {
        return "Marke: "+getMarke()+", Modell: "+getModell()+", Jahr: "+getJahr()+", Geschwindigkeit; "+getGeschwindigkeit();
    }
}
