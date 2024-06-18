package Programmieren1.uebungenVonTagen.uebung1903;

public class zuTamagochi {

    public static void main(String[] args) {

        Tamagochi t1 = new Tamagochi(5, 4, 5);
        do{
            t1.bewegen();
        } while (t1.getX() !=0 || t1.getY() !=0);

}
}
