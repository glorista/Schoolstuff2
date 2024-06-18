package Programmieren2.UebungsbspVererbung.Land;

import java.util.ArrayList;

public class Bundesstaat extends Land{

    protected ArrayList<Land> laender = new ArrayList<>();

    public Bundesstaat() {
        this.laender = laender;
    }

    @Override
    protected double getBruttoSozialProduct() {
        double sum = 0;
        for (Land l : laender) {
            sum = sum + l.getBruttoSozialProduct();
        }
        return sum;
    }
    public void addLand(Land l){
        if(!laender.contains(l)){
            laender.add(l);
            }

        }

    }




