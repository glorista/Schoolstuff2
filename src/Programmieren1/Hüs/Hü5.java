package Programmieren1.Hüs;

import java.util.Scanner;

public class Hü5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie eine ganze Zahl an:");
        int a= scanner.nextInt();
        System.out.println("Geben sie eine zweite ganze Zahl an:");
        int b= scanner.nextInt();


        System.out.println(a+" + "+b+" = "+addieren(a,b));
        System.out.println("Das Minimum ist: "+mini(a,b)+" das Maximum ist: "+maxi(a,b));
        System.out.println("Das Absolut der ersten Zahl ist: "+abs(a));
        System.out.println("Das Absolut der zweiten Zahl ist: "+absi(b));
    }
    public static int addieren(int a, int b){
        return a+b;
    }
    public static int mini (int a, int b) {
        return Math.min(a, b);
    }
    public static int maxi (int a, int b){
        return Math.max(a,b);
    }
    public static int abs (int a) {
        return Math.abs(a);
    }
    public static int absi (int b) {
        return Math.abs(b);
    }


}

