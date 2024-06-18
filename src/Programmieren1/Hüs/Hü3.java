package Programmieren1.Hüs;

import java.util.Scanner;

public class Hü3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Temparatur zwischen -20 und 30Grad ein:");
        double temp = scanner.nextDouble();

        //damit kann man der Eingabe eine Ober- und eine Untergrenze geben
        if (temp < -20 || temp > 30) {
            System.out.println("Hast du dich vertippt?");
            return; //damit nicht weiter abgefragt wird
        }

        System.out.println("Ist das Wetter sonnig, bewölkt oder regen?");
        String wetter = scanner.next().toLowerCase();//hier das Lower Case sonst gibt es eine weitere Ausgabe mit sout


        //falls Fehler bei der Eingabe ist.Warum && und nicht||
        if (!wetter.equals("sonnig") && !wetter.equals("bewölkt") && !wetter.equals("regen")) {
            System.out.println("Hast du dich vertippt?");
        }

        switch (wetter){
            case "sonnig":
                if (temp>=25){
                    System.out.println("Move ur ass outside");
                }else{
                    System.out.println("Move ur ass outside with a hoodie");
                }
                break;
            case "bewölkt":
                if (temp<=25){
                    System.out.println("U can still go outside but u should probably take a hoodie with u");
                }else{
                    System.out.println("u can still enjoy the warm temperatures outside");
                }
                break;
            case "regen":
                System.out.println("u should stay at home");
                break;
        }


    }
}

