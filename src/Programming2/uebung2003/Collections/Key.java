package Programming2.uebung2003.Collections;

public class Key {
    private int roomNumber;
    private boolean beiGast;

    public Key(int roomName, boolean beiGast) {
        this.roomNumber = roomName;
        this.beiGast = beiGast;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isBeiGast() {
        return beiGast;
    }

    public void setBeiGast(boolean beiGast) {
        this.beiGast = beiGast;
    }

    @Override
    public String toString() {
        return "Key{" +
                "roomNumber=" + roomNumber +
                ", beiGast=" + beiGast +
                '}';
    }
}
