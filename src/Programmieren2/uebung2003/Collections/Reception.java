package Programmieren2.uebung2003.Collections;

public class Reception {
    public static void main(String[] args) {
        Key key1 = new Key(1,false);
        Key key2 = new Key(2,false);
        Key key3 = new Key(3,false);
        Key key4 = new Key(4,false);
        Key key5 = new Key(5,false);

        Key[] keys = new Key[] {key1,key2,key3,key4,key5};
        KeyRack keyRack = new KeyRack(5,keys);
        keyRack.showKeyRack();

        Gast gast1 = new Gast(null,3,"Allen Walker");
        keyRack.giveKeyToGuest(gast1);

        keyRack.showKeyRack();

    }
}
