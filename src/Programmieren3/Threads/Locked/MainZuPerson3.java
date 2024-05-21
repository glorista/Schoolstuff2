package Programmieren3.Threads.Locked;

public class MainZuPerson3 {

    public static void main(String[] args) throws InterruptedException {
        Person3 person1 = new Person3("Name 1 ");
        Person3 person2 = new Person3("Name 2 ");

        Thread thread1 = new Thread(person1);
        Thread thread2 = new Thread(person2);

        thread1.start();
        thread2.start();

    }
}
