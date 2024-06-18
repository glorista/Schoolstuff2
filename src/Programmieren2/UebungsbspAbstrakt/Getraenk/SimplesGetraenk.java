package Programmieren2.UebungsbspAbstrakt.Getraenk;

public class SimplesGetraenk extends Getraenk{

    protected Fluessigkeit bestandteil;

    public SimplesGetraenk(String name, Fluessigkeit bestandteil) {
        super(name);
        this.bestandteil = bestandteil;
    }

    @Override
    public boolean brennt() {
            if(bestandteil.getAlkoholProzent()>30){
                return true;
            }
            return false;
    }

    @Override
    public int getAnzahlZutaten() {
        return 1;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        if(bestandteil.getAlkoholProzent()>30){
            return true;
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        return bestandteil.getMenge();
    }

    @Override
    public String toString() {
        return "SimplesGetraenk: " + "name=" + name + "\n Anzahl Zutaten" + getAnzahlZutaten()+", alkoholisch: "+beinhaltetAlkohol()+ ", brennbar: "+brennt();
    }
}
