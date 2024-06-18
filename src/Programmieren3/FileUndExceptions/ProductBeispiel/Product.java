package Programmieren3.FileUndExceptions.ProductBeispiel;

public class Product { //uebung11
    //Schreiben Sie eine Klasse Product zur Abbildung von
    //Produkten mit folgenden Attributen.
    //▪ String ProductName
    //▪ Double Price
    //▪ String ProductCategory
    //Schreiben Sie eine Klasse ProductManager zum Verwalten
    //von Produkten in einer privaten Liste und implementieren
    //Sie folgende Methoden
    //▪ public void add(Product p) ➔ fügt ein Produkt hinzu
    //▪ public void saveToFile(String path) ➔ speichert die Produkte in der
    //übergebenen Datei. - Realisieren Sie dies mittels BufferedWriter und
    //Filewriter.
    //▪ public void readFromFile(String path) ➔ laden Sie den Text von der
    //übergebenen Datei und geben Sie den Text auf der Konsole aus

    protected String productName;
    protected double price;
    protected String productCategory;

    public Product(String productName, double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}
