package tij2_ch13.tij2_ch13;

import static custom_tools.print.Print.*;

class CustomException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
}

/**
 *(Ex28)Modify Exercise 4 so that the custom exception class inherits from RuntimeException, 
 * and show that the compiler allows you to leave out the try block.
 */
public class Exercise28 {

    static int index=0; 

    public static void mischief() throws CustomException {
        print("This is what happens when you are NAUGHTY!!!");
        if(index==0) throw new CustomException();
    }

    public static void main(String[] args) {
            print("Doing Mischief");
            mischief();
    }
}