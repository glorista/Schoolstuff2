package Programmieren2.uebung2003.Collections;

import java.util.HashMap;
import java.util.Map;

public class DeliveryService<T> {
    private Map<String,T> productsToDeliver = new HashMap<>();

    public Map<String, T> getProductsToDeliver() {
        return productsToDeliver;
    }

    public void setProductsToDeliver(Map<String, T> productsToDeliver) {
        this.productsToDeliver = productsToDeliver;
    }

    public DeliveryService(Map<String, T> productsToDeliver) {
        this.productsToDeliver = productsToDeliver;
    }

}
