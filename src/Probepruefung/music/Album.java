package Probepruefung.music;

public class Album {
    private int nrsongs;
    private double shortestSongLengthInSec;
    private double longestSongInSec;

    public Album(int nrsongs, double shortestSongLengthInSec, double longestSongInSec) {
        this.nrsongs = nrsongs;
        this.shortestSongLengthInSec = shortestSongLengthInSec;
        this.longestSongInSec = longestSongInSec;
    }

    public double averageSongLength(){
        return (longestSongInSec+shortestSongLengthInSec)/2;
    }
    public double totalLength(){
        return averageSongLength()*nrsongs;
    }

    public boolean fitsOnMedium(int minutes){
        if(totalLength()/60<=minutes){
            return true;
        }else{
            return false;
        }
    }
}
