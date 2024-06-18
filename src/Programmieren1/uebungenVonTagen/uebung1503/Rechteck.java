package Programmieren1.uebungenVonTagen.uebung1503;

public class Rechteck {
    private double width;
    private double hight;

    public Rechteck(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public double getBreite() {
        return width;
    }

    public double getHoehe() {
        return hight;
    }

    public void setBreite(double width) {
        this.width = width;
    }

    public void setHoehe(double hight) {
        this.hight = hight;
    }
    public double getArea(){
        return width*hight;
    }
    public double getPerimeter(){
        return (2*(width+hight));
    }

}
