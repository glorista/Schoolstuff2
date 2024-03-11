package HAufgaben;

public class HAufgabe1 {
    public static void main(String[] args) {
        int[] array ={5,6,8,3,2,4,7,0,1,9};
        System.out.println("Der Durchschnittswert beträgt: "+dw(array));


    }
    public static double dw(int[] array){
        int sum=0;
        for(int num:array){ //num steht für jede spezifische Zahl im Array
            sum=sum+num;
        }
        return(double) sum/array.length; //alle addierten Zahl durch die Anzahl der Zahlen
    }
}
