package Programmieren1.AllesMoegliche;

import java.util.Scanner;

public class Passwort {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String pw;


        do {
            System.out.println("Geben sie das Programmieren1.AllesMoegliche.Passwort ein:");
            pw = scanner.next();
        } while( !pw.equals("geheim"));

        System.out.println("Das Programmieren1.AllesMoegliche.Passwort ist korrekt.");
        }


    }

