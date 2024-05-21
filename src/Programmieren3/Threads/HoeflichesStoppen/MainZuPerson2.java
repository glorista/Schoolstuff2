package Programmieren3.Threads.HoeflichesStoppen;

import Programmieren3.Threads.ExampeRunnable.Person;

public class MainZuPerson2 {

    public static void main(String[] args) throws InterruptedException {
        Person2 person1 = new Person2("Name1");
        Person2 person2 = new Person2("Name2");

        Thread thread1 = new Thread(person1);
        Thread thread2 = new Thread(person2);

        thread1.start();
        thread2.start();
        Thread.sleep(1200);
        person1.requestShutdown(); //hoefliches Stoppen
        //thread1.stop(); //unhoefliches Stoppen
        //thread2.stop();

        Thread.sleep(1200);
        person2.requestShutdown();



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
