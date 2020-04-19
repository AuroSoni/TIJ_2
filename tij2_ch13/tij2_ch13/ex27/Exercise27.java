package tij2_ch13.tij2_ch13.ex27;

import tij2_ch13.tij2_ch13.ex3.Exercise3;
import static custom_tools.print.Print.*;

/**
 * (Ex27)Modify Exercise 3 to convert the exception to a RuntimeException.
 */
public class Exercise27 {
    public static void main(String[] args) {
        try {
            print("In Exercise27.main()");
            Exercise3.main(args);
        } catch (RuntimeException e) {
            try{
                print("In Exercise27.main()");
                throw e.getCause();
            }
            catch(ArrayIndexOutOfBoundsException f){
                f.printStackTrace();
            }
            catch(Throwable f){
                f.printStackTrace();
            }
        }
    }
}