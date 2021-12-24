package me.berniga;
import me.berniga.Exceptions.*;
/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 23/12/2021, giovedì
 **/
public class Main {
    public static void main(String[] args) {
        Library l=new Library();
        try{
            l.addBook(new Book("author 1","title 1","1","publisher 1"));
        }catch(FullLibraryException e){
            System.out.println(e);
        }
        try{
            System.out.println(l.getBook("title 1"));
        }catch(BookNotFoundException e){
            System.out.println(e);
        }
        try{
            System.out.println(l.getBooksOfAnAuthor("author 2"));
        }catch(AuthorBooksNotFoundException e){
            System.out.println(e);
        }
    }
}
