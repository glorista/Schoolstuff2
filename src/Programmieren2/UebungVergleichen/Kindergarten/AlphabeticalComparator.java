package Programmieren2.UebungVergleichen.Kindergarten;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Kind> {
    @Override
    public int compare(Kind o1, Kind o2) {
        if(o1.getZname().compareTo(o2.getZname())==0){ //speichert ja im hintergrun eine Zahl für den String daher == okay (==0 heißt ja gleich)
            return o1.getVname().compareTo(o2.getVname()); //wenn zname gleich dann mit vorname schauen
        }else{
            return o1.getZname().compareTo(o2.getZname());
        }

    }
}
