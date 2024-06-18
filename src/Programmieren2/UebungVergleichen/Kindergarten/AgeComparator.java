package Programmieren2.UebungVergleichen.Kindergarten;

import java.util.Comparator;

public class AgeComparator implements Comparator<Kind> {

    //absteigend
    @Override
    public int compare(Kind o1, Kind o2) {
        if(o1.getAge()<o2.getAge()){
            return 1;
        }else if(o1.getAge()>o2.getAge()){
            return -1;
        }
        return 0;
    }
}
