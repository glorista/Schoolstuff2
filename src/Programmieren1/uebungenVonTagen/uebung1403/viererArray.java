package Programmieren1.uebungenVonTagen.uebung1403;

import java.util.Arrays;

public class viererArray {
    public static void main(String[] args) {
        int[][][][] array= new int[4][3][2][2];
        int elementeCounter =0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                       elementeCounter++;
                        System.out.println("Werte: "+array[i][j][k][l]);

                    }

                }

            }

        }
        System.out.println(elementeCounter);
        System.out.println(Arrays.deepToString(array));

    }
}
