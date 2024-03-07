import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        int[] arr ={5,6,8,3,2,4};
        System.out.println(Arrays.toString(reihe(arr))); //to string damit zahlen stehen und nicht gibberish
        }
    public static int[] reihe(int[] numbers) {
        int[] arr2= new int[numbers.length]; //neues array das gleich lange ist wie das numbers
        int count=0;
        for (int i = numbers.length-1; i>=0 ; i--) {  //-1 bei length damit wir von hinten anfangen
            arr2[count] = numbers[i];
            count++;
        }
        return arr2;
        }
    }

