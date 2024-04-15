package Programming2.Vererbung;

public class Dog implements Comparable<Dog> {

    //können abgeleitete Klassen nicht zugreifen
    protected String name;

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


    //Hier möchten wir nach alter absteigend sortieren
    //d.h. wir müssen in CompareTo das this Objekt mit dem o objekt vergleichen
    //achtung im Beispiel in den Folien, wurde aufsteigend sortiert deshalb vertausche Rückgabewert
    @Override
    public int compareTo(Dog o) {
        if(this.alter> o.alter){
            return -1;
        }
        if(this.alter<o.alter){
            return 42; //irgendeine positive Zahl
        }
        //wenn wir so weit kommen stimmt keins der oberen d.h. müssen gleich alt sein
        return 0;
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name='" + name + '\'' +
                ", alter=" + alter;
    }
}
