package Programmieren1.uebungenVonTagen.uebung1503;

public class TeilnehmerMain {
    public static void main(String[] args) {

        Teilnehmer t1 =new Teilnehmer("Gloria",22,"Graz");

        System.out.println(t1.getName());
        t1.ausgabeFragenCounter();
        t1.hatFrageGestellt();
        System.out.println(t1.ausgabeFragenCounter());
        t1.teilnehmerInfo();
    }
}
