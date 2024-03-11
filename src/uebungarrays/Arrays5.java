package uebungarrays;

public class Arrays5 {
    public static void main(String[] args) {
        int [][] arr2d = new int[3][3];
        int [][] arr2d2 = {{10,11,12},{20,21,22},{30,31,32}};

        for (int i=0; i< arr2d.length ; i++){
            for(int j=0; j< arr2d[i].length; j++){
                arr2d[i][j]=i+j;
            }
        }
        for (int i=0; i< arr2d.length; i++){
            for( int j=0; j< arr2d.length;j++){
                System.out.print(arr2d[i][j]+" ");
            }
           // System.out.println();
        }
        System.out.println();

        for (int i=0; i< arr2d2.length;i++){
            System.out.println("Array an Index "+i+":");
            for( int j=0; j< arr2d2.length; j++){
                System.out.print(arr2d2[i][j]+" ");
            }
        }

    }
}
