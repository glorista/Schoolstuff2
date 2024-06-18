package Programmieren2.Vererbung;

public class App {
    public static void main(String[] args) {
        Dog d= new Dog("Wuffi",2);

        d.bellen("wuff wuff");

        Pudel bello = new Pudel("Bello",5,"Kartoffeln");
        bello.bellen("bell bell");
        bello.isstBeilage("Fleisch");

        Perser p = new Perser("Mona");

        System.out.println(p.getName());


        Customer c = new Customer("Horst","Bauer",255);

        c.addAddress(new Address("abc street","5202","Graz","Austria"));

        c.jump();
        System.out.println(c.toString());

    }
}
