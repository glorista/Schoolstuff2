package uebungenVonTagen.uebung1103;

public class zuPlayer {
    public static void main(String[] args) {
        Player p1 =new Player("Sam");
        p1.neuerOrt("graz");
        p1.gewonnen(20);
        Spielerverwaltung spielerverwaltung= new Spielerverwaltung();
        spielerverwaltung.neuerPlayer(p1);
    }
}
