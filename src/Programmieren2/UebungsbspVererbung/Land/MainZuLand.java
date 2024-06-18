package Programmieren2.UebungsbspVererbung.Land;

public class MainZuLand {
    public static void main(String[] args) {
        Bundesstaat bs = new Bundesstaat();
        Bundesland bl = new Bundesland(225.3);
        Bundesland bl2 = new Bundesland(148.36);

        bs.addLand(bl);
        bs.addLand(bl2);

        System.out.println(bs.getBruttoSozialProduct());

    }
}
