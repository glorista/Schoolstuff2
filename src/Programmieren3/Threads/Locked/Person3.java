package Programmieren3.Threads.Locked;

public class Person3 implements Runnable{

    private String name;

    private static Object lock = new Object(); //unser Lock

    private boolean isRunning = true;

    public Person3(String name) {
        this.name = name;
    }

    public void requestShutdown(){
        isRunning= false;

    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++){
                if (isRunning == false) {
                    break;
                }
                System.out.println("Ich bin: " + name + "und ich bin inside: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+" is finished.");
    }
}
