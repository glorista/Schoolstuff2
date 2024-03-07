package Hüs;

import java.util.Scanner;

public class Hü2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bitte geben sie ihr Alter an:");
        int age=scanner.nextInt();

        //Reihenfolge wichtig, Größte zuerst
        if (age>=18){
            System.out.println("Du darfst B und A machen");
        }else if (age>=16){
            System.out.println("Du kannst den AM machen.");
        }else {
            System.out.println("du bist zu jung für alles");
        }

    }
}
