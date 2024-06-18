package Programmieren1.AllesMoegliche;

import java.util.Arrays;

public class ÜbungArrays {
    public static void main(String[] args) {
        //wie speichert man 5 Zahlen gleichzeitig

        int[] array = new int[3];
        array[0] = 4;
        array[1] = 5;
        array[2] = 6;

        System.out.println(array); //nicht falsch aber die Ausgabe ist gibberish [I@65ab7765
        System.out.println(Arrays.toString(array)); // schreibt die Inhalte in eckige Klammern

        int[] arr = {4, 5, 6}; //eine Art Arrays zu füllen und auszugeben
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int element:arr){ //andere Art die Arrays auszugeben hier nur mit z gekennzeichnet damit man die beiden bei der ausgabe sieht
            System.out.println(element +"z");
        }
    }
}
