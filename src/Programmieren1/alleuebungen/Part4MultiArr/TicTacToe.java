package Programmieren1.alleuebungen.Part4MultiArr;

import java.util.Scanner;

public class TicTacToe {

    public static void zeigeBrett(char[][] brett){
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                System.out.print(" "+brett[i][j]);
            }
            System.out.println();
        }
    }
    public static void zugMachen(char[][] brett, char figur){
        int zeile;
        int spalte;
        boolean gewonnen = false;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Gib Zeile an(0-2): ");
            zeile=scanner.nextInt();
            System.out.println("Gib Spalte an(0-2): ");
            spalte= scanner.nextInt();
            //for (int i = 0; i < brett.length; i++) {
                //for (int j = 0; j < brett[i].length; j++) {
                    if(brett[zeile][spalte] == 'O'){
                        brett[zeile][spalte]=figur;
                    }else {
                        System.out.println("Platz bereits vergeben");
                    }
            zeigeBrett(brett);
            gewonnen=gewonnen(brett, figur);
        }while(!gewonnen);

    }

    public static boolean gewonnen(char[][] brett, char figur){

        if (brett[0][0]== figur && brett[0][1] == figur && brett[0][2] == figur){
            System.out.println(figur+ "hat gewonnen");
            return true;
        } else if (brett[1][0]== figur && brett[1][1] == figur && brett[1][2] == figur) {
            System.out.println(figur+ "hat gewonnen");
            return true;
        } else if (brett[2][0]== figur && brett[2][1] == figur && brett[2][2] == figur) {
            System.out.println(figur+ "hat gewonnen");
            return true;
        } else if (brett[0][0]== figur && brett[1][1] == figur && brett[2][2] == figur) {
            System.out.println(figur+ "hat gewonnen");
            return true;
        } else if (brett[0][2]== figur && brett[1][1] == figur && brett[2][0] == figur) {
            System.out.println(figur+ "   hat gewonnen");
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] brett = new char[3][3];
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                brett[i][j]='O';
            }
        }
        zeigeBrett(brett);
        System.out.println("Spieler 1: ");
        char figur1= scanner.next().charAt(0);
        System.out.println("Spieler 2: ");
        char figur2 = scanner.next().charAt(0);
        zugMachen(brett,figur1);





    }
}
