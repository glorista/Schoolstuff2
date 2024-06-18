package Programmieren3.Threads.AbschlussUebung;

import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable{
    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        printStarted();
        while(shouldRun){
            Date d = new Date();
            System.out.println(d);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        printStopped();
    }

    @Override
    public void run() {
        work();
    }
}
