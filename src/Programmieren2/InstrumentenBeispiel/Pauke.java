package Programmieren2.InstrumentenBeispiel;

public class Pauke extends Instrument{

    public Pauke(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Die Pauke wird geschlagen");
        return lautstaerke;
    }
}
