package Programming2.uebung2003.Collections;

import java.util.HashMap;
import java.util.Map;

public class GenericShop<T>{

    private String name;
    private Map<String,T> products = new HashMap<>();



    /*public void addProductFromDelivery(Del){
        System.out.println(thingToPrint);
    }

     */
    public void showProducts() {
        System.out.println("Welcome to " + name);
        if (products.isEmpty()) {
            System.out.println("Sorry we are sold out");
        } else {
            System.out.println("These are our products:");
            for (String key : products.keySet()) {
                System.out.println(key); //oder auch ("Name: "+key+"Product"+products.get(key))
            }
        }
    }



}
