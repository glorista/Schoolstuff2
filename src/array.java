import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] g =new int[100];
        int geradeZahl =2;

        for(int i=0;i<=99;i++){
            g[i]=geradeZahl; //befüllen des Arrays
            geradeZahl=geradeZahl+2;
        }
        System.out.println(Arrays.toString(g));

    }
}
