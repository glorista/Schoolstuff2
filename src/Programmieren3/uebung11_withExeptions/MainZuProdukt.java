package Programmieren3.uebung11_withExeptions;

import Programmieren3.uebung11.Product;
import Programmieren3.uebung11.ProductManager;

import java.io.IOException;

public class MainZuProdukt {

    public static void main(String[] args) {
        Programmieren3.uebung11.Product p1 = new Programmieren3.uebung11.Product("name1",10.10,"Category1");
        Programmieren3.uebung11.Product p2 = new Programmieren3.uebung11.Product("name2",20.10,"Category2");
        Programmieren3.uebung11.Product p3 = new Product("name3",30.10,"Category3");

        Programmieren3.uebung11.ProductManager pm = new ProductManager();
        pm.add(p1);
        pm.add(p2);
        pm.add(p3);

        try {

            pm.saveToFile("C:\\Users\\s54821\\Hallo1\\text3.txt");
            pm.readFromFile("C:\\Users\\s54821\\Hallo1\\text3.txt");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
