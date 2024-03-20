package Programming2.uebung2003.Generics;

public class Fruit {
    private Color color;
    private String name;
    private double weigth;

    public Fruit(Color color, String name, double weigth) {
        this.color = color;
        this.name = name;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}
