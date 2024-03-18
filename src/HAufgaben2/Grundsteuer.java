package HAufgaben2;

public class Grundsteuer {


    public double grundsteuerBerechnen(int arr[][]){
        double sum=0;

        for (int i = 0; i < arr.length; i++) {
            int typ = arr[i][0];

            switch (typ) {
                case 1:
                    sum= sum+3.20 * arr[i][1] * arr[i][2];
                    break;
                case 2:
                    sum= sum+2.10 * arr[i][1] * arr[i][2];
                    break;
                case 3:
                    sum= sum+0.90 * arr[i][1] * arr[i][2];
                    break;
            }
        }
        return sum;
    }
}
