package Programming2.UebungsbspAbstrakt.Getraenk;

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
        return false;
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
}
