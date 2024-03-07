import java.util.Arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int [][] array= {{10,11,12},{20,21,22},{30,31,32}};

        int length= 9;
        int[] array2= new int[length];
        int counter=0;
        int sum=0;

        for( int i=0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                array2[counter]=array[i][j];
                counter++;
                if (i==j){
                    sum += array[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(array2));
        System.out.println(sum);
    }
}
