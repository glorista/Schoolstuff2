package Programming2.HasenBeispiel;

import java.util.ArrayList;

public class Hasenstall {

    protected ArrayList<Hase> alleHasen = new ArrayList<>();

    public void addHase(Hase h){
        if(!alleHasen.contains(h)){
        alleHasen.add(h);
        }
    }

    public void alleHasenHoppeln(){
        for (Hase h : alleHasen){
            h.hoppeln();
        }
    }

    //lässt jeden Hasen hoppeln und weihnachtshase zusetzlich Geschenke verteilen und osterhase eier verteilen
    public void hoppelSpecial(){
        //HINWEIS: jeder Hase der in der Liste ist wurde bereits upgecastet sonst könnte er nicht in der Liste sein

        for (Hase h: alleHasen){
            h.hoppeln();
            //liefert uns nur true wenn h ein osterhase oder eine davon abgeleitete Klasse ist
            if(h instanceof Osterhase){
                //hier können wir down casten, weil wir vorher überprüft haben ob h ein osterhase ist
                Osterhase osti =(Osterhase)h;
                osti.versteckeOstereier();
            }
            if( h instanceof Weihnachtshase){
                //hier können wir down casten da wir wissen das h ein Weihnachtshase ist
                Weihnachtshase winti = (Weihnachtshase) h;
                winti.verteileGeschenke();
            }
        }
    }
}
