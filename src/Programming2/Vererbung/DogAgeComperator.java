package Programming2.Vererbung;

import java.util.Comparator;

public class DogAgeComperator implements Comparator<Dog> {


    //andere Art nach alter zu sortieren hier aufsteigend
    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.getAlter(), o2.getAlter());
    }
}
