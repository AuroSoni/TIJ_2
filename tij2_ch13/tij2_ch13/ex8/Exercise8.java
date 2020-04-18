package tij2_ch13.tij2_ch13.ex8;

import static custom_tools.print.Print.*;
import tij2_ch13.tij2_ch13.Naughty;

public class Exercise8 {

    static int index=0; 

    public static void mischief() {
        print("This is what happens when you are NAUGHTY!!!");
        if(index==0)
            try {
                throw new Naughty();
            } catch (Naughty e) {
                e.printStackTrace();
            }
    }
    
    public String toString() {        //Apparently no effect
        return "Naughtiness handler";
    }

    public static void main(String[] args) throws Naughty {
        print("Doing Mischief");
        mischief();
    }
}