package tij2_ch13.tij2_ch13.ex3;
import static custom_tools.print.Print.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Write code to generate and catch an ArraylndexOutOfBoundsException.
 */
public class Exercise3 {
    public static void main(String[] args) {
        int ints[]=new int[10];
        try{
            print(ints[11]);
        }
        /**
         * (Ex7)Modify Exercise 3 so that the catch clause logs the results
         */
        catch(ArrayIndexOutOfBoundsException e){
            print("Caught IT!!!");
            Logger logger=Logger.getLogger("OutOfBounds");
            StringWriter stringWriter=new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            logger.severe(stringWriter.toString());
        }
    }
}