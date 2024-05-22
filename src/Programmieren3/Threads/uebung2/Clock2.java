package Programmieren3.Threads.uebung2;

import java.util.Date;

public class Clock2 implements Runnable {

    private boolean isRunning = true;
    private static Object lock = new Object(); //unser Lock

    public void requestShutdown() {
        isRunning = false;
    }

    @Override
    public void run() {
        while (isRunning) {
            synchronized (lock) {
                Date d = new Date();
                System.out.print(Thread.currentThread().getName() + "[");
                System.out.print(d);
                System.out.print(",CUPS: ");
                System.out.print(Runtime.getRuntime().availableProcessors());
                System.out.print(",FreeMem: ");
                System.out.print(Runtime.getRuntime().freeMemory());
                System.out.println("]");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
