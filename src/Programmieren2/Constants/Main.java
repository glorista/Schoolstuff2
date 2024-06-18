package Programmieren2.Constants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in); //neuer Scanner erstellen
        System.out.println("Gib hier bitte dein Alter ein:"); //Abfrage vom user

        int alter=scanner.nextInt(); //eingabe vom User
        AgeCalculator a1 = new AgeCalculator(); //Objekt der Klasse AgeCalculator erstellen
        System.out.println("Days: "+a1.ageInDays(alter)); //gibt das eingegebene Alter des Users in Tagen an mithilfe der Methode in der Klasse AgeC
        System.out.println("Weeks: "+a1.ageInWeeks(alter)); //gibt das eingegebene Alter des Users in Wochen an mithilfe der Methode in der Klasse AgeC
        System.out.println("Months: "+a1.ageInMonths(alter)); //gibt das eingegebene Alter des Users in Monaten an mithilfe der Methode in der Klasse AgeC


    }
}
