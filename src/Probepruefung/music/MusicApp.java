package Probepruefung.music;

public class MusicApp {

    public static void main(String[] args) {


        Album Vultures1 = new Album(16, 90.6, 364.8);
        System.out.println("Die Average Length of a Song is: "+Vultures1.averageSongLength());
        System.out.println("The Total Length of the Album is :"+Vultures1.totalLength());
        System.out.println(Vultures1.fitsOnMedium(75));

    }

}
