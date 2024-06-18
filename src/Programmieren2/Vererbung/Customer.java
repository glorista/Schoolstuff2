package Programmieren2.Vererbung;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;

    private ArrayList<Address> addresses = new ArrayList<>();



    public Customer(String firstName, String lastName, int customerNumber) {
        super(firstName, lastName);
        this.customerNumber = customerNumber;
    }

    public void addAddress(Address ad){
        addresses.add(ad);
    }

    @Override
    public String toString() {
        return "Customer{" + getFirstName() +" "+ getLastName()+
                " customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                '}';
    }
}
