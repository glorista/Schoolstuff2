package Programming2.LogisticManager;

public class Car implements Moveable{
    protected String type;

    protected String color;
    protected double weight;

    public Car(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println("The Car from the type "+type+ ", with the weight "+weight+" and in the color "+color+ " will be moved to "+destination);
    }
}
