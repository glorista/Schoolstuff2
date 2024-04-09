package Programming2.UebungsbspAbstrakt.Figures;

public class Circle implements Figure{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double u=2*Math.PI*radius;
        return u;
    }

    @Override
    public double getArea() {
        double f=Math.PI*Math.pow(radius,2);
        return f;
    }
}
