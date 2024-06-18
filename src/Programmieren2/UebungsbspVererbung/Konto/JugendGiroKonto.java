package Programmieren2.UebungsbspVererbung.Konto;

public class JugendGiroKonto extends GiroKonto {

    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if (wert < buchungslimit) {
            if (kontostand - wert > 0 - limit) {
                kontostand=kontostand-wert;
            }else{
                System.out.println("Limit wird überschritten");
            }
        }else{
            System.out.println("Buchungslimit wird überschritten");
        }
        return kontostand;
    }

    @Override
    public String toString() {
        return "JugendGiroKonto{" +
                "buchungslimit=" + buchungslimit +
                ", limit=" + limit +
                ", inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}

