package Programmieren2.UebungVergleichen.Ente;

public class MainZuEnte {
    public static void main(String[] args) {
        BadeEnte b1 = new BadeEnte("Blubb",10,200);
        BadeEnte b2 = new BadeEnte("Bambi",200,100);
        FlugEnte f1 = new FlugEnte("Flieger",120,20);
        EntenHausen eh = new EntenHausen();
        eh.addEnte(b1);
        eh.addEnte(b2);
        eh.addEnte(f1);

        System.out.println(eh.getGruppierteEnten());

    }
}
