package alleuebungen.Part4MultiArr;

import java.util.Random;

public class Nr2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[8][8];
        int sum = 0;
        double durchs= 0;
        int max=0;
        int min=100;

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <i ; j++) {
                array[i][j] = random.nextInt(1,100);
                sum=sum+array[i][j];
                System.out.println(array[i][j]);
            }
        }
        for(int[] arr: array){
            for(int a: arr){
                if(min>a){
                    min=a;
                }
            }
        }

        durchs =sum/ array.length;

        for (int[] arr:array){
            for(int a:arr){
                if(a>max){
                    max=a;
                }
            }
        }



        System.out.println("Summe= "+sum);
        System.out.println("Durschnitt= "+durchs);
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
    }
}
