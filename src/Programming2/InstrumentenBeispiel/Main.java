package Programming2.InstrumentenBeispiel;

public class Main {
    public static void main(String[] args) {
        Gitarre g = new Gitarre(20);
        Trompete t = new Trompete(80);
        Pauke p = new Pauke(60);
        Orchester o = new Orchester();
        o.addInstrument(g);
        o.addInstrument(t);
        o.addInstrument(p);
        o.playAll();
        g
    }
}
