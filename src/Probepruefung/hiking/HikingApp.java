package Probepruefung.hiking;

import java.util.Arrays;

public class HikingApp {
    public static void main(String[] args) {
        Hiking a = new Hiking();
        a.print();
        System.out.println(a.totalNrObstacles('L'));
        System.out.println(a.totalNrObstacles('H'));
        System.out.println(Arrays.toString(a.countObstaclesPerRow(0)));
        System.out.println(a.energyNeededInRow(0));
        System.out.println(a.ableToFinishHiking(20));
    }
}
