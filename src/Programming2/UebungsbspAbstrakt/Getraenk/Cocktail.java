package Programming2.UebungsbspAbstrakt.Getraenk;

import java.util.ArrayList;

public class Cocktail extends Getraenk {
    protected ArrayList<Fluessigkeit> bestandteile = new ArrayList<>();

    public Cocktail(String name) {
        super(name);
    }

    @Override
    public boolean brennt() {
        for (Fluessigkeit b:bestandteile) {
            b.getAlkoholProzent();
            if (b.getAlkoholProzent() > 30) {
                return true;
            }
        }
            return false;
    }

    @Override
    public int getAnzahlZutaten() {
        int sum=0;
        for (Fluessigkeit b:bestandteile){
            sum = sum+1;
        }
        return sum;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        for (Fluessigkeit b: bestandteile){
            if(b.getAlkoholProzent()>0){
                return true;
            }
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        double gesamteMenge=0;
        for(Fluessigkeit b: bestandteile){
            gesamteMenge=b.getMenge()+gesamteMenge;
        }
        return gesamteMenge;
    }

    @Override
    public String toString() {
        return "Cocktail:" +
                "name='" + name + '\'' + "Anzahl der Zutaten: "+ getAnzahlZutaten()+ ",\n beinhaltet Alkohol: "+beinhaltetAlkohol()+ ", brennbar:"+brennt();
    }
}
