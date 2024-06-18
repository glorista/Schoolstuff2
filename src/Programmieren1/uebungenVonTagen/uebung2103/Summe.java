package Programmieren1.uebungenVonTagen.uebung2103;

public class Summe {

    public static int berechneSumme(int[] arr, int i, int sum){
        if(i> arr.length){
            System.out.println("Die Summe ist: "+sum);;
        }else{
            sum=sum+i;
            i++;
            berechneSumme(arr,i,sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        berechneSumme(arr,0,0);
    }
}
