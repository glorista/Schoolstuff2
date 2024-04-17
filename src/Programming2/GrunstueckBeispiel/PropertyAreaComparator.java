package Programming2.GrunstueckBeispiel;

import java.util.Comparator;

public class PropertyAreaComparator implements Comparator<Property> { //hier Comparator in Property selber Comparable wenn man nur eine methode zum sortieren brauchen


    //absteigend nach area sortieren
    @Override
    public int compare(Property o1, Property o2) {
        if(o1.getArea()< o2.getArea()){ //wenn o1 kleiner ist zb 10 als o2 zb 20 dann will ich wenns absteigend dargestellt werden soll (also vom größten zum kleinsten)
            // das o1 hinter dem o2 stehen daher soll das return Positiv
            return 1;
        }
        if(o1.getArea()>o2.getArea()){
            return -1;
        }
        return 0;

    }






}
