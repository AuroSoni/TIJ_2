package tij2_ch13.tij2_ch13.ex5;
import static custom_tools.print.Print.*;
import tij2_ch13.tij2_ch13.Naughty;

/**
 * Create your own resumption-like behavior using a while loop that repeats until an exception is no longer thrown. 
 */
public class Exercise5 {
    static int index=10;

    public static void naughtiness() throws Naughty{
        if (index<5) {
            print("Naughtiness in control.");
        } 
        else {
            print("too much naughtiness");
            throw new Naughty();
        }
    }    
    public static void main(String[] args) {
        while (true) {
            try {
                naughtiness();
            } catch (Naughty e) {
                index--;
                continue;
            }
            break;
        }
    }
}