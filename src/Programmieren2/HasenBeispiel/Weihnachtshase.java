package Programmieren2.HasenBeispiel;

public class Weihnachtshase extends Hase{


    public Weihnachtshase(String name, int alter, int karotten) {
        super(name, alter, karotten);
    }

    public void verteileGeschenke(){
        System.out.println("Der Weihnachtshase "+ name + " verteilt jetzt Geschenke");
    }

}
