package Programming2.UebungsbspVererbung.Tiere;

public class Cat extends Animal {

    protected String name;

    public Cat(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Die Katze schleicht davon.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau, Miau macht die Katze!");
    }
}
