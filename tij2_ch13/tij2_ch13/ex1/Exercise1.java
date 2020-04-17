package  tij2_ch13.tij2_ch13.ex1;
import static custom_tools.print.Print.*;

class Throw {
    public static void main(String[] args)  throws Exception{
        throw new Exception("Exception");
    }
}
/**
 * Create a class with a main( ) that throws an object of class Exception inside a try block. 
 * Give the constructor for Exception a String argument. Catch the exception inside a catch clause
 * and print the String argument. Add a finally clause and print a message to prove you were there.
 */
public class Exercise1{
    public static void main(String[] args){
        try{
            Throw.main(args);
        }
        catch(Exception e){
            print(e.getMessage());
        }
        finally{
            print("Try Catch Example");
        }
    }
}