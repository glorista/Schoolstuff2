package Programmieren3.Threads.AbschlussUebung;

public class Demo {
    public static void main(String[] args) {
        TimePrintWorker tpw = new TimePrintWorker("t1");
        FileReadWorker frw = new FileReadWorker("t2","C:\\Users\\s54821\\Hallo1\\text3.txt");
        Thread t1 = new Thread(tpw);
        Thread t2 = new Thread(frw);

        t1.start();
        t2.start();

        try{
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(!frw.shouldRun){
            tpw.stopWorker();
        }

    }
}
