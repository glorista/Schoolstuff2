package Programmieren2.InstrumentenBeispiel;

public class Gitarre extends Instrument {

    public Gitarre(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Gittare wird gespielt");
        return lautstaerke;
    }
}
