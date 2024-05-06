package Programmieren3.uebung11;

import java.io.IOException;

public class MainZuProdukt {

    public static void main(String[] args) throws IOException {
        Product p1 = new Product("name1",10.10,"Category1");
        Product p2 = new Product("name2",20.10,"Category2");
        Product p3 = new Product("name3",30.10,"Category3");

        ProductManager pm = new ProductManager();
        pm.add(p1);
        pm.add(p2);
        pm.add(p3);

        pm.saveToFile("C:\\Users\\s54821\\Hallo1\\text3.txt");
        pm.readFromFile("C:\\Users\\s54821\\Hallo1\\text3.txt");


    }
}
