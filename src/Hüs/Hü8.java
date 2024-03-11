package Hüs;

import java.util.Scanner;

public class Hü8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Geben sie eine ganze Zahl an:");
        int zahl =scanner.nextInt();
        int summe;
        summe= 0;
        int i;
        i=1;

        while (zahl != 0){
            summe=summe+i;
            if (i==zahl) {
                System.out.println("Die Summer der Zahlen von 1 bis "+zahl+" ist: "+summe);
                break;
            }
            i++;

        }

    }

}
