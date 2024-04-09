package Programming2.InstrumentenBeispiel;

public class Piano extends Instrument{

    public Piano(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Das Piano wird gespielt");
        return lautstaerke;
    }

}
