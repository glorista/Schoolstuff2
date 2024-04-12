package Programming2.UebungsbspAbstrakt.Getraenk;

import java.util.ArrayList;

public class AnzahlZutatenComparator extends Getraenk {


    public AnzahlZutatenComparator(String name) {
        super(name);
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

    @Override
    public boolean brennt() {
        return false;
    }
}
