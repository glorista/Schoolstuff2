package Programming2.UebungsbspVererbung.Tiere;

public class DemoAnwendung {
    public static void main(String[] args) {
        Frog quaxi = new Frog("grün",2);
        Animal quaxiAsAnimal = quaxi;
        Animal quaxi1 = (Frog) quaxiAsAnimal;
        Dog d = new Dog("braun",2,"Doggo");
        d.makeNoise();
        d.walk();

    }
}
