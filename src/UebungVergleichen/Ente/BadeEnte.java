package UebungVergleichen.Ente;

public class BadeEnte extends Ente{
    protected int gewichtWasser;

    public BadeEnte(String name, int gewicht, int gewichtWasser) {
        super(name, gewicht);
        this.gewichtWasser = gewichtWasser;
    }

    @Override
    public int getFullWeigth() {
        return gewicht+gewichtWasser;
    }

    @Override
    public String makeNoise() {
        return "Ich bin eine Badeente";
    }

    @Override
    public String toString() {
        return "BadeEnte{" +
                "gewichtWasser=" + gewichtWasser +
                ", name='" + name + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}
