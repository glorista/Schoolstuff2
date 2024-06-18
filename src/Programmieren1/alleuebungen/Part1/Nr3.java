package Programmieren1.alleuebungen.Part1;

import java.util.Scanner;

public class Nr3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie ihren Kontostand ein: ");
        double balance = scanner.nextDouble();

        System.out.println("Menu: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();


        switch(choice){
            case 1:
                System.out.println("Geben sie den Betrag den sie hinzufügen möchten an:");
                double depositAmount = scanner.nextDouble();
                balance += depositAmount;
                System.out.println("Der neue Kontostand ist: "+balance);
                break;
            case 2:
                System.out.println("Geben sie den Betrag den sie abheben möchten an:");
                double withdrawalAmount = scanner.nextDouble();
                balance -= withdrawalAmount;
                System.out.println("Der neue Kontostand ist: "+balance);
                break;
            case 3:
                System.out.println("Ihr Kontostand beträgt: "+balance+" Euros");
                break;
            case 4:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
    }
}
