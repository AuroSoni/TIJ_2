package tij2_ch13.tij2_ch13.ex3;
import static custom_tools.print.Print.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Write code to generate and catch an ArraylndexOutOfBoundsException.
 * 
 * (Ex7)Modify Exercise 3 so that the catch clause logs the results.
 * 
 * (Ex27)Modify Exercise 3 to convert the exception to a RuntimeException. 
 */
public class Exercise3 {
    public static void main(String[] args) {
        int ints[]=new int[10];
        try{
            print("In Exercise3.main()");
            print(ints[11]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            print("Caught IT!!!");
            Logger logger=Logger.getLogger("OutOfBounds");
            StringWriter stringWriter=new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            logger.severe(stringWriter.toString());
            throw new RuntimeException(e);
        }
        finally{
            print("Exiting Exercise3.main()");
        }
    }
}