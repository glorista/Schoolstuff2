import java.util.Scanner;

public class Hü4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie ihr Gewicht ein in kg:");
        double kg= scanner.nextDouble();

        System.out.println("Bitte geben sie ihre Körpergröße in m ein:");
        double m= scanner.nextDouble();

        double bmi=rechner(kg,m);
        ausgabe(bmi);

    }
    public static double rechner(double kg, double m){
        //wie mach ich das mit cm?
        return kg/(m*m);
    }

    public static void ausgabe(double bmi) {
        System.out.println("Ihr BMI Wert beträgt: "+bmi);
        if (bmi<18){
            System.out.println("Underweight");
        } else if (bmi<25){
            System.out.println("Normal");
        }else if (bmi <30){
            System.out.println("Overweight");
        }else{
            System.out.println("Overoverweight");
        }
    }



}
