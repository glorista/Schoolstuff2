package uebungarrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] arr ={5,6,8,3,2,4}; //uebungarrays.array füllen
        printArray2(arr); //methode ausgeben
    }

    private static void printArray2(int[] numbers) {
        String output =""; //muss ich erstellen um es dann ans ende des arrays hängen kann
        for (int number: numbers) {
            output = output.concat(number + ", "); //concat hängt das String ans ende des Arrays
            System.out.format(number + ", "); //nur zu Veranschaung
        }
        System.out.println(); //eine Zeile
        output=output.substring(0, output.length()-2); //-2 damit der Beistrich weg geht, -3 würde die 4 weggeben
        // 0 kennzeichnet den Start
        System.out.println(output); //
    }
}
