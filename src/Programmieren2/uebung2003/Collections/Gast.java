package Programmieren2.uebung2003.Collections;

public class Gast {
    private Key schluessel;
    private int roomNumber;
    private String name;

    public Gast(Key schluessel, int roomNumber, String name) {
        this.schluessel = schluessel;
        this.roomNumber = roomNumber;
        this.name = name;
    }

    public Key getSchluessel() {
        return schluessel;
    }

    public void setSchluessel(Key schluessel) {
        this.schluessel = schluessel;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gast{" +
                "schluessel=" + schluessel +
                ", roomNumber=" + roomNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
