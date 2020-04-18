package tij2_ch13.tij2_ch13.ex21;

import static custom_tools.print.Print.*;

class BaseException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}

class Base{
    Base() throws BaseException{
        print("Creating Base");
        throw new BaseException();
    }
}

/**
 * Demonstrate that a derived-class constructor cannot catch exceptions thrown by its base-class constructor. 
 */
public class Exercise21 extends Base{
    Exercise21() throws BaseException{
        print("Creating Derived");
        // try {
        //     super();   //Constructor call must be the first statement in a constructor
        // }
        // catch(BaseException e){
        //     e.printStackTrace();
        // }
    }
    public static void main(String[] args) {
        try {
            Exercise21 ex21 = new Exercise21();
            print(ex21.toString());
        } catch (BaseException e) {
            e.printStackTrace();
        }
    }
}