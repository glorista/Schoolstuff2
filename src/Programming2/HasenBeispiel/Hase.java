package Programming2.HasenBeispiel;

public class Hase {
    protected String name;

    public Hase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void schlafen(){
        System.out.println(name + " ist jetzt am schlafen");
    }

    public void hoppeln(){
        System.out.println(name+ " hoppelt jetzt davon");
    }

    public void fressen(String essen){
        System.out.println(name + " isst jetzt "+ essen + ".");
    }
}
