package Programming2.UebungsbspVererbung.Tiere;

public class Frog extends Animal {
    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Jump, Jump und der Frosch ist weg!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Quak, Quak macht der Frosch!");
    }
}
