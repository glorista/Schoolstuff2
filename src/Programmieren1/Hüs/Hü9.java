package Programmieren1.Hüs;

import java.util.Scanner;

public class Hü9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("geben sie eine ganze Zahl an: ");
        int x= scanner.nextInt();
        int i=1;
        while (i<=100){
            if (i%x==0){
                System.out.println(" Die Zahl "+i+" ist teilbar durch "+x);
            }
               i++;
            }

        }
        
    }
    

