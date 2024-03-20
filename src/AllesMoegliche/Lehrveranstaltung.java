package AllesMoegliche;

import java.util.Arrays;

public class Lehrveranstaltung {
    public int id;
    public String bezeichnung;
    public int[] noten;

    public Lehrveranstaltung(int id, String bezeichnung) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        noten=new int[16];
    }

    @Override
    public String toString() {
        return "AllesMoegliche.Lehrveranstaltung{" +
                "id=" + id +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", noten=" + Arrays.toString(noten) +
                '}';
    }

    public void neueNote(int note){
        for (int i = 0; i < noten.length; i++) {
            if (noten[i]==0){
                noten[i]=note;
                break;
            }

        }
    }
    public int besteNote(){
        int note= noten[0];
        for (int i = 0; i <noten.length ; i++) {
            if(noten[i]<note){
                if (noten[i] !=0){
                    note=noten[i];
                }
            }

        }
        return note;
    }


    public String bezeichnung(){
        return "Der Kurs ist: "+bezeichnung;
    }
    /*public void erreichteNoten (String n){
        for(int i=0; i< noten.length; i++){
            if (noten[i]== null){
                noten[i]==n;
                break;
            }
        }

     */
    }

