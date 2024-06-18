package Programmieren2.HasenBeispiel;

public class Osterhase extends Hase {

    public Osterhase(String name, int alter, int karotten) {
        super(name, alter, karotten);
    }

    public void versteckeOstereier(){
        System.out.println("Der Osterhase "+ name + " versteckt jetzt die Ostereier");
    }

    @Override
    public void hoppeln() {
        super.hoppeln();
        System.out.println("Aber mit Ostereier diesmal");
    }
}
