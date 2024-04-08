package Programming2.Vererbung;

public class Cat {
    private String name;


    //default construktor ist automatisch da solange kein anderer generiert wird
    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
