package alleuebungen.Part4MultiArr;

public class Nr1 {
    public static void main(String[] args) {
        double[][] array = {{8.8, 12}, {134,67.92,45,32.4,76}, {1}, {0, 0.56}};
        double sum = 0; // beim multipliezieren auf 1 setzen
        for (double[] arr : array){
            for(double a:arr){
                sum=a+sum;
            }
        }
        System.out.println(sum);
    }

}
