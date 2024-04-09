package Programming2.UebungsbspAbstrakt.Figures;

public class Rectangle implements Figure {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        double u=2*length +2*width;
        return u;
    }

    @Override
    public double getArea() {
        double f=width*length;
        return f;
    }

}
