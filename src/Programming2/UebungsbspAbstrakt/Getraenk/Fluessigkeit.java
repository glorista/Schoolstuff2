package Programming2.UebungsbspAbstrakt.Getraenk;

public class Fluessigkeit extends Getraenk implements Brennbar{
    private String name;
    private double menge;
    private double alkoholProzent;

    public Fluessigkeit(String name, double menge, double alkoholProzent) {
        super(name);
        this.name =name;
        this.menge = menge;
        this.alkoholProzent = alkoholProzent;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getAnzahlZutaten() {
        return 0;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        return false;
    }

    @Override
    public double mengeInMl() {
        return 0;
    }

    public double getMenge() {
        return menge;
    }

    public double getAlkoholProzent() {
        return alkoholProzent;
    }

    @Override
    public boolean brennt() {
        return false;

    }
}
