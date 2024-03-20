package Programming2.uebung2003.Collections;

import java.util.ArrayList;
import java.util.List;

public class MainZuBook {
    public static void main(String[] args) {

        List<Book> buchListe = new ArrayList<>();
        buchListe.add(new Book("Das Haus am See",true,4));
        buchListe.add(new Book("Karma ist dein bester Freund",true,5));
        buchListe.add(new Book("Foltern für Anfänger",false,3));
        buchListe.add(new Book("Halt dich zurück",false,1));
        buchListe.add(new Book("Der Hund",false,0));

        BookCase bc = new BookCase();

//        for (Book b: buchListe){
//            System.out.println(b);
//        }

        bc.books.addAll(buchListe);

        for (Book b: bc.books){
            System.out.println(b);
        }

        System.out.println();

        System.out.println("Das sind alle Bücher die du noch nicht gelesen hast:");
        bc.showUnreadBooks();

        System.out.println();

        System.out.println("Das sind alle Bücher die du schon gelesen hast:");
        bc.showReadBooks();



    }
}
