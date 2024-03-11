package uebung1103;

public class Player {

    //attribute
    private String name;
    private int punkte;

    private String[] spieleOrte;

    //constructer
    public Player(String name) {
        this.name = name;
        this.spieleOrte= new String[5];
    }

    public void neuerOrt(String ort){
        for (int i = 0; i < spieleOrte.length; i++) {
            if(spieleOrte[i] == null){
                spieleOrte[i]= ort;
                break;
            }

        }
    }

    public void gewonnen(int p){
        punkte +=p; //das gleiche wie punkte=punkte+p
    }
}
