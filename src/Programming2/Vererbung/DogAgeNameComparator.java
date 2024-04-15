package Programming2.Vererbung;

import java.util.Comparator;

public class DogAgeNameComparator implements Comparator<Dog> {

    //ganz oft wollen wir auf basis mehrere Attribute sortieren
    //hier zuerst nach Alter (aufsteigend) falls gleich dann nach Name (aufsteigend)

    @Override
    public int compare(Dog o1, Dog o2) {
        int cmp= Integer.compare(o1.getAlter(), o2.getAlter());
        if(cmp != 0) { //alter unterscheidlich, müssen wir namen nicht berücksichtigen
            return cmp;
        }
        //falls alter gleich wäre
        return o1.getName().compareTo(o2.getName());
    }
}
