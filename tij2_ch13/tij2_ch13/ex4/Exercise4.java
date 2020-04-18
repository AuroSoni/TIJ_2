package tij2_ch13.tij2_ch13.ex4;

import static custom_tools.print.Print.*;

import tij2_ch13.tij2_ch13.Naughty;


/**
 * Create your own exception class using the extends keyword. 
 * Write a constructor for this class that takes a String argument and stores 
 * it inside the object with a String reference. Write a method that displays
 * the stored String. Create a try-catch clause to exercise your new exception.  
 */
public class Exercise4 {

    static int index=0; 

    public static void mischief() throws Naughty {
        print("This is what happens when you are NAUGHTY!!!");
        if(index==0) throw new Naughty();
    }
    
    public String toString() {        //Apparently no effect
        return "Naughtiness handler";
    }

    public static void main(String[] args) {
        try {
            print("Doing Mischief");
            mischief();
        } 
        catch (Naughty e) {
            print("Haha");
            print(e.toString());
            e.printStackTrace();
        }
    }
}