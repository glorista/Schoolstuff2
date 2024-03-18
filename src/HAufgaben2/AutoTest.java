package HAufgaben2;

public class AutoTest {
    public static void main(String[] args) {
        Auto a1 = new Auto("BMW","G30",2020);
        Auto a2 = new Auto("Toyota","Camry",2018);

        a1.gasGeben(100.0);
        System.out.println(a1.toString());
        a1.bremsen(60.0);
        System.out.println(a1.toString());
        a2.gasGeben(260.0);
        System.out.println(a2.toString());
    }
}
