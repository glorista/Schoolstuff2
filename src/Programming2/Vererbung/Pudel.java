package Programming2.Vererbung;

public class Pudel extends Dog {

    private String lieblingsEssen;

    public Pudel(String name, int alter, String lieblingsEssen) {
        super(name, alter); // durch super wird der Konstruktor der basis Klasse mitübergeben/aufgerufen
        this.lieblingsEssen = lieblingsEssen;
    }


    public void isstBeilage(String beilage){
        //name private daher getter, protecter(hier zb alter) kann ohne getter verwendet werden
        System.out.println(getName()+ "("+alter+") isst "+lieblingsEssen+" Beilage: "+beilage);
    }

    public String getLieblingsEssen() {
        return lieblingsEssen;
    }

    public void setLieblingsEssen(String lieblingsEssen) {
        this.lieblingsEssen = lieblingsEssen;
    }
}
