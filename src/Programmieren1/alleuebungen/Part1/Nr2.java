package Programmieren1.alleuebungen.Part1;

import java.util.Scanner;

public class Nr2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie eine Zahl zwischen 1 und 10(einschließlich)ein: ");
        int zahl = scanner.nextInt();

        while (zahl > 1 || zahl <= 10) {
            switch (zahl) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                default:
                    System.out.println("Ungültige Zahl! Bitte geben si erneut eine Zahl ein");
            }

        }

        if (zahl<1 || zahl>10){
            System.out.println("Ungültige Zahl! Bitte geben si erneut eine Zahl ein");
        }

    }
}
