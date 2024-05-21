package Programmieren3.Threads.uebung1;

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
