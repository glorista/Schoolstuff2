package Programmieren2.uebung2003.Collections;

public class Book {
    private String title;
    private boolean isFinished;
    private int stars;

    public Book(String title, boolean isFinished, int stars) {
        this.title = title;
        this.isFinished = isFinished;
        this.stars = stars;
    }

    public String getTitle() {
        return title;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return "Book: " +"'"+ title +"'"+ ", bereits gelesen: " + isFinished+ ", mit " + stars + " Sternen";
    }
}
