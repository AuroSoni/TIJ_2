package tij2_ch13.tij2_ch13.ex10;

import static custom_tools.print.Print.*;
import tij2_ch13.tij2_ch13.Naughty;

class Exc extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}

/**
 * Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define. 
 * In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception 
 * (of a second type that you define). Test your code in main( ).
 */
public class Exercise10 {
    void f() throws Exc {
        try {
            g();
        } catch (Exception e) {
            Exc n=new Exc();
            n.initCause(new Naughty());
            throw n;
        }
    }
    void h(){
        try {
            g();
        } catch (Naughty e) {
            throw new RuntimeException(e);
        }
    }

    void g() throws Naughty {
        throw new Naughty();
    }
    public static void main(String[] args) {
        Exercise10 ex10=new Exercise10();
        try {
            ex10.f();
        } catch (Exception e) {
            print("Cause : " + e.getCause());
            print("Class : " + e.getClass().getSimpleName());
        }
        try {
            ex10.g();
        } catch (Exception e) {
            print("Cause : " + e.getCause());
            print("Class : " + e.getClass().getSimpleName());
        }
        try {
            ex10.h();
        } catch (Exception e) {
            print("Stack Trace : ");
            e.printStackTrace();
        }
    }
}