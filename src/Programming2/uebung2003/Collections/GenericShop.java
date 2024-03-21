package Programming2.uebung2003.Collections;

import java.util.HashMap;
import java.util.Map;

public class GenericShop<T> {

    private String name;
    private Map<String, T> products = new HashMap<>();


    public GenericShop(String name, HashMap<String, T> products) {
        this.name = name;
        this.products = products;
    }

    public void addProductFromDelivery(HashMap<String, T> deliveredProducts) {
        products.putAll(deliveredProducts);
        deliveredProducts.clear();
    }


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

    public void sellAProduct(String productName) {
        products.remove(productName);
    }


}
