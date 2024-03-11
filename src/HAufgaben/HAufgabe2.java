package HAufgaben;

import java.util.Scanner;

public class HAufgabe2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Bitte geben Sie die Anzahl ihre Noten an: "); //hier wird die Anzahl und somit die Länge des Arrays abgefragt
        int anzahl=scanner.nextInt();

        int[] noten= new int[anzahl]; //hier wird ein dynamisches Array erstellt

        for (int i = 0; i < anzahl; i++) { //hier wird so oft nach einer Eingabe verlängt wie der Nutzer vorher angegeben hat
            System.out.println("Geben Sie hier Ihre Note "+ (i+1)+" ein:");
            noten[i]=scanner.nextInt();
        }
        System.out.println("Der Notendurschnitt beträgt: "+ds(noten));


    }
    public static double ds (int[] a){
        int sum=0;
        for (int note:a){
            sum=sum+note;
        }
        return (double) sum/a.length;
    }

}
