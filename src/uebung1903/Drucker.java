package uebung1903;

public class Drucker {
    public static void drucken(String z){
        System.out.println(z);
    }
    public void drucken(int z){
        System.out.println(z);
    }
    public void drucken(double z){
        System.out.println(z);
    }
    public void drucken(boolean z){
        System.out.println(z);
    }

    public static void main(String[] args) {
        Drucker drucker = new Drucker();
        drucker.drucken("Hallo");
        Drucker.drucken("Hallo");

    }
}
