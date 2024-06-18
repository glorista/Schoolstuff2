package Programmieren3.Threads.HintergrundThreadTimePerSecond;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainZuClock {
    //Schreiben Sie eine Konsolenanwendung mit einem Hintergrund-Thread,
    //welcher im Sekundentakt die aktuelle Uhrzeit ausgibt aktuelle Uhrzeit:
    //Date d = new Date();
    //System.out.println(d.toString())
    //Per Tastendruck / Eingabe eines Zeichens soll die Anwendung (und der Thread „höflich“)
    //gestoppt werden können.

    public static void main(String[] args) throws InterruptedException, IOException {


        Clock c = new Clock();
        Thread t1 = new Thread(c);


        t1.start();


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        String a = bf.readLine();
        c.requestShutdown();
        System.out.println("Main ende");
    }


}
//SEINE LÖSUNG MIT ZWI THREADS
//public class main {
//    public static void main(String[] args) {
//
//        Worker w1 = new Worker();
//        Thread t1 = new Thread(w1);
//        t1.start();
//
//        System.out.println("Drücken Sie eine Taste bzw. Eingabe um zu stoppen ...");
//        if (ConsoleHelper.readLine() != null) {
//            w1.requestShutDown();
//        }
//
//        try {
//            t1.join();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Fertig!");
//    }
//}
//WEITERE KLASSE
//public class ConsoleHelper {
//
//    public static String readLine() {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//
//        try {
//            return br.readLine();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//}