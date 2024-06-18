package Programmieren2.LogisticManager;

public class Organe implements Moveable{

    protected String art;
    protected double weight;
    protected String bloodType;

    public Organe(String art, double weight, String bloodType) {
        this.art = art;
        this.weight = weight;
        this.bloodType = bloodType;
    }

    @Override
    public void move(String destination) {
        System.out.println("Das "+art+" mit dem Gewicht "+weight+"g und der Blutgruppe "+bloodType+" wird nach "+destination+" geliefert!");

    }
}
