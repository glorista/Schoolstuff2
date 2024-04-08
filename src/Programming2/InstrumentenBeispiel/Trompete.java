package Programming2.InstrumentenBeispiel;

public class Trompete extends Instrument{

    public Trompete(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Die Trompete wird geblasen.");
        return super.play();
    }
}
