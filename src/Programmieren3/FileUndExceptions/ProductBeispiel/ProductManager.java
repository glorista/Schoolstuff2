package Programmieren3.FileUndExceptions.ProductBeispiel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public void add(Product p) {
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

//SEINE LÖSUNG mit exceptions
//public class ProductManager {
//    List<Product> productList = new ArrayList<>();
//
//    public void add(Product p) {
//        productList.add(p);
//    }
//
//    public void saveToFile(String filepath) {
//        File file = new File(filepath);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (Product p : productList) {
//                bufferedWriter.write(p.toString());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (bufferedWriter != null) {
//                    bufferedWriter.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        System.out.println("Product Information successfully saved.");
//    }
//
//    public void readFromFile(String filepath) {
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileReader = new FileReader(filepath);
//            bufferedReader = new BufferedReader(fileReader);
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (bufferedReader != null) {
//                    bufferedReader.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Product Information successfully read.");
//    }
//
//
//}

//WITHOUT EXCEPTIONS
//public class ProductManager {
//    List<Product> productList = new ArrayList<>();
//
//    public void add(Product p) {
//        productList.add(p);
//    }
//
//    public void saveToFile(String filepath) throws IOException {
//        File file = new File(filepath);
//        FileWriter fileWriter = new FileWriter(file);
//
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        for (Product p : productList) {
//            bufferedWriter.write(p.toString());
//            bufferedWriter.newLine();
//        }
//        bufferedWriter.flush();
//        bufferedWriter.close();
//
//        System.out.println("Product Information successfully saved.");
//    }
//
//    public void readFromFile(String filepath) throws IOException {
//
//        FileReader fileReader = new FileReader(filepath);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        System.out.println("Product Information successfully read.");
//    }
