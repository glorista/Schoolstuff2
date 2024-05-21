package Programmieren3.Threads;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        System.out.println("I am inside: "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Creating Runnable...");
        RunnableExample r1 = new RunnableExample();

        System.out.println("Creating Thread...");
        Thread t1 = new Thread(r1);
        System.out.println("Name of new Thread: "+t1.getName());

        System.out.println("Starting Thread...");
        t1.start();

    }
}
