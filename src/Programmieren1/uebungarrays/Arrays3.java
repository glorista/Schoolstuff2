package Programmieren1.uebungarrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] arr ={5,6,8,3,2,4};
        System.out.println(sum(arr));
    }
    public static int sum(int[] numbers) {
        int sum=0;
        for (int number:numbers){ //alle number ergeben numbers for each geht jede nummer einmal durch
            sum= sum+number;
        }
        return sum;
        /*
        for(int i=o; i<numbers.lenght;i++){ //das gleich nur mit einer normalen i und nicht mit einer for each
            sum=sum+numbers[i];
         */
        /* while schleife
        int j=0
        while (j<numbers.length){
        sum=sum+number[j]
        }
         */
    }

}

