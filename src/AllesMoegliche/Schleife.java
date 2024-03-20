package AllesMoegliche;

import java.util.Scanner;

public class Schleife {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Handelt es sich um eine A380?");
        boolean istA380 = scanner.nextBoolean();


        for (int i = 0; i <= 50; i++) {
            if (i == 13 || i == 17) {
                continue;
            }
            System.out.println("Sitzreihe " + i);

            if (istA380 == true && i == 19) {
                break;
            }
        }


    }
}





