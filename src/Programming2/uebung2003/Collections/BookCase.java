package Programming2.uebung2003.Collections;

import java.util.ArrayList;
import java.util.List;

public class BookCase {
    List<Book> books = new ArrayList<>(); //new ArrayList nicht zwingend notwendig da schon eine Liste erstellt wurde und somit eine leere Liste erstellt wird

    public void addBook(Book book){
        books.add(book);
    }

    public void showReadBooks(){
        for (Book b: books){
            if(b.isFinished()){
                System.out.println(b.getTitle());
            }
        }
    }

    public void showUnreadBooks(){
        for(Book b: books){
            if(!b.isFinished()){
                System.out.println(b.getTitle());
            }
        }
    }


}
