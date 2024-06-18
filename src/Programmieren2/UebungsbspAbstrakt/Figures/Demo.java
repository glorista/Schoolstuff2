package Programmieren2.UebungsbspAbstrakt.Figures;

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

        System.out.println(f.getAreaBySizeCategories());
        System.out.println("---------");

        Circle c2 = new Circle(98.45);
        Rectangle r2  = new Rectangle(12,42);

        f.add(c2);
        f.add(r2);
        System.out.println("Fläche vom Kreis: "+c2.getArea());
        System.out.println("Umfang vom Kreis: "+c2.getPerimeter());

        System.out.println("Fläche vom Dreieck: "+r2.getArea());
        System.out.println("Umfang vom Dreieck: "+r2.getPerimeter());


        System.out.println(f.getAverageSize());
        System.out.println(f.getMaxPerimeter());
        System.out.println(f.getAreaBySizeCategories());
    }
}
