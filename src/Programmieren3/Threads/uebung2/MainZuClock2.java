package Programmieren3.Threads.uebung2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainZuClock2 {
    //Erweitern Sie Ihr „Uhr-Beispiel“, sodass neben der Uhrzeit auch die Anzahl an CPUs und der noch aus Sicht von Java freie Speicher ausgegeben wird:
    //▪ Date d = new Date();
    // ▪ System.out.print("[");
    // ▪ System.out.print(d.toString());
    //▪ System.out.print(", CPUS: ");
    //▪ System.out.print(Runtime.getRuntime().availableProcessors());
    // ▪ System.out.print(", FreeMem: "); ▪ System.out.print(Runtime.getRuntime().freeMemory());
    //▪ System.out.print("]");
    // Starten Sie zwei „Uhr-Threads“ gleichzeitig
    // Entdecken Sie, dass sich die beiden Threads in die Quere kommen?
    // Definieren Sie die Ausgabe als „Kritische Sektion“ mit synchronized
    // Führen Sie die Anwendung erneut aus und stellen sie fest, dass sich die Threads nicht mehr in die Quere kommen.

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
