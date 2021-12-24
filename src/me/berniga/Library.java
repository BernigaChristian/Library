package me.berniga;
import me.berniga.Exceptions.*;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 23/12/2021, giovedì
 **/
public class Library {
    private static final int MAX_BOOKS=1000;
    private Book[] books;

    public Library(){
        books=new Book[MAX_BOOKS];
    }

    private int firstFree() throws FullLibraryException{
        for(int i=0;i< books.length;i++)
            if(books[i]==null)  return i;
        throw new FullLibraryException();
    }

    public void addBook(Book b) throws FullLibraryException {
        books[firstFree()]=b;
    }

    public String getBook(String title)    throws BookNotFoundException{
        for(Book b:books)
            if(b!=null&&title.equalsIgnoreCase(b.getTitle()))   return b.toString();
        throw new BookNotFoundException(title);
    }

    public String getBooksOfAnAuthor(String author) throws AuthorBooksNotFoundException {
        String authorBooks="";
        for(Book b:books)
            if(b!=null&&author.equalsIgnoreCase(b.getAuthor()))
                authorBooks+=(b.toString()+"\n");
        if(!authorBooks.equalsIgnoreCase(""))
            return authorBooks;
        throw new AuthorBooksNotFoundException(author);
    }

    public int booksAmount(){
        int i=0;
        for(Book b:books)
            if(b!=null) i++;
        return i;
    }
}
