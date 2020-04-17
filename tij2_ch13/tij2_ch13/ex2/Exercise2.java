package tij2_ch13.tij2_ch13.ex2;

import static custom_tools.print.Print.*;

/**
 * Define an object reference and initialize it to null. 
 * Try to call a method through this reference. 
 * Now wrap the code in a try-catch clause to catch the exception.  
 */
public class Exercise2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Exercise2 ex2=null;
        try{
            ex2.toString();
        }
        catch(Exception e){
            print("Caught IT!!");
            e.printStackTrace();
        }
    }
}