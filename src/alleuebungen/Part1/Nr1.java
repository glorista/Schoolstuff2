package alleuebungen.Part1;

import java.util.Scanner;

public class Nr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner erstellen

        System.out.println("Bitte geben sie ihren Namen an:");
        String name= scanner.next(); //Eingabe wird in der Variable name gespeichert

        System.out.println("Bitte geben sie ihr Alter als Zahl an:");
        int alter = scanner.nextInt(); //Eingabe wird in der Variable alter gespeichert

        System.out.println("Hallo, "+name+"! Du bist "+alter+" Jahre alt.");


    }
}
