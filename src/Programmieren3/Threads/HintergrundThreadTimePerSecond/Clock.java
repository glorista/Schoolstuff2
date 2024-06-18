package Programmieren3.Threads.HintergrundThreadTimePerSecond;

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
//SEINE LÖSUNG
//public class Worker implements Runnable {
//
//    private final int sleepInterval = 2000; //1000 msec = 1 SEK
//    private boolean isRunning = true;
//
//    public void requestShutDown() {
//        isRunning = false;
//    }
//
//    @Override
//    public void run() {
//        while (isRunning) {
//            Date current_date = new Date();
//            System.out.println(current_date.toString());
//            try {
//                Thread.sleep(sleepInterval);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
