package Programmieren2.uebung2003.Collections;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCenter {
    public static void main(String[] args) {
        GenericShop<Candy> candyShop = new GenericShop<>("Sweet Point", new HashMap<String, Candy>());
        Map<String, Candy> candies = new HashMap<>();
        candies.put("pinkCandy", new Candy("pink","pinkCandy",2.1,"sour","round"));
        candies.put("redCandy", new Candy("red","redCandy",1.1,"sweet","square"));
        candies.put("greenCandy", new Candy("green","greenCandy",3.1,"sour","round"));
        candies.put("stripedCandy", new Candy("red-white","stripedCandy",2.9,"creamy","heart"));

        DeliveryService<Candy> candyDelivery = new DeliveryService<>(candies);

        candyShop.showProducts();
        candyShop.addProductFromDelivery((HashMap<String, Candy>) candyDelivery.getProductsToDeliver());
        candyShop.showProducts();



    }
}
