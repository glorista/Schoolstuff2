package Programming2.UebungsbspVererbung.Tiere;

public class DemoAnwendung {
    public static void main(String[] args) {
        Frog quaxi = new Frog("grün",2);
        Animal quaxiAsAnimal = quaxi;
        Animal quaxi1 = (Frog) quaxiAsAnimal;
        Dog d = new Dog("braun",2,"Doggo");
        d.makeNoise();
        d.walk();

        Lion l = new Lion("grün",4);

        Nature n = new Nature();
        n.addAnimal(l);
        n.addAnimal(quaxi);
        System.out.println(n.countColor("grün"));

    }
}
