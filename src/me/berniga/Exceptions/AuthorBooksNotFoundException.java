package me.berniga.Exceptions;
/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 23/12/2021, giovedì
 **/
public class AuthorBooksNotFoundException extends Exception{
    private String author;
    public AuthorBooksNotFoundException(String author){
        this.author=author;
    }

    public String toString(){return "Sorry, there are no books of "+author;}
}
