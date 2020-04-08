package tij2_ch11.tij2_ch11.ex1;
import static custom_tools.tools.print.Print.print;

class Outer{
    class Inner{
        Inner(){
            print("Inner()");
        }
    }
    Inner inner(){
        return new Inner();
    }
}

/**
 * Write a class named Outer that contains an inner class named Inner. 
 * Add a method to Outer that returns an object of type Inner. 
 * In main( ), create and initialize a reference to an Inner.
 */
public class Exercise1 {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i= o.inner();
        print("i: "+i.toString());
    }
}