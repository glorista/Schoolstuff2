package Programmieren1.HAufgaben;

public class Messungen {

    private double[][] messungen;
    private int woche; //speichert die Wochennummer


    public Messungen(int woche) { //Konstruktor definiert eine Ganzzahl mit woche als parameter
        this.woche = woche;
        this.messungen= new double[7][3]; //drei messungen pro tag
    }

    /*
    nimmt tag und messwert als Parameter, sucht nach freien Slot im 'messungen' Array für den Tag und speichert den Messwert dort ab
     */
    public void messungAmTag(String tag, double messwert){
        int index = tagesZahl(tag);
        //double[] messungAmTag =messungen[index];
        for (int i = 0; i < messungen[index].length; i++) {
            if(messungen[index][i] == 0.0){
                messungen[index][i] =messwert;
                break;
            }

        }
    }

    private int tagesZahl(String tag){ //gibt jedem Tag eine Nummer, wenn ungültige eingabe dann -1
        switch (tag.toLowerCase()){
            case "montag":
                return 0;
            case "dienstag":
                return 1;
            case "mittwoch":
                return 2;
            case "donnerstag":
                return 3;
            case "freitag":
                return 4;
            case "samstag":
                return 5;
            case "sonnntag":
                return 6;
            default:
                return -1;
        }
    }

    public void alleMessungenAmTag (String tag,double[] messwerte){
        int index= tagesZahl(tag);
        boolean leer= true;
        for(double m: messungen[index]){
            if(m != 0){
                leer=false;
                break;
            }
        }
        if(leer){
            messungen[index]=messwerte;
        }
    }





    public double tagesdurchschnitt(String tag){
        int index=tagesZahl(tag);
        double sum=0;
        int i=0;
        for (double messwert: messungen[index]){
            if(messwert>0){
                sum=sum+messwert;
                i++;
            }
        }
        if (i>0){
            return sum/i;
        } else {
            return 0;
        }
    }
    public double wochenDurchschnitt(){
        double sum=0;
        int i=0;
        for(double[] tagMessungen : messungen){
            for(double messwert: tagMessungen){
                if(messwert>0){
                    sum= sum+messwert;
                    i++;
                }
            }
        }
        if (i>0){
            return sum/i;
        } else {
            return 0;
        }
    }
}
