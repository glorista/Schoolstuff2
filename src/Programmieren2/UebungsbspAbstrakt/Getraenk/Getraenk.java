package Programmieren2.UebungsbspAbstrakt.Getraenk;

public abstract class Getraenk implements Brennbar{
    protected String name;

    public Getraenk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Getraenk{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract int getAnzahlZutaten();

    public abstract boolean beinhaltetAlkohol();
    public abstract double mengeInMl();



}
