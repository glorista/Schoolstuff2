package uebung2103;

public class Countdown {

    public static void countdownRunter(int i){

       if(i == 0){
           System.out.println("Counter ist null");
           return;
       }

        System.out.println(i);
        i=i-1;
       countdownRunter(i);
    }
    public static void main(String[] args) {

        countdownRunter(10);
    }
}
