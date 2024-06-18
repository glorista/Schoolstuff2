package Programmieren1.AllesMoegliche;

import java.util.Scanner;

public class NeueKlasse {

    public static int monatstage(){


        Scanner scanner =new Scanner(System.in);
        System.out.println("Geben sie ein Monat an");
        String monat= scanner.next();
        monat=monat.toLowerCase();
        switch(monat){
            case"jaenner":
            case"maerz":
            case"mai":
            case"juli":
            case"august":
            case"oktober":
            case"dezember":
                System.out.println(monat+" hat 31 Tage");
            break;
            case"april":
            case"juni":
            case"september":
            case"november":
                System.out.println(monat+" hat 30 Tage");
            break;
            case"februar":
                System.out.println(monat+" hat 28 Tage");
            break;
            default:
                System.out.println("Sie haben den Monat falsch eingegeben");
        }
        if (monat.equals("jaenner")|| monat.equals("maerz") || monat.equals("mai") || monat.equals("juli") || monat.equals("august") || monat.equals("oktober") || monat.equals("dezember")){
            System.out.println(monat+" hat 31 Tage");
        } else if (monat.equals("februar")) {
            System.out.println(monat+" hat 28 Tage");
        }else {
            System.out.println(monat+" hat 30 Tage");
        }

        return monatstage();



    }

    public static void main(String[] args) {

        monatstage();





    }
}
