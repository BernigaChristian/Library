package me.berniga.Exceptions;
/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 23/12/2021, giovedì
 **/
public class BookNotFoundException extends Exception{
    private String title;
    public BookNotFoundException(String title){
        this.title=title;
    }

    public String toString(){return "Sorry, there is not the book "+title;}
}
