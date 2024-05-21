package Programmieren3.Threads;

public class demo2 extends Thread {
    //rufe zwei threads gleichzeitig auf

    public void run(){
        System.out.println("I am inside: "+ Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        demo2 d1 = new demo2(); //d1 ist hier ein thread da die klasse von threads extended
        d1.start();
        demo2 d2 = new demo2();
        d2.start();
    }

}
