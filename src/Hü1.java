import java.util.Scanner;

public class Hü1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Geben sie eine ganze Zahl an um zu überprüfen ob sie gerade oder nicht ist: ");
        int a= scanner.nextInt();
        System.out.println(testung(a));
        }


    public static String testung(int a) {
        if (a%2==0){
            return "Die Zahl "+a+" ist gerade";
        }else {
            return "Die Zahl "+a+" ist ungerade";
        }
    }
}
