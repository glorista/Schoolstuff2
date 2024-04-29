package Programming2.UebungsbspVererbung.Konto;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
    }
    public void einzahlen(double wert){
        kontostand=kontostand+wert;
    }

    public double auszahlen(double wert){
        kontostand=kontostand-wert;
        return kontostand;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
