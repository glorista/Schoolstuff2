package HAufgaben;

import java.util.Scanner;

public class HAufgabe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie die Anzahl an Wörtern an: ");
        int anzahl = scanner.nextInt();

        String[] words = new String[anzahl];

        for (int i = 0; i < anzahl; i++) {
            System.out.println("Bitte geben sie nun ihr " + (i + 1) + " Wort ein:");
            words[i] = scanner.next();
        }


        System.out.println("Geb sie nun die gewünschte Wortlänge an: ");
        int k = scanner.nextInt();

        if (k <= 0) {
            System.out.println("Bitte gib eine Zahl an die Größer ist als 0");
        } else{
            String[] result =delete(words,k);
            System.out.println("Die übrigen Wörter sind: ");
            for (String a: result){
                System.out.println(a);
            }
        }
    }
        public static String[] delete (String[]words,int k){
            int i = 0;
            for (String word : words) {
                if (word.length() >= k) {
                    i++;
                }
            }
            String[] result=new String[i];
            int index=0;
            for(String word:words){
                if(word.length() >= k){
                    result[index++]=word;
                }
            }
            return result;

        }


}