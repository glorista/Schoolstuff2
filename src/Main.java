

import java.util.Scanner;

public class Main {

    public static float methode() {
        Scanner scanner =new Scanner(System.in);
        int speed;

        System.out.println("Geben sie hier eine Geschwindigkeit ein: ");
        speed= scanner.nextInt();

        int ueberschreitung = speed-50;
        int strafe=0;

        if (ueberschreitung<11){
            System.out.println("Schriftliche Verwarnung");
        }else if (ueberschreitung>10 && ueberschreitung<21){
            System.out.println("30 Euro Strafe");
            strafe=strafe+30;
        }else if (ueberschreitung>20 && ueberschreitung<31){
            System.out.println("50 Euro Strafe");
            strafe=strafe+50;
        }else if (ueberschreitung>30 && ueberschreitung<51){
            System.out.println("100 Euro Strafe");
            strafe=strafe+100;
        }else if (ueberschreitung>50 && ueberschreitung<100){
            System.out.println("500 Euro Strafe");
            strafe=strafe+500;
        }else {
            System.out.println("1500 Euro Strafe");
            strafe=strafe+1500;
        }

        float alk;

        System.out.println("Geben sie hier einen Alkoholspiegel ein: ");
        alk= scanner.nextFloat();

        if (alk<=0.5){
            System.out.println("Keine Strafe");
        }else if (alk>=0.6 && alk<=1.0){
            System.out.println("50 Euro Strafe");
            strafe=strafe+50;
        }else if (alk>=1.1 && alk<=2.0){
            System.out.println("100 Euro Strafe");
            strafe=strafe+100;
        }else if (alk>=2.0){
            System.out.println("2500 Euro Strafe");
            strafe=strafe+2500;
        }

        return strafe;
    }
    public static float rabatt(float strafe) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Geben sie ein Monat an");
        String monat= scanner.next();
        monat=monat.toLowerCase();

        switch (monat){
            case "jaenner":
            case "februar":
                System.out.println("kein Rabatt im "+monat);;
            break;
            case "maerz":
            case"april":
                strafe= (float) (strafe*0.90);
            break;
            case "mai":
            case"juni":
                strafe= (float) (strafe*0.85);
            break;
            case"juli":
            case"august":
                strafe= (float) (strafe*0.80);
            case"september":
            case"oktober":
                strafe= (float) (strafe*0.75);
            break;
            case"november":
            case"dezember":
                strafe= (float) (strafe*0.70);
            break;
            default:
                System.out.println("Sie haben den Monat faslch geschrieben");

        }
        if (strafe>=0){
            System.out.println("Die finale Strafe beträgt: "+strafe);
        } else {
            System.out.println("Keine Strafe für sie");
        }
        return strafe;

    }





    public static void main(String[] args) {
        float strafe;
        strafe=methode();
        System.out.println("Gesamtstrafe beträgt: "+strafe);
        float endgueltigeStrafe = rabatt(strafe);
        System.out.println("Endgültige Strafe="+ endgueltigeStrafe);


    }
}

