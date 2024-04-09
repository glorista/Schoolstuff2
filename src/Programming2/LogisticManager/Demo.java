package Programming2.LogisticManager;

public class Demo {
    public static void main(String[] args) {
        Car c = new Car("VW Golf","blue",3695.45);
        Shirt s = new Shirt("Peso","XL","black");
        LogisticManager l = new LogisticManager();
        c.move("Graz");
        s.move("Berlin");
        l.addObjects(c);
        l.addObjects(s);
        l.moveAll("New York");
        Organe o = new Organe("Herz",45.2,"B-");
        l.addObjects(o);
        System.out.println("--------");
        o.move("Wien");


    }
}
