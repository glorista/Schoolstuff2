package Programmieren3.Threads.uebung3;

public class MainZuWorker {

    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();
    }
}
