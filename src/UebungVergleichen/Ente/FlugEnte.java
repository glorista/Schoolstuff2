package UebungVergleichen.Ente;

public class FlugEnte extends Ente{

    protected int gewichtFedern;

    public FlugEnte(String name, int gewicht, int gewichtFedern) {
        super(name, gewicht);
        this.gewichtFedern = gewichtFedern;
    }

    @Override
    public int getFullWeigth() {
        return gewicht+gewichtFedern;
    }

    @Override
    public String makeNoise() {
        return "Ich bin eine Flugente";
    }

    @Override
    public String toString() {
        return "FlugEnte{" +
                "gewichtFedern=" + gewichtFedern +
                ", name='" + name + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}
