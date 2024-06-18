package Programmieren1.Hüs;

import java.util.Scanner;

public class Hü7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie einen Euro Betrag an: ");
        double euro= scanner.nextDouble();

        System.out.println("Geben sie ihr neue Währung an USD,CZK,HUF oder PLN");
        String neu= scanner.next().toUpperCase();

        if (neu.equals("USD")){
            System.out.println(euro+" sind "+usd(euro)+" Dollar");
        } else if (neu.equals("CZK")){
            System.out.println(euro+" sind "+czk(euro)+" CSK");
        }else if (neu.equals("HUF")){
            System.out.println(euro+" sind "+huf(euro)+" HUF");
        }else if (neu.equals("PLN")){
            System.out.println(euro+" sind "+pln(euro)+" PLN");
        }else {
            System.out.println("Hast du dich vertippt?");
        }
    }
    public static double usd(double euro){
        return euro*1.08;
    }
    public static double czk(double euro){
        return euro*25.37;
    }
    public static double huf(double euro){
        return euro*395.31;
    }
    public static double pln(double euro){
        return euro*4.33;
    }


}
