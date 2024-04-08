package Programming2.InstrumentenBeispiel;

public class Instrument {
    protected int lautstaerke;

    public int play(){
        return lautstaerke;
    }

    public Instrument(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }


    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }
}
