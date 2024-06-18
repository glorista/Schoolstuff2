package Programmieren2.UebungsbspAbstrakt.Getraenk;

public class LongDrink extends Getraenk{

    protected Fluessigkeit spirituose;
    protected Fluessigkeit filler;

    public LongDrink(String name, Fluessigkeit spirituose, Fluessigkeit filler) {
        super(name);
        this.spirituose = spirituose;
        this.filler = filler;
    }

    @Override
    public boolean brennt() {
       if(spirituose.getAlkoholProzent()>30 || filler.getAlkoholProzent()>30){
           return true;
       }else {
           return false;
       }
    }

    @Override
    public int getAnzahlZutaten() {
        return 2;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        if(spirituose.getAlkoholProzent()>0 || filler.getAlkoholProzent()>0){
            return true;
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        return spirituose.getMenge()+ filler.getMenge();
    }

    @Override
    public String toString() {
        return "LongDrink: "+" Name: "+name + " Anzahl der Zutaten: "+getAnzahlZutaten()+", alkoholisch: "+beinhaltetAlkohol()+ ", brennbar: "+brennt();

    }
}
