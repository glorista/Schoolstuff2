package Programmieren3.ProductBeispielWithExeptions;

import Programmieren3.FileUndExceptions.ProductBeispiel.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Programmieren3.FileUndExceptions.ProductBeispiel.Product> products = new ArrayList<>();

    public void add(Programmieren3.FileUndExceptions.ProductBeispiel.Product p) {
        //if (!products.contains(p)) {
            products.add(p);
        //}
    }

    public void saveToFile(String path) throws IOException {
        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        for(Product p : products){
            bw.write(p.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
        System.out.println("File: "+ path +" successfully written");
    }

    /*public void saveToFile(String path) {

        BufferedWriter bw = null;
        try {
            File f = new File(path);
            FileWriter fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (Product p : products) {
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.print...
        } finally {
            try {
                bw.flush();
                bw.close();
                System.out.println("File: " + path + " successfully written");
            } catch (IOException e) {
                e.print...
                sout(Fehler bei flush oder close)
            }
        }

     */

    public void readFromFile(String path) throws IOException {
        File f = new File(path);
        FileReader fileReader= new FileReader(f);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        while((line= bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }



    @Override
    public String toString() {
        return "ProductManager{" +
                "products=" + products +
                '}';
    }
}



