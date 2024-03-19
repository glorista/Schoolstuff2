package uebung1903;

public class MatheRechner {
    public static void addieren(int a, int b){
        System.out.println(a+b);
    }

    public static void subtrahieren(int a, int b){
        System.out.println(a-b);
    }

    public static void multiplizieren(int a, int b){
        System.out.println(a*b);
    }

    public static void dividieren(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        MatheRechner.addieren(7,8);
        MatheRechner.subtrahieren(10,5);
        MatheRechner.multiplizieren(10,5);
        MatheRechner.dividieren(10,5);
    }
}
