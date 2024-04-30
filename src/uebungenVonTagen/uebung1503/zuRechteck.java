package uebungenVonTagen.uebung1503;

public class zuRechteck {
    public static void main(String[] args) {
        Rechteck r1= new Rechteck(12.2,14.2);

        System.out.println("Die Fläche des Rechtecks ist:");
        System.out.println(r1.getArea());

        System.out.println();

        System.out.println("Was ist der Umfang des Rechtecks:");
        System.out.println(r1.getPerimeter());

        System.out.println("Die Breite des Rechtecks ist: "+ r1.getBreite());
        System.out.println("Die Höhe des Rechtecks ist: "+ r1.getHoehe());
    }
}
