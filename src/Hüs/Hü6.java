package Hüs;

import java.util.Scanner;

public class Hü6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Celsius oder Fahrenheit");
        System.out.println("1.Celsius");
        System.out.println("2.Fahrenheit");
        int choice= scanner.nextInt();
        double result;

        if (choice==1){
            System.out.println("Geben sie Celsius an:");
            double c= scanner.nextDouble();
            result=ctof(c);
            System.out.println(c+" sind "+result+" Fahrenheit");
        } else if (choice==2) {
            System.out.println("Geben sie Fahrenheit an: ");
            double f= scanner.nextDouble();
            result=ftoc(f);
            System.out.println(f+" sind "+result+" Celsius");
        }
    }
    public static double ctof (double c){
      return c*1.8+32;
     }
    public static double ftoc (double f){
       return (f-32)*(5)/(9);
    }
}
