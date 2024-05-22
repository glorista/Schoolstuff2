package Programmieren3.Threads.uebung2;

import Programmieren3.Threads.uebung1.Clock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainZuClock2 {
    //Schreiben Sie eine Konsolenanwendung mit einem Hintergrund-Thread,
    //welcher im Sekundentakt die aktuelle Uhrzeit ausgibt aktuelle Uhrzeit:
    //Date d = new Date();
    //System.out.println(d.toString())
    //Per Tastendruck / Eingabe eines Zeichens soll die Anwendung (und der Thread „höflich“)
    //gestoppt werden können.

    public static void main(String[] args) throws InterruptedException, IOException {


        Clock2 c2 = new Clock2();
        Clock2 c3 = new Clock2();
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);


        t2.start();
        t3.start();


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        String a = bf.readLine();
        c2.requestShutdown();
        System.out.println("Main ende");
    }


}
