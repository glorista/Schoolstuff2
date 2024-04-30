package uebungenVonTagen.uebung1403;

public class Haus {
    private double m2pStockwerk;
    private int stockwerke;
    private double preispm2;

    private double garagem2;

    private double kellerm2;


    public Haus(double m2pStockwerk, int stockwerke, double preispm2, double garagem2, double kellerm2) {
        this.m2pStockwerk = m2pStockwerk;
        this.stockwerke = stockwerke;
        this.preispm2 = preispm2;
        this.garagem2 = garagem2;
        this.kellerm2 = kellerm2;
    }

    public double getM2pStockwerk() {
        return m2pStockwerk;
    }

    public int getStockwerke() {
        return stockwerke;
    }

    public double getPreispm2() {
        return preispm2;
    }

    public double getGaragem2() {
        return garagem2;
    }

    public double getKellerm2() {
        return kellerm2;
    }

    public void setM2pStockwerk(double m2pStockwerk) {
        this.m2pStockwerk = m2pStockwerk;
    }

    public void setStockwerke(int stockwerke) {
        this.stockwerke = stockwerke;
    }

    public void setPreispm2(double preispm2) {
        this.preispm2 = preispm2;
    }

    public void setGaragem2(double garagem2) {
        this.garagem2 = garagem2;
    }

    public void setKellerm2(double kellerm2) {
        this.kellerm2 = kellerm2;
    }
    public double wohnFlaeche (){
        return m2pStockwerk*stockwerke*preispm2;
    }
    public double preisgok (){
        if (garagem2 == 0 || kellerm2 ==0){
            return 0;
        }else{
            return wohnFlaeche()*0.4/stockwerke;
        }
    }

    public double gesamtPreis(){
        return preisgok()+preispm2;
    }
}
