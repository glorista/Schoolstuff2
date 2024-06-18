package Programmieren1.uebungenVonTagen.uebung2103;

public class Fakultaet {

   public static int fakultaetBerechnen(int i) {
       //Abbruchsbedingung
       if(i == 0){
           return 1;
       }else{
           //Rueckgabe falls noch nicht bei 0 angekommen
           return i*fakultaetBerechnen(i-1);
       }
  }
    public static void main(String[] args) {
    einfacheBerechnung(5,1);
    System.out.println(fakultaetBerechnen(5));




    }

    public static void einfacheBerechnung(int i, int sum){
       if (i == 0){
           System.out.println("Fakultät ist: "+sum);
           return;
       }else{
           sum=sum*i;
           i--;
           einfacheBerechnung(i,sum);
       }
    }

}
