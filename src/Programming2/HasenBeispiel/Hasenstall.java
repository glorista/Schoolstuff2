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
}
