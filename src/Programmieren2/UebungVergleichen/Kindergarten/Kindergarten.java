package Programmieren2.UebungVergleichen.Kindergarten;

import java.util.ArrayList;
import java.util.List;

public class Kindergarten {
    private String klasse;
    private List<Kind>kinder;

    public Kindergarten(String klasse) {
        this.klasse = klasse;
        this.kinder = new ArrayList<>();
    }

    public String getKlasse() {
        return klasse;
    }

    public List<Kind> getKinder() {
        return kinder;
    }

    public void addKind(Kind k){
        if(!kinder.contains(k)){
            kinder.add(k);
        }
    }
}
