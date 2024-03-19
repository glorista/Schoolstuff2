package uebung1903;

import java.util.Scanner;

public class Tamagochi {
    private int x;
    private int y;
    private int futterstand;

    public Tamagochi(int x, int y, int futterstand) {
        this.x = x;
        this.y = y;
        this.futterstand = futterstand;
    }

    public void bewegen() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie eine Richtung an left,right,up oder down:");
        String richtung = scanner.next();

        if (futterstand != 0) {
            if (richtung.toLowerCase().equals("right")) {
                x = x + 1;
                schritt();
            } else if (richtung.toLowerCase().equals("left")) {
                x = x - 1;
                schritt();
            } else if (richtung.toLowerCase().equals("up")) {
                y = y + 1;
                schritt();
            } else if (richtung.toLowerCase().equals("down")) {
                y = y - 1;
                schritt();
            } else {
                System.out.println("Kontrollieren sie ihre Eingabe!");
            }
        } else {
            System.out.println("Tamagochi kann sich vor lauter Hunger nicht mehr bewegen! Bitte füttern!");
            feed(scanner.nextInt());
        }
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setFutterstand(int futterstand) {
        this.futterstand = futterstand;
    }

    public void schritt() {

        futterstand = futterstand - 1;
        System.out.println(toString());
    }

    public void feed(int food) {
        futterstand = food + futterstand;
    }

    @Override
    public String toString() {
        return "Tamagochi{" +
                "x=" + x +
                ", y=" + y +
                ", futterstand=" + futterstand +
                '}';
    }
}
