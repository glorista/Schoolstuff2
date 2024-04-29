package UebungVergleichen.Ente;

public abstract class Ente implements Comparable<Ente> {
    protected String name;
    protected int gewicht;

    public Ente(String name, int gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }
    public abstract int getFullWeigth();

    public abstract String makeNoise();


    //absteigend
    @Override
    public int compareTo(Ente o) {
        if(this.gewicht< o.gewicht){
            return 1;
        }else if(this.gewicht>o.gewicht){
            return -1;
        }
        return 0;
    }
}
