package Programmieren3.Threads.uebung3;

public class MainZuWorker {

    //Schreiben Sie eine einfache Klasse, welche Runnable implementiert und innerhalb der run()Methode einen statischen Counter der Klasse erhöht.
    //-  Pro Sekunde soll einmal der Counter erhöht werden
    //- Bis die Zahl 20 erreicht ist
    //Erstellen Sie zwei Thread-Instanzen auf einem Worker
    //Behandeln Sie den Counter als „Kritische Sektion“ mit synchronized
    //Stellen Sie sicher, dass am Ende das richtige Ergebnis herauskommt (Counter muss 20 sein)
    //- Geben Sie parallel auf der Console den Threadnamen sowie den aktuellen Counter Wert aus. (In der Run Methode)
    //▪ Was können Sie hier feststellen?

    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();
    }
}
