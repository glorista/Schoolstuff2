package Programmieren3.Threads.uebung1;

import java.util.Date;

public class Clock implements Runnable{

    private boolean isRunning = true;

    public void requestShutdown(){
        isRunning= false;
    }
    @Override
    public void run() {
        while(isRunning){
            Date d = new Date();
            System.out.println("Aktuelle Uhrzeit: "+ d);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
