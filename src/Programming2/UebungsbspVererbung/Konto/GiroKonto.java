package Programming2.UebungsbspVererbung.Konto;

public class GiroKonto extends Konto {
    protected double limit;

    public GiroKonto(String inhaber,double limit) {
        super(inhaber);
        this.limit=limit;
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if(kontostand-wert <0-limit){
            kontostand=kontostand-wert;
        }else{
            System.out.println("Limit wird überschritten");
        }
        return kontostand;
    }
}
