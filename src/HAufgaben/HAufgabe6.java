package HAufgaben;

public class HAufgabe6 {
    public static void main(String[] args) {
        Messungen messungen= new Messungen(2);
        messungen.messungAmTag("donnerstag",10.3);
        messungen.messungAmTag("donnerstag",0.3);
        messungen.messungAmTag("montag",7);

    }
}
