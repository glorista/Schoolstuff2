package uebungenVonTagen.uebung1103;

public class Spielerverwaltung {
    private Player[] player;

    public Spielerverwaltung() {
        this.player = new Player[5];
    }
    public void neuerPlayer(Player player){
        for (int i = 0; i < this.player.length; i++) {
            if (this.player[i] ==null){
                this.player[i] = player;
                break;
            }

        }

    }
    public Player bestPlayer() {
        Player p = player[0];
        for (int i = 0; i < player.length; i++) {
            if (player[i].getPunkte() > p.getPunkte()){
                p=player[i];
                break;
            }

        }
        return p;
    }
}

