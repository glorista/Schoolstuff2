package Programming2.UebungsbspAbstrakt.Figures;

public class Demo {
    public static void main(String[] args) {
        Circle c = new Circle(59.1);
        Rectangle r = new Rectangle(10,20);
        FigureManager f = new FigureManager();

        f.add(c);
        f.add(r);
        System.out.println("Fläche vom Kreis: "+c.getArea());
        System.out.println("Umfang vom Kreis: "+c.getPerimeter());

        System.out.println("Fläche vom Dreieck: "+r.getArea());
        System.out.println("Umfang vom Dreieck: "+r.getPerimeter());

        System.out.println(f.getAverageSize());
        System.out.println(f.getMaxPerimeter());
        System.out.println(f.getAreaBySizeCategories());
    }
}
