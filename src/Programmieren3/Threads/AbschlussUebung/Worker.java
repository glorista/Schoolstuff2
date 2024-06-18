package Programmieren3.Threads.AbschlussUebung;

public abstract class Worker {
    protected String name;
    protected boolean shouldRun;

    public Worker(String name) {
        this.name = name;
        shouldRun=true;
    }
    public abstract void work();

    protected void printStarted(){
        System.out.println(name+" wurde gestartet!");
    }
    protected void printStopped(){
        System.out.println(name+" wurde gestoppt");
    }
    public void stopWorker(){
        shouldRun=false;
    }
}
