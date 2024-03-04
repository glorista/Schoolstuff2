import java.util.Scanner;

public class größe {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Geben sie eine Zahl an: ");
        double a= scanner.nextDouble();
        System.out.println("Geben sie noch eine Zahl an");
        double b= scanner.nextDouble();
        System.out.println("Geben sie noch eine Zahl an");
        double c= scanner.nextDouble();
        System.out.println("Die kleinste Zahl ist: "+big(a,b,c));



    }
    public static double big (double a,double b, double c) {
        if (a<b && a<c){
            return a;
        } else if (c<a && c<b) {
            return c;
        }else if (b<a && b<c) {
            return b;
        }else{
            return 0;
        }

    }
}
