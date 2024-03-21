package Programming2.uebung2003.Collections;

import java.util.Arrays;

public class KeyRack {
    private int numberOfRooms;
    private Key[] keys;

    public KeyRack(int numberOfRooms, Key[] keys) {
        this.numberOfRooms = numberOfRooms;
        this.keys = keys;
    }


    public void giveKeyToGuest(Gast guest) {
        int roomNumber = guest.getRoomNumber();
        Key key = keys[roomNumber - 1];

        if (key != null) {
            guest.setSchluessel(key);
            key.setBeiGast(true);
            keys[roomNumber -1]=null;
        } else {
            System.out.println("Missing key,alert police!");
        }
    }
    public void takeKeyBackFromGuest(Gast guest){
        Key key= guest.getSchluessel();

        key.setBeiGast(false);
        keys[guest.getRoomNumber()-1] = key;
        guest.setSchluessel(null);
    }

    public void showKeyRack(){
        for(Key key:keys){
            System.out.println(key);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "KeyRack{" +
                "numberOfRooms=" + numberOfRooms +
                ", keys=" + Arrays.toString(keys) +
                '}';
    }
}
