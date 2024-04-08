package Programming2.Vererbung;

public class Dog {

    //können abgeleitete Klassen nicht zugreifen
    private String name;

    //auf protected attribute können abgeleitete Klassen zugreifen
    protected int alter;


    public Dog(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void bellen(String inhalt){
        System.out.println(name + " bellt "+ inhalt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
