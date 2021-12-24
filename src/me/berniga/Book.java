package me.berniga;
/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 23/12/2021, giovedì
 **/
public class Book {
    private String author;
    private String title;
    private String year;
    private String publisher;

    public Book(String author,String title,String year,String publisher){
        this.author=author;
        this.title=title;
        this.year=year;
        this.publisher=publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "author='" + author + '\'' + ", title='" + title + '\'' + ", year='" + year + '\'' + ", publisher='" + publisher + '\'';
    }
}
