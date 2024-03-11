package HAufgaben;

public class Messungen {

    private double[][] messungen;
    private int woche;


    public Messungen(int woche) {
        this.woche = woche;
        this.messungen= new double[7][3]; //drei messungen pro tag
    }

    public void messungAmTag(String tag, double messwert){
        int index = tagesZahl(tag);
        double[] messungAmTag =messungen[index];
        for (int i = 0; i < messungen[index].length; i++) {
            if(messungAmTag[i] == 0.0){
                messungAmTag[i] =messwert;
                break;
            }

        }
    }

    private int tagesZahl(String tag){
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
}
