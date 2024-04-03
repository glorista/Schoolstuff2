package alleuebungen.Part4MultiArr;

import java.util.Random;

public class Nr4 {

    public static void main(String[] args) {


        double[][][] array = new double[4][3][2];
        Random random = new Random();
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k]= random.nextDouble(0.0,1.0);
                    sum = sum+array[i][j][k];
                }
            }
        }
        System.out.println("Summe= "+sum);
        System.out.println("Durchschnitt= "+sum/ array.length);

        double max = 0.0;
        for(double[][] arr:array){
            for(double[]ar: arr){
                for(double a: ar){
                    if(a>max){
                        max=a;
                    }
                }
            }
        }

        double min = 1.0;
        for(double[][] arr:array){
            for(double[]ar: arr){
                for(double a: ar){
                    if(a<min){
                        min=a;
                    }
                }
            }
        }

        System.out.println("Max= "+max);
        System.out.println("Min= "+min);

    }

}
