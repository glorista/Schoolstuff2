package Programmieren3.Threads.HoeflichesStoppen;

public class Person2 implements Runnable{

    private String name;

    private boolean isRunning = true;

    public Person2(String name) {
        this.name = name;
    }

    public void requestShutdown(){
        isRunning= false;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(isRunning == false){
                break;
            }
            System.out.println("Ich bin: "+name+"und ich bin inside: "+ Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+" is finished.");
    }
}
