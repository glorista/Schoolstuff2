package HAufgaben2;

public class Grundsteuer {


    public double grundsteuerBerechnen(int arr[][]){
        double sum=0; //deklarieren und initiatlisieren der Variable sum

        for (int i = 0; i < arr.length; i++) {  //benötigt man um egal wie viele Innere Arrays berechnen zu können da dies nicht angegeben war
            int typ = arr[i][0]; //hier geben wir der ersten Zahl die am Index 0 liegt einen namen 'typ'

            switch (typ) { //hier wird die erste Zahl angeschaut und dementsprechend gehandelt
                case 1:
                    sum= sum+3.20 * arr[i][1] * arr[i][2];
                    break;
                case 2:
                    sum= sum+2.10 * arr[i][1] * arr[i][2];
                    break;
                case 3:
                    sum= sum+0.90 * arr[i][1] * arr[i][2];
                    break;
            }
        }
        return sum;
    }
}
