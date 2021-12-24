package me.berniga.Exceptions;
/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 23/12/2021, giovedì
 **/
public class FullLibraryException extends Exception{
    public FullLibraryException(){super();}

    public String toString(){return "Sorry, the library is full";}
}
