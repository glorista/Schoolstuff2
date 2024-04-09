package Programming2.LogisticManager;

public class Shirt implements Moveable {
    protected String brand;
    protected String size;
    protected String color;

    public Shirt(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public void move(String destination) {
        System.out.println("The Shirt from the brand "+brand+ ", with the size "+size+" and in the color "+color+ " will be moved to "+destination);
    }
}
