package tij2_ch13.tij2_ch13.ex3;
import static custom_tools.print.Print.*;

/**
 * Write code to generate and catch an ArraylndexOutOfBoundsException.
 */
public class Exercise3 {
    public static void main(String[] args) {
        int ints[]=new int[10];
        try{
            print(ints[11]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            print("Caught IT!!!");
            e.printStackTrace();
        }
    }
}