package Programming2.UebungsbspVererbung.Tiere;

import java.util.ArrayList;
import java.util.List;

public class Nature {
    protected List<Animal> alleTiere = new ArrayList<>();

    public void addAnimal(Animal a){
        if(!alleTiere.contains(a)){
            alleTiere.add(a);
        }
    }
    public int countColor(String color){
        int sum=0;
        for (Animal a:alleTiere){
            if(a.color.equals(color)){
                sum++;
            }
        }
        return sum;
    }
}
