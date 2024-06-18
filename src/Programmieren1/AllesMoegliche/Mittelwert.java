package Programmieren1.AllesMoegliche;

import java.util.Scanner;

public class Mittelwert {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Geben sie eine Zahl an: ");
        double a= scanner.nextDouble();
        System.out.println("Geben sie noch eine Zahl an");
        double b= scanner.nextDouble();
        System.out.println("der Programmieren1.AllesMoegliche.Mittelwert der Zahlen ist: "+mittelwert(a,b));


    }
    public static double mittelwert(double a,double b){
        return (a+b)/2;

    }
}
