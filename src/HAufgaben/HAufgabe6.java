package HAufgaben;

public class HAufgabe6 {
    public static void main(String[] args) {
        Messungen messungen= new Messungen(2);
        messungen.messungAmTag("donnerstag",10.3);
        messungen.messungAmTag("donnerstag",0.3);
        messungen.messungAmTag("montag",7);
        messungen.alleMessungenAmTag("mittwoch",new double[]{12.1,28.4,25.0});
        System.out.println("Der Tagesdurchschnitt am Montag ist: "+messungen.tagesdurchschnitt("montag"));
        System.out.println("Der Tagesdurchschnitt am Mittwoch ist: "+messungen.tagesdurchschnitt("mittwoch"));
        System.out.println("Der Tagesdurchschnitt am Donnerstag ist: "+messungen.tagesdurchschnitt("donnerstag"));
        System.out.println("Der Wochendurchschnittbeträgt: "+messungen.wochenDurchschnitt());


    }
}
