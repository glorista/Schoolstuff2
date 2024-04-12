package Programming2.UebungsbspVererbung.Tiere;

public class Lion extends Animal{
    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Der Löwe stolziert davon.");
    }

    @Override
    public void makeNoise() {
        roar();
    }

    public void roar(){
        System.out.println("Roar, roar macht der Löwe");
    }
}
