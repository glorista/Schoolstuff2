package AllesMoegliche;

import java.util.Scanner;
public class NeuerTag {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Miles oder Kilometer");
        System.out.println("1.Miles");
        System.out.println("2.Kilometer");
        int choice= scanner.nextInt();
        double result;

        if (choice==1){
            System.out.println("Geben sie Miles an:");
            double miles= scanner.nextDouble();
            result=miles*1.60934;
            System.out.println(miles+" sind "+result+" Kilometer");
        } else if (choice==2) {
            System.out.println("Geben sie km an: ");
            double km= scanner.nextDouble();
            result=km*0.621371;
            System.out.println(km+" sind "+result+" Meilen");
        }


    }
    //public static double kmtomiles (double km){
      //  return km*0.621371;
   // }
    //public static double milestokm (double miles){
     //   return miles*1.60934;
    //}
}
