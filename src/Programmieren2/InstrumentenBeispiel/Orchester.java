package Programmieren2.InstrumentenBeispiel;

import java.util.ArrayList;

public class Orchester {
    protected ArrayList<Instrument> alle = new ArrayList<>();


    public void addInstrument(Instrument i){
        if(!alle.contains(i)){
            alle.add(i);
        }
    }
    public int playAll(){
        int sum = 0;
        for(Instrument i:alle){
            i.play();
            sum = i.getLautstaerke()+sum;
        }
        System.out.println("Die Lautstärke alle Instrumente beträgt: "+ sum);
        return sum;
    }

}
