package HAufgaben;

public class Unterkunft {

    private int bettenProStockwerk;
    private int stockwerke;
    private String typ;
    private int anzahlBesetzt;

    public Unterkunft(int bettenProStockwerk, int stockwerke, String typ) {
        this.bettenProStockwerk = bettenProStockwerk;
        this.stockwerke = stockwerke;
        this.typ = typ;
        this.anzahlBesetzt = 0;
    }

    public double preisProBett(){
        switch(typ.toLowerCase()){
            case "luxus":
                return 105.4;
            case "standard":
                return 57.5;
            case "lowcost":
                return 25;
            default:
                return -1;
        }
    }

    public double preisProUnterkunft(){
        return bettenProStockwerk*stockwerke*preisProBett();
    }

    public double preisProBuchung(int betten){
        /* if (betten> freieBetten()){
            return -1;
        } else{

         */
            return betten*preisProBett();
    }

    public int freieBetten(){
        return bettenProStockwerk*stockwerke-anzahlBesetzt;
    }

    public void bucheBetten (int betten){
        if (betten> freieBetten()){
            System.out.println("Es gibt leider nicht genügend Betten");
        } else{
            anzahlBesetzt= anzahlBesetzt+betten;
            System.out.println("Es wurden erfolgreich: "+betten+" gebucht");
        }
    }

    public void ausgebucht(){
        if (anzahlBesetzt>bettenProStockwerk*stockwerke) {
            System.out.println("Die Unterkunft ist komplett ausgebucht");
        }
    }

    @Override
    public String toString() {
        return "Unterkunft{" +
                "bettenProStockwerk=" + bettenProStockwerk +
                ", stockwerke=" + stockwerke +
                ", typ='" + typ + '\'' +
                ", anzahlBesetzt=" + anzahlBesetzt +
                '}';
    }
}
