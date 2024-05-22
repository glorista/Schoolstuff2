package Programmieren3.Threads.uebung3;

import java.util.Timer;
import java.util.TimerTask;

public class Worker implements Runnable {

    private static int counter = 0;
    private static Object lock = new Object();

    @Override
    public void run() {
        while (counter < 20) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() +" "+ counter);
                counter++;

            }
        }
    }
}

