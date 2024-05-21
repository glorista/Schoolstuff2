package Programmieren3.Threads.ExampeRunnable;

public class MainZuPerson {

    public static void main(String[] args) throws InterruptedException {
        Runnable person1 = new Person("Name1");
        Runnable person2 = new Person("Name2");

        Thread thread1 = new Thread(person1);
        Thread thread2 = new Thread(person2);

        thread1.start();
        Thread.sleep(500);
        thread2.start();


        try {
            System.out.println("Main: Warten auf thread1...");
            thread1.join();
            System.out.println("Main: Warten auf thread2...");
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
