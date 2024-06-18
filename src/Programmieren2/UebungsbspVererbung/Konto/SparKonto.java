package Programmieren2.UebungsbspVererbung.Konto;

public class SparKonto extends Konto{
    public SparKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if(kontostand-wert>=0){
            super.auszahlen(wert);
        }else{
            System.out.println("Konto darf nicht ins negative.");
        }
        return kontostand;
    }
}
